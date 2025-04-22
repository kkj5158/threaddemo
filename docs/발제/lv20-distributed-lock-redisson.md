# 🧵 Lv.20 - 분산 락 실전 설계: 여러 서버 중 하나만 처리하게 하라

---

## ✅ 학습 목표

- 다중 인스턴스 환경에서 특정 작업이 **한 번만 실행되도록 제어하는 구조**를 설계한다.
- `Redis`, `ZooKeeper`, `Database` 기반의 분산 락을 비교하고, **신뢰성 있는 락 처리**를 구현한다.
- 락 점유, 만료, 해제 등 **운영 환경에서 자주 겪는 분산 동시성 이슈**를 실습한다.

---

## 🤔 왜 이걸 배워야 할까?

Spring Boot는 기본적으로 단일 서버에선 락이 필요 없다.  
하지만 운영 환경은 다르다.

- 3개 서버가 동시에 쿠폰 발급 시작
- 스케줄러가 중복 실행돼 배치 장애 발생
- 선착순 이벤트에 3명이 동시에 응답 → 중복 처리

이걸 제어할 수 있어야 진짜 실전 백엔드다.

---

## 📌 과제 요구사항

1. Redis 기반 분산 락을 구현하여, 선착순 쿠폰 발급 API를 보호하라  
   - 락 획득 시 쿠폰 발급, 실패 시 "이미 처리 중입니다" 메시지
2. `Redisson` 또는 `Lettuce + SET NX PX` 방식 중 선택
3. TTL 만료, 예외 발생 시 락 자동 해제 로직 포함
4. 여러 인스턴스를 시뮬레이션하여 **동시에 호출해도 1명만 처리됨**을 검증

---

## ✨ 보너스 미션 (선택)

- Redlock 알고리즘 구현 (Redis 노드 3개 기준)
- ZooKeeper 기반 분산 락으로 비교 실험
- 배치 작업에 분산 락 적용 (`@Scheduled` 중복 실행 방지)

---

## 📚 참고 개념 키워드

- Redis `SET key value NX PX`
- Redisson `RLock.tryLock(timeout, leaseTime)`
- Redlock Algorithm
- ZooKeeper `Ephemeral Node`, `Watcher`
- 분산 환경, 클러스터, 멀티 인스턴스

---

## 💬 예상 질문 (생각 정리용)

- 락이 걸린 상황에서 예외가 발생하면 어떻게 해제할까?
- TTL이 너무 짧으면? 너무 길면?
- 락 중복 획득 가능성은 없을까?

---

## 🛠️ 참고자료

- [Redisson Docs - Distributed Lock](https://github.com/redisson/redisson/wiki/8.-distributed-locks)
- [Redis SET NX PX 사용법](https://redis.io/commands/set/)
- [ZooKeeper Lock Recipe](https://curator.apache.org/curator-recipes/shared-lock.html)
- [Martin Kleppmann - Distributed Locks are hard](https://martin.kleppmann.com/2016/02/08/how-to-do-distributed-locking.html)

---

> 이 과제는 “멀티 인스턴스 환경에서 안전한 작업 보장”을 위한 실전 감각
