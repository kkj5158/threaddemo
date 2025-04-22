# 🧵 Lv.15 - 실전 메시징 아키텍처 설계: Kafka vs Redis Streams vs Queue

---

## ✅ 학습 목표

- Kafka, Redis Streams, In-Memory Queue(BlockingQueue 등)의 **특징과 차이점**을 비교한다.
- 상황별로 어떤 메시징 시스템이 적합한지 **설계자로서 판단하는 기준**을 정리한다.
- **비즈니스 시나리오 기반 메시징 아키텍처 설계 과제**를 수행한다.

---

## 🤔 왜 이걸 배워야 할까?

지금까지 우리는 다양한 방식의 메시지 처리를 학습했다.  
하지만 실무에서는 기술 자체보다 **"무엇을, 왜, 어떻게 선택했는가?"** 가 더 중요하다.

- Kafka는 강력하지만 운영 비용이 높다.
- Redis Streams는 가볍고 빠르지만, 확장성과 신뢰성엔 한계가 있다.
- BlockingQueue는 구조는 단순하지만 스케일아웃이 어렵다.

이제 우리는 **상황에 맞는 기술을 설명하고, 선택하고, 설계할 수 있어야 한다.**

---

## 📌 과제 요구사항

1. 아래와 같은 3가지 시나리오를 보고, **가장 적합한 메시징 시스템**을 선택하고 설계하라:

   ### 1️⃣ 실시간 쿠폰 발급 이벤트 시스템
   - 초당 수천 건의 요청
   - 메시지 순서 보장 중요
   - 다수의 서비스가 동시에 구독

   ### 2️⃣ 내부 관리 페이지 로그 적재 시스템
   - 트래픽 낮음, 분석용 로그 전송
   - 메시지 손실 허용 가능

   ### 3️⃣ 실시간 알림 전송 (이메일 / 푸시 등)
   - 사용자는 한 번만 받아야 함 (중복 금지)
   - 실패 시 재시도 필요

2. 각 시나리오별로 다음을 포함하여 설계하라:
   - 선택한 메시징 시스템과 그 이유
   - 메시지 흐름 다이어그램 (텍스트 또는 시퀀스)
   - 장애 대응 전략 (예: Retry, DLQ, 중복 처리)

---

## ✨ 보너스 미션 (선택)

- Kafka와 Redis Streams의 처리량 실험 결과 비교 (초당 처리 수)
- 각 시스템의 장단점 표 형태로 정리
- 메시징 시스템 변경 시 고려해야 할 요소들 정리 (Vendor Lock-in, Monitoring, Retry 전략 등)

---

## 📚 참고 개념 키워드

- 메시지 순서 보장 (Ordering Guarantee)
- Exactly-once / At-least-once / Best-effort
- Consumer Group, Partition
- Eventual Consistency, Saga Pattern
- DLQ, Backpressure, Throughput

---

## 💬 예상 질문 (생각 정리용)

- Kafka를 도입하는 순간 어떤 인프라 요소가 추가되는가?
- Redis Streams로 Kafka 수준의 신뢰성과 확장성을 구현할 수 있을까?
- 메시지 손실을 감수하고 성능을 올리는 건 언제쯤 타당한 선택일까?

---

## 🛠️ 참고자료

- [MSA Patterns - Messaging](https://microservices.io/patterns/messaging/messaging.html)
- [Confluent Blog - When to use Kafka vs Redis](https://www.confluent.io/blog/kafka-fastest-messaging-system/)
- [Redis Streams vs Kafka 비교 블로그](https://faun.pub/kafka-vs-redis-streams-45fbc27c51d3)

---

> 이 과제는 "어떤 기술을 쓸 것인가"를 넘어,  
> **"왜 이 기술을 선택했는가?"를 말할 수 있는 설계자의 시야**를 길러주는 미션이다.  

> 기술력은 코드에서, 실력은 설계에서 드러난다.  
> 너는 이제 선택할 수 있는 사람이다.
