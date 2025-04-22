# 🧵 Lv.14 - Redis Streams 기반 실시간 메시징 시스템

---

## ✅ 학습 목표

- Redis의 `XADD`, `XREADGROUP`, `XACK` 등을 활용하여 **Kafka 유사 구조의 메시지 큐**를 구현한다.
- `Consumer Group`, `Stream ID`, `Pending List` 개념을 이해하고 실습한다.
- Spring Data Redis를 사용해 **경량 메시지 처리 시스템**을 구성한다.

---

## 🤔 왜 이걸 배워야 할까?

Kafka는 강력하지만 무겁고 복잡하다.  
특히 **단일 서비스 내부 이벤트 처리**, **마이크로서비스 간 간단한 통신**, **빠른 큐잉 시스템**을 원할 때는 Redis Streams가 딱이다.

Redis Streams는 Kafka처럼 동작하지만:
- 설치/운영 부담이 낮고
- 초경량 메시지 처리에 특화
- 실시간 처리 구조에 매우 적합

실무에선 **Kafka 대신 Redis Streams로 내부 이벤트 큐를 구성**하기도 한다.

---

## 📌 과제 요구사항

1. Redis Streams에 메시지를 `XADD`로 삽입하는 Producer를 구현하라
2. `XREADGROUP` 방식으로 메시지를 가져오는 Consumer 그룹을 구성하라
3. 처리 완료 시 `XACK` 호출로 메시지 확인 처리
4. Consumer 그룹이 여러 개일 때 **메시지가 어떻게 분배되는지** 확인하라

---

## ✨ 보너스 미션 (선택)

- Pending 메시지 처리 (`XPENDING`, `XCLAIM`) 실습
- Consumer 실패 상황을 가정한 재처리 흐름 구현
- TTL이 있는 메시지 필터링 (e.g. 오래된 메시지는 버림)

---

## 📚 참고 개념 키워드

- Redis Stream: XADD, XREADGROUP, XACK, XPENDING
- Consumer Group
- Stream Offset (Stream ID)
- Spring Data Redis: `StreamListener`, `StreamMessageListenerContainer`
- Lightweight Message Queue

---

## 💬 예상 질문 (생각 정리용)

- Kafka와 Redis Streams의 가장 큰 차이는?
- Redis Streams는 어떻게 메시지를 순서 보장하나?
- Consumer가 죽었을 때 메시지는 어디에 남아있나?

---

## 🛠️ 참고자료

- [Redis Streams 공식 문서](https://redis.io/docs/data-types/streams/)
- [Spring Data Redis Streams Example](https://docs.spring.io/spring-data/redis/docs/current/reference/html/#redis.streams)
- [Baeldung - Redis Stream Guide](https://www.baeldung.com/spring-data-redis-streams)

---

> 이번 과제는 “빠르고 가벼운 실시간 메시지 큐”를 직접 구현해보는 단계다.  
> Kafka가 지나치게 무겁게 느껴졌다면, Redis Streams는 실무에서 유연하게 활용 가능한 강력한 대안이다.

> **고성능 & 저비용 이벤트 큐**를 만드는 감각, 직접 체득해보자.
