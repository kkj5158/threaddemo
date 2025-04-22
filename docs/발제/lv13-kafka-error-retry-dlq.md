# 🧵 Lv.13 - Kafka 실전 패턴: 메시지 보장, AckMode, Retry, DLQ

---

## ✅ 학습 목표

- Kafka Consumer가 메시지를 **언제, 어떻게 소비 완료(Acknowledge)하는지** 이해한다.
- Spring Kafka의 `AckMode`를 설정하여 **정확한 메시지 처리 타이밍**을 컨트롤한다.
- 메시지 처리 중 예외 발생 시 **재시도(Retry)** 와 **DLQ(Dead Letter Queue)** 처리 구조를 구현한다.
- **실제 운영 환경에서 안정적인 Kafka 소비자 설계 패턴**을 체득한다.

---

## 🤔 왜 이걸 배워야 할까?

Kafka는 기본적으로 **“최소 1회(Minimum Once)” 전달 보장**을 한다.  
하지만 애플리케이션 레벨에서는 다음과 같은 문제가 생길 수 있다:

- 메시지는 도착했지만 처리 도중 예외 발생 → 재처리해야 하나?
- 메시지가 중복 소비되었을 때 → 중복 방지 처리는 어떻게?
- 계속 실패하는 메시지는 어떻게 격리해서 처리?

이런 문제를 해결하기 위해 사용하는 것이 바로:
- `AckMode`
- Retry 정책
- Dead Letter Queue 구조

---

## 📌 과제 요구사항

1. Kafka Consumer에서 메시지를 수신 후 **수동 Ack(acknowledge())** 구조로 처리하라
2. 메시지 처리 중 `RuntimeException`이 발생하도록 일부러 예외를 던지는 로직을 추가하라
3. Spring Kafka의 Retry 설정을 적용하고,
