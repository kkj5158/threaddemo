# 🧵 Lv.6 - Callable & Future: 결과를 돌려받는 비동기 처리

---

## ✅ 학습 목표

- `Callable<T>` 인터페이스를 사용해 **결과값을 반환하는 쓰레드 작업**을 구현한다.
- `ExecutorService.submit(Callable)`로 작업을 실행하고, `Future.get()`으로 결과를 가져온다.
- **비동기 작업의 결과 수집 방식**을 직접 체험한다.

---

## 🤔 왜 이걸 배워야 할까?

지금까지는 쓰레드가 **일만 하고 끝**이었다.  
하지만 실무에선 “작업 후 결과를 받아와서 처리”하는 패턴이 훨씬 많다.

예:
- 대량 주문 처리 후 총합 계산
- 외부 API 호출 후 응답 파싱
- 파일 다운로드 후 결과 리턴

이때 쓰는 게 바로 `Callable<T>`와 `Future<T>` 구조다.  
이건 이후 `CompletableFuture`, `@Async`, `WebFlux`, `reactor` 기반까지 확장될 수 있는 중요한 기본기다.

---

## 📌 과제 요구사항

1. `Callable<Integer>`를 구현하여, 1초 뒤에 정수값을 리턴하는 작업을 만든다
2. `ExecutorService`를 통해 3개의 작업을 병렬로 실행하고, 각각의 `Future<Integer>`를 수집한다
3. `Future.get()`으로 결과를 받아와 출력하라
4. 모든 작업 완료 후 쓰레드풀을 `shutdown()` 한다

---

## ✨ 보너스 미션 (선택)

- `invokeAll()` 또는 `invokeAny()` 사용해보기
- `Future.isDone()` 사용해서 완료 여부 체크
- 실행 시간 측정 (System.nanoTime())

---

## 📚 참고 개념 키워드

- `Callable<T>` vs `Runnable`
- `Future<T>`
- `submit()` & `get()`
- 작업 완료 확인 (`isDone()`, `isCancelled()`)

---

## 💬 예상 질문 (생각 정리용)

- `Runnable`과 `Callable`의 차이는 뭘까?
- `Future.get()`은 언제 블로킹될까?
- 결과를 빨리 주는 작업부터 순차 출력하게 할 수 있을까?

---

## 🛠️ 참고자료

- [Baeldung - Callable and Future in Java](https://www.baeldung.com/java-callable-future)
- [Java Docs - Callable](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Callable.html)
- [Oracle - Future Interface](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Future.html)

---

> 이번 과제는 “비동기로 처리하면서도 결과를 놓치지 않는 방법”을 배운다.  
> 이 감각을 익히면, 이후 `@Async`, `CompletableFuture`, `WebClient`까지 다 받아들이기 쉬워진다!
