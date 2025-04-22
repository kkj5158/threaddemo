# 🧵 Lv.19 - Event Sourcing + CQRS 실전 입문: 이벤트로 시스템을 재현하라

---

## ✅ 학습 목표

- `Event Sourcing`의 개념을 이해하고, **상태 대신 이벤트를 저장하는 방식**을 체득한다.
- `CQRS` 패턴을 적용하여 **명령(Command)과 조회(Query)를 완전히 분리**하는 설계를 실습한다.
- Kafka, Redis, 또는 단순 Event Store를 이용해 **이벤트 기반 상태 구성**을 구현한다.

---

## 🤔 왜 이걸 배워야 할까?

대부분의 시스템은 상태(state)를 저장한다.  
하지만 실무에선 이런 요구가 많다:

- "이 주문은 왜 이런 상태가 되었나요?"
- "5분 전 상태로 되돌릴 수 있을까요?"
- "상태가 아니라 과정 전체가 필요해요."

이런 문제의 해결책이 바로 **Event Sourcing + CQRS**  
> 모든 상태 전이는 이벤트로 기록되고,  
> 상태는 **이벤트를 순차적으로 재생**함으로써 구성된다.

---

## 📌 과제 요구사항

1. 주문 도메인을 기준으로 `OrderCreated`, `OrderPaid`, `OrderCancelled` 이벤트를 정의하라
2. 사용자가 행동할 때마다 이벤트를 DB 또는 Kafka에 기록
3. 별도의 Projection 서비스에서 이벤트를 읽고, 현재 상태를 구성 (e.g. Redis, In-Memory, DB)
4. `/orders/{id}` 조회 시, Projection의 상태를 리턴하도록 구성

---

## ✨ 보너스 미션 (선택)

- Kafka를 Event Store로 활용하여 Topic 기반 상태 재구성
- 이벤트 재생 API 구현: 특정 주문의 이벤트 히스토리 리턴
- "Rollback to previous state" 기능 구현

---

## 📚 참고 개념 키워드

- Event Sourcing
- CQRS (Command Query Responsibility Segregation)
- Event Store
- Projection / Read Model
- Snapshotting

---

## 💬 예상 질문 (생각 정리용)

- 상태 대신 이벤트를 저장하는 건 왜 유리할까?
- 조회 성능은 어떻게 보장할 수 있을까?
- Projection은 어떻게 복구할 수 있을까?

---

## 🛠️ 참고자료

- [microservices.io - Event Sourcing Pattern](https://microservices.io/patterns/data/event-sourcing.html)
- [CQRS & Event Sourcing - Martin Fowler](https://martinfowler.com/bliki/CQRS.html)
- [Axon Framework - Event Sourcing in Java](https://docs.axoniq.io/axon-framework/)

---

> 이번 과제는 “데이터 중심”이 아니라 “이벤트 중심”의 사고방식을 체득
