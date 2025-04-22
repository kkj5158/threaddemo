# 🧵 Lv.18 - Kafka 기반 Saga Pattern: 분산 트랜잭션 복구 흐름 설계

---

## ✅ 학습 목표

- Saga Pattern을 사용해 **여러 마이크로서비스 간의 트랜잭션을 비동기로 연결**하는 구조를 이해한다.
- Kafka를 기반으로 각 단계의 상태 전이를 **이벤트 흐름**으로 구현한다.
- 실패 시 **보상 트랜잭션(Compensation)** 을 통해 전체 트랜잭션 복구 흐름을 설계한다.

---

## 🤔 왜 이걸 배워야 할까?

기존의 트랜잭션은 DB 하나 안에서만 유효하다.  
하지만 MSA 환경에선 다음과 같은 시나리오가 자주 발생한다:

- 주문 생성 → 결제 승인 → 재고 차감 → 정산 완료  
이 모든 게 다른 서비스일 경우, 중간 하나라도 실패하면 **전체 트랜잭션이 깨진다.**

> ✅ 그래서 필요한 것이: **Saga Pattern**

각 서비스는 **상태 전이를 이벤트로 기록하고**,  
실패 시에는 **보상 트랜잭션을 비동기로 수행**하여 **데이터 일관성을 회복**한다.

---

## 📌 과제 요구사항

1. 주문 요청이 들어오면 Kafka Topic에 `"order-created"` 이벤트를 발행
2. 결제 서비스는 해당 이벤트를 수신하여 `"payment-success"` or `"payment-failed"` 를 발행
3. 재고 서비스는 `"payment-success"` 수신 시 `"inventory-deducted"` 발행
4. 결제 실패 시, **보상 트랜잭션(`"order-cancelled"`)** 을 다시 발행하여 주문 상태를 복구
5. 모든 단계는 로그 기반으로 상태를 출력

---

## ✨ 보너스 미션 (선택)

- 상태를 DB에 저장하여 Saga 상태 트래킹 구현
- `order-status` API로 현재 상태 확인 가능하도록 구성
- 실패 단계에서 자동 보상 처리 시점 로깅

---

## 📚 참고 개념 키워드

- Saga Pattern: Choreography vs Orchestration
- 보상 트랜잭션 (Compensation Transaction)
- Kafka 기반 이벤트 상태 전이
- 상태 저장 vs 상태 없음(Stateless Saga)
- Consistency → Eventual Consistency

---

## 💬 예상 질문 (생각 정리용)

- Saga는 트랜잭션을 완전히 대체할 수 있을까?
- 실패 발생 시 복구 타이밍은 어떻게 제어할까?
- 보상 트랜잭션도 실패하면 어떻게 해야 할까?

---

## 🛠️ 참고자료

- [Microservices.io - Saga Pattern](https://microservices.io/patterns/data/saga.html)
- [Baeldung - Kafka + Saga Example](https://www.baeldung.com/spring-kafka-saga)
- [Spring Docs - Kafka Event-driven Architecture](https://docs.spring.io/spring-kafka/)

---

> 이 과제는 “트랜잭
