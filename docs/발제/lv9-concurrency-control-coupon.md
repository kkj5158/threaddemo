# 🧵 Lv.9 - 실전 동시성 제어: 쿠폰 선착순 지급 시스템

---

## ✅ 학습 목표

- 동시에 요청이 들어올 때 발생할 수 있는 **Race Condition** 을 실전에서 직접 재현한다.
- **동시성 제어 방식**(synchronized, DB Lock, Redis Lock 등)을 비교해보고 성능과 안정성을 검토한다.
- **멀티 인스턴스 환경**에서도 안전하게 동작하는 구조의 필요성을 체감한다.

---

## 🤔 왜 이걸 배워야 할까?

실무에선 “동시에 수많은 유저가 쿠폰을 받으려 하는” 상황이 실제로 자주 발생한다.

- 어떤 유저는 쿠폰을 2번 받음
- 총 수량 100개인데 102개가 발급됨
- 트랜잭션은 성공했지만 실제로는 중복/오류 발생

이런 문제는 단순히 `if (count > 0) then { count-- }` 로 해결되지 않는다.

이 과제에서는 **정말로 문제를 유발**해보고,  
**3가지 방식**으로 하나하나 해결해나가며 **실전 감각**을 익힌다.

---

## 📌 과제 요구사항

1. 쿠폰을 발급하는 API를 만들고, 총 발급 수량을 DB에 저장한다
2. 동시에 100명의 사용자가 요청을 보내는 테스트를 작성하여, 중복 지급 문제를 재현한다
3. 아래 3가지 방식으로 동시성 문제를 해결해보라:

   - (1) `synchronized` 키워드
   - (2) DB의 `PESSIMISTIC_LOCK` or `OPTIMISTIC_LOCK`
   - (3) Redis 기반 분산락 (e.g. Redisson, Lua 스크립트)

4. 각 방식의 문제점 및 특징을 비교하고 결과를 로그로 출력하라

---

## ✨ 보너스 미션 (선택)

- 테스트 자동화: 100명 유저 요청을 `ExecutorService + CountDownLatch` 로 구성
- Spring AOP로 Lock 처리 분리
- Redis Lock 구현 시, 재진입 불가능 락 vs 가능 락 차이 분석

---

## 📚 참고 개념 키워드

- Race Condition
- PESSIMISTIC / OPTIMISTIC LOCK
- Distributed Lock
- Redisson
- CountDownLatch, ExecutorService

---

## 💬 예상 질문 (생각 정리용)

- 왜 synchronized만으로는 충분하지 않을까?
- DB Lock은 트래픽이 많을 때 어떤 부하가 생길까?
- 분산 락의 진짜 위험 요소는 무엇인가?

---

## 🛠️ 참고자료

- [Baeldung - Pessimistic and Optimistic Locking](https://www.baeldung.com/jpa-locking)
- [Redisson 공식 문서 - 분산 락](https://github.com/redisson/redisson/wiki/8.-distributed-locks)
- [Spring Data JPA Docs - LockModeType](https://docs.spring.io/spring-data/jpa/docs/current/api/org/springframework/data/jpa/repository/Lock.html)

---

> 이번 과제는 "실무에서 진짜 발생하는 장애를 사전에 막기 위한 방어 설계"다.  
> **“어떻게 하면 안전하게 동시에 요청을 처리할 수 있을까?”**를 고민하는 엔지니어의 첫 관문이기도 하다.
