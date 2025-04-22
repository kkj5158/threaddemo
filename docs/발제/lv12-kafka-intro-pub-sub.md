# 🧵 Lv.12 - Kafka 기반 비동기 메시징 시스템 입문

---

## ✅ 학습 목표

- Kafka의 구조(Producer, Broker, Topic, Consumer)를 이해하고 직접 실습한다.
- Spring Boot와 Kafka를 연동하여 **비동기 메시지 송수신 처리** 구조를 구현한다.
- Kafka의 **비동기 처리 방식과 데이터 흐름**을 직접 경험하고 로그로 확인한다.

---

## 🤔 왜 이걸 배워야 할까?

Java에서의 쓰레드, Spring의 비동기 처리로 시스템 내부의 병렬 처리는 충분히 경험했다.  
하지만 실무에선 **시스템 간의 비동기 처리**가 중요하다.

- 주문 시스템 → 정산 시스템
- 알림 시스템 → 이메일 시스템
- 스트리밍 처리 → 로그 수집, 분석

이런 구조를 구현하려면, **메시지 브로커 기반 이벤트 드리븐 아키텍처**가 필요하고,  
그 핵심에 **Kafka**가 있다.

---

## 📌 과제 요구사항

1. Kafka를 로컬 도커로 실행하고, `spring-kafka`를 활용해 연동 설정을 구성하라
2. REST API를 통해 메시지를 `KafkaTemplate.send()`로 발행하라
3. Consumer를 설정하여 해당 Topic을 구독하고, 메시지를 로그로 출력하라
4. Producer → Topic → Consumer 흐름을 로그로 트래킹하고, **비동기 처리임을 확인**하라

---

## ✨ 보너스 미션 (선택)

- 메시지를 JSON 구조로 발행 및 역직렬화
- 다수의 Consumer가 동일 Topic을 구독하는 **Consumer Group 구조** 실습
- Partition을 나누고, 메시지 키에 따라 분산되도록 설정

---

## 📚 참고 개념 키워드

- Kafka Broker, Topic, Producer, Consumer
- KafkaTemplate
- @KafkaListener
- 메시지 비동기 처리 구조
- Consumer Group, Partition

---

## 💬 예상 질문 (생각 정리용)

- Kafka의 메시지 순서는 보장될까?
- Consumer는 어떻게 메시지를 다시 읽지 않도록 보장할까?
- Kafka는 언제 retry/replay가 필요한가?

---

## 🛠️ 참고자료

- [Kafka 공식 문서](https://kafka.apache.org/documentation/)
- [Spring Docs - Spring for Apache Kafka](https://docs.spring.io/spring-kafka/docs/current/reference/html/)
- [Baeldung - Spring Kafka](https://www.baeldung.com/spring-kafka)

---

> 이번 과제는 “내부 비동기”를 넘어서 “시스템 간 비동기 통신”을 실현하는 구조다.  
> Kafka를 경험하는 순간, 시스템 설계의 시야가 **1단계 넓어진다.**
