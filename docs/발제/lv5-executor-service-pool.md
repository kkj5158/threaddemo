# 🧵 Lv.5 - ExecutorService로 쓰레드풀 관리하기

---

## ✅ 학습 목표

- Java의 `ExecutorService`를 사용해 쓰레드풀(Thread Pool)을 관리하는 방법을 익힌다.
- `submit()`을 통해 작업을 위임하고, 쓰레드 생성/소멸을 직접 관리하지 않아도 되는 구조를 이해한다.
- 쓰레드 재사용이 주는 성능상의 장점과 실무 구조를 체득한다.

---

## 🤔 왜 이걸 배워야 할까?

지금까지는 쓰레드를 `new Thread(...).start()` 방식으로 직접 만들었다.  
하지만 실무에서는 수십, 수백 개의 쓰레드를 생성하고 파괴하는 비용을 줄이기 위해 **"풀링(Pooling)"** 기법을 사용한다.

`ExecutorService`는 쓰레드를 **반복 재사용하면서 효율적인 리소스 관리**를 가능하게 해준다.  
그리고 이후 배울 `@Async`, `TaskExecutor`, `Spring Batch` 등에서도 내부적으로 이걸 쓴다.

---

## 📌 과제 요구사항

1. `ExecutorService`를 사용해 쓰레드풀을 생성하라 (예: `Executors.newFixedThreadPool(3)`)
2. 5개의 작업을 submit()으로 등록하고, 각각 로그 출력하도록 하라
3. 각 작업은 1초 지연(sleep)을 포함하여 비동기적으로 실행됨을 확인하라
4. 모든 작업 완료 후 `shutdown()`으로 쓰레드풀 종료

---

## ✨ 보너스 미션 (선택)

- `Executors.newCachedThreadPool()` 과 비교 실험
- 작업 완료 후 Future.get()으로 결과 받기

---

## 📚 참고 개념 키워드

- `ExecutorService`
- `Thread Pool`
- `submit(Runnable)`
- `shutdown()`, `awaitTermination()`
- 재사용 가능한 쓰레드

---

## 💬 예상 질문 (생각 정리용)

- 쓰레드풀은 내부적으로 어떤 구조인가?
- 직접 쓰레드를 만들 때와 어떤 차이가 있나?
- shutdown을 하지 않으면 어떤 일이 벌어질까?

---

## 🛠️ 참고자료

- [Baeldung - Guide to ExecutorService](https://www.baeldung.com/java-executor-service)
- [Oracle ExecutorService 문서](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ExecutorService.html)
- [Effective Java - Item 80: Prefer Executors to Threads](https://www.oreilly.com/library/view/effective-java-3rd/9780134686097/)

---

> 이번 과제는 “내가 직접 쓰레드 만들지 않고도, 원하는 작업을 병렬로 실행하는 방법”을 배우는 단계다.  
> 생산성과 성능, 두 마리 토끼를 잡는 구조의 시작이다 🐇🐇
