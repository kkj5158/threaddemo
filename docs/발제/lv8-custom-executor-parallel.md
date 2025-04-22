# 🧵 Lv.8 - Executor 커스터마이징 & 대량 비동기 작업 처리

---

## ✅ 학습 목표

- Spring에서 `TaskExecutor`를 직접 설정하여 **비동기 처리용 쓰레드풀을 커스터마이징**하는 법을 배운다.
- `@Async`가 사용하는 기본 Executor 대신, 나만의 Executor를 정의하고 연결한다.
- 대량 작업(예: 수천 건 이메일 전송)을 효율적으로 처리할 수 있는 구조를 설계한다.

---

## 🤔 왜 이걸 배워야 할까?

`@Async`는 기본적으로 `SimpleAsyncTaskExecutor` 또는 기본 쓰레드풀을 사용하지만,  
쓰레드 수, 큐 사이즈, 이름 지정, 거절 정책 등 다양한 설정이 필요할 수 있다.

특히 실무에서 **대량의 비동기 작업 처리** 시 튜닝이 안 되어 있으면:

- 쓰레드가 너무 많아져서 OOM
- 큐가 꽉 차서 요청이 무시됨
- 처리 순서 꼬임 등 다양한 문제가 발생

→ 그래서 **Executor 커스터마이징**은 필수 스킬!

---

## 📌 과제 요구사항

1. `@Configuration` 클래스를 만들고, `ThreadPoolTaskExecutor` 빈을 직접 정의하라
2. `@Async("myExecutor")`를 사용해 비동기 메서드에 지정한 Executor를 연결하라
3. 컨트롤러를 통해 100개의 작업을 병렬로 실행하되, Executor 설정에 따라 제한된 수의 쓰레드만 동작하는 것을 확인하라
4. 모든 작업의 시작/종료 로그를 출력하고, 쓰레드 이름이 커스터마이징된 이름인지 확인하라

---

## ✨ 보너스 미션 (선택)

- `RejectedExecutionHandler` 설정하여 큐가 꽉 찼을 때 로깅 처리해보기
- corePoolSize, maxPoolSize, queueCapacity 튜닝 실험
- `CompletableFuture.allOf()` 로 전체 완료 대기 구조 구현

---

## 📚 참고 개념 키워드

- `ThreadPoolTaskExecutor`
- `@Async("executorName")`
- core/max pool size
- queue capacity
- 비동기 병렬 처리 최적화

---

## 💬 예상 질문 (생각 정리용)

- 쓰레드 풀은 몇 개가 적당한가?
- 큐가 꽉 차면 어떻게 처리할 수 있을까?
- 커스터마이징한 Executor는 어디서 어떤 기준
