# 🧵 Lv.10 - 스케줄링 + 비동기 통합: 일일 자동 정산 시스템

---

## ✅ 학습 목표

- `@Scheduled`를 사용해 **일정 주기마다 실행되는 배치 작업**을 구현한다.
- `@Async` 및 `Executor`를 함께 사용하여 **정산 작업을 병렬로 처리**한다.
- 전체 스케줄 → 병렬 처리 → 결과 집계까지의 흐름을 **자동화된 구조로 통합**한다.

---

## 🤔 왜 이걸 배워야 할까?

실무에서는 아래와 같은 정기 작업이 정말 많다:

- 매일 자정에 정산을 실행한다
- 유저 포인트를 적립하거나 차감한다
- 완료된 주문을 집계한다
- 보고서를 생성하여 관리자에게 이메일로 전송한다

이때 단일 쓰레드로 처리하면 성능 저하, 지연, 병목 문제가 생길 수 있다.  
그래서 **스케줄링된 작업을 병렬로 나누고, 결과를 통합**하는 구조가 중요하다.

이번 과제는 이 전체 구조를 **스프링 기반에서 실전처럼 구현**해보는 것이다.

---

## 📌 과제 요구사항

1. `@Scheduled(cron = "0 0 0 * * *")` 을 활용해 자정마다 실행되는 스케줄러 구현
2. 사용자 리스트를 불러와 각 사용자마다 정산 로직을 병렬로 처리 (예: `@Async` + `Executor`)
3. 정산 작업 결과는 `CompletableFuture<Integer>` 로 수집하여, 전체 합계를 계산
4. 정산 결과를 로그에 출력하거나 DB에 저장

---

## ✨ 보너스 미션 (선택)

- `CompletableFuture.allOf()` 활용해 모든 작업 완료 후 후속 처리 실행
- 정산 작업이 실패한 유저 목록 로깅
- Spring Batch를 활용한 대안 구조 설계

---

## 📚 참고 개념 키워드

- `@Scheduled`, `cron 표현식`
- `@Async` + `Executor`
- `CompletableFuture`
- 정산 로직 분산 처리
- 병렬 결과 수집 및 집계

---

## 💬 예상 질문 (생각 정리용)

- 병렬 처리 중 하나라도 실패하면 전체 흐름은 어떻게 처리할까?
- 모든 사용자에게 동일한 Executor를 쓰는 것이 최선일까?
- 정산 결과를 트랜잭션으로 묶어야 할까?

---

## 🛠️ 참고자료

- [Spring Docs - Scheduling Tasks](https://docs.spring.io/spring-framework/reference/integration/scheduling.html#scheduling-annotation-support)
- [Baeldung - Spring Scheduled Tasks](https://www.baeldung.com/spring-scheduled-tasks)
- [Baeldung - CompletableFuture Tutorial](https://www.baeldung.com/java-completablefuture)

---

> 이 과제는 “현실적인, 자동화된, 안정적인 병렬 처리”의 종합 연습이다.  
> **지속 가능하고 확장 가능한 구조를 직접 구현**하는 마지막 퍼즐을 완성하자 💪
