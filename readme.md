# 🧵 Java 멀티스레드 & 비동기 시스템 설계 마스터 플랜

## 🎯 목표

이 프로젝트는 Java, Spring 기반 환경에서 쓰레드, 비동기 처리, 메시징 시스템, 분산 설계까지  
단계적으로 학습하는 백엔드 아키텍처 마스터 플랜입니다.

총 20단계로 구성되어 있으며, 각 단계는 아래와 같은 구조로 제공됩니다:

- **발제(Prologue)**: 과제를 시작하기 전 배경 개념과 목적 안내
- **과제(Task)**: 실습 중심의 구현 목표
- **정리(Summary)**: 회고 및 개념 정리 (선택)

---

## 🗂️ 전체 레벨 목록 (Lv.1 ~ Lv.20)

# 🧵 Java 멀티스레드 & 비동기 시스템 설계 마스터 플랜

## 🗂️ 전체 레벨 목록 (Lv.1 ~ Lv.20)


| 레벨 | 주제 | 링크 |
|------|------|------|
| Lv.1  | Thread vs Runnable 기본 구조         | [발제](docs/발제/lv1-thread-vs-runnable.md) |
| Lv.2  | sleep & join으로 흐름 제어           | [발제](docs/발제/lv2-sleep-join-flow.md) |
| Lv.3  | Race Condition + synchronized        | [발제](docs/발제/lv3-race-condition-sync.md) |
| Lv.4  | wait/notify 기반 생산자-소비자 모델 | [발제](docs/발제/lv4-producer-consumer-wait-notify.md) |
| Lv.5  | ExecutorService를 통한 쓰레드풀 관리| [발제](docs/발제/lv5-executor-service-pool.md) |
| Lv.6  | Callable & Future 결과 수집         | [발제](docs/발제/lv6-callable-future-result.md) |
| Lv.7  | @Async 기반 비동기 서비스 실행       | [발제](docs/발제/lv7-spring-async-method.md) |
| Lv.8  | 커스터마이징 Executor 구조 설계     | [발제](docs/발제/lv8-custom-executor-parallel.md) |
| Lv.9  | 선착순 처리 - 실전 동시성 제어      | [발제](docs/발제/lv9-concurrency-control-coupon.md) |
| Lv.10 | @Scheduled + @Async 통합 자동화     | [발제](docs/발제/lv10-scheduler-async-batch.md) |
| Lv.11 | BlockingQueue 기반 실시간 이벤트 처리 | [발제](docs/발제/lv11-blockingqueue-event-loop.md) |
| Lv.12 | Kafka 기반 메시징 시스템 입문        | [발제](docs/발제/lv12-kafka-intro-pub-sub.md) |
| Lv.13 | Kafka 실전 패턴 - Ack, Retry, DLQ  | [발제](docs/발제/lv13-kafka-error-retry-dlq.md) |
| Lv.14 | Redis Streams 기반 경량 메시지 처리 | [발제](docs/발제/lv14-redis-streams-light-mq.md) |
| Lv.15 | Kafka vs Redis vs Queue 설계 비교   | [발제](docs/발제/lv15-messaging-architecture-comparison.md) |
| Lv.16 | CompletableFuture 고급 조합 처리     | [발제](docs/발제/lv16-completablefuture-composition.md) |
| Lv.17 | WebFlux 기반 논블로킹 API 서버       | [발제](docs/발제/lv17-webflux-non-blocking-api.md) |
| Lv.18 | Kafka 기반 Saga 분산 트랜잭션       | [발제](docs/발제/lv18-saga-kafka-transaction.md) |
| Lv.19 | Event Sourcing + CQRS 구조 설계      | [발제](docs/발제/lv19-event-sourcing-cqrs.md) |
| Lv.20 | 분산 락 실전 설계 (Redisson/ZooKeeper)| [발제](docs/발제/lv20-distributed-lock-redisson.md) |
---

## 📘 사용법

- 각 레벨의 디렉토리에 있는 `prologue.md`를 읽고 과제를 수행하세요.
- 과제 완료 후 `summary.md`에 회고 및 개념 정리를 남기면 학습 효과가 극대화됩니다.
- 프로젝트가 성장하면 GitHub Wiki, 기술 블로그로도 확장 가능합니다.

---

## 🛠️ 기술 스택

- Java 17+
- Spring Boot 3+
- Spring WebFlux / Spring Kafka / Spring Data Redis
- Redis, Kafka, Docker, ZooKeeper
- Gradle, JUnit5, Lombok

---

> 👨‍🔧 만든 이: 백엔드 주니어 개발자  
> 이 리포지토리는 기술 내공을 쌓기 위한 "레벨업 여정"입니다.  
> 궁금한 게 있다면 언제든 PR이나 이슈로 함께 이야기해요!
