# 🧵 Lv.16 - CompletableFuture 병렬 조합 실습: 비동기 흐름 통합 처리

---

## ✅ 학습 목표

- Java의 `CompletableFuture`를 사용해 **비동기 작업의 조합, 결과 수집, 예외 처리**를 구현한다.
- 여러 비동기 로직을 병렬로 수행하고, **합성하여 최종 결과를 만드는 구조**를 설계한다.
- Spring Service Layer 내에서 `CompletableFuture`를 실용적으로 활용한다.

---

## 🤔 왜 이걸 배워야 할까?

실무에서는 다음과 같은 작업이 자주 발생한다:

- **여러 외부 API 호출 결과를 조합**
- **복수의 계산 작업을 동시에 처리**
- **하나라도 실패하면 전체 실패 or 대체 처리**

이런 구조를 효율적으로 처리하려면 **CompletableFuture 조합**을 알아야 한다.  
단순 `@Async`가 아니라, **병렬 실행 + 결과 집계 + 예외 처리까지 통합**해야 실전이다.

---

## 📌 과제 요구사항

1. `ArticleService`를 만들고, 3개 외부 뉴스 API (`api1`, `api2`, `api3`) 호출을 `CompletableFuture`로 병렬 실행
2. 각 API는 1초 sleep 후 제목을 리턴하는 방식으로 구성
3. 모든 호출이 성공하면 **결과를 모아 리스트로 반환**
4. 하나라도 실패하면 “뉴스 수집 실패”로 대체 응답 처리

---

## ✨ 보너스 미션 (선택)

- `thenCombine()`, `thenCompose()` 사용 실습
- `CompletableFuture.allOf()`와 `anyOf()`의 차이 실험
- 병렬 실행 시간 vs 순차 실행 시간 로그로 비교

---

## 📚 참고 개념 키워드

- `CompletableFuture.supplyAsync()`
- `thenApply()`, `thenCompose()`, `thenCombine()`
- `exceptionally()`, `handle()`
- `allOf()` → 결과 수집 트릭
- 병렬 처리 & 결과 통합

---

## 💬 예상 질문 (생각 정리용)

- `thenCompose()`와 `thenCombine()`의 차이는 뭘까?
- 하나의 실패가 전체 흐름에 어떤 영향을 미칠 수 있을까?
- `CompletableFuture`를 Spring에선 어떻게 더 잘 쓸 수 있을까?

---

## 🛠️ 참고자료

- [Baeldung - CompletableFuture Guide](https://www.baeldung.com/java-completablefuture)
- [Java Docs - CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)
- [Baeldung - CompletableFuture vs Future](https://www.baeldung.com/java-completablefuture-vs-future)

---

> 이번 과제는 단순 비동기 호출이 아니라,  
> **"동시 실행 + 결과 병합 + 예외 보완 처리"** 전 과정을 통합적으로 다루는 고급 과제다.  

> 이걸 제대로 익히면, 진짜 어떤 복잡한 흐름도 “우아하게” 만들 수 있다 😎
