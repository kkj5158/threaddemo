# 🧵 Lv.1 - Java Thread 기초 실습: Thread vs Runnable

---

## ✅ 학습 목표

- Java에서 쓰레드를 생성하는 두 가지 방식(`Thread 상속`, `Runnable 구현`)을 이해한다.
- `start()`와 `run()`의 차이를 체감한다.
- Spring Boot 환경에서도 쓰레드가 동작하는 구조를 확인한다.

---

## 🤔 왜 이걸 배워야 할까?

Java에서 멀티쓰레드를 다루는 건 백엔드 개발자에게 **기본기이자 필수 역량**이다.  
특히 Spring에서는 `@Async`, `ExecutorService`, 비동기 작업, 병렬 처리 등 다양한 기능이 **쓰레드를 기반으로 동작**한다.  

이 과제는 **"쓰레드가 도대체 뭔데?"**라는 질문에 답을 주고,  
직접 `Thread`와 `Runnable`을 비교해보며 동작 원리를 체득하는 단계다.

---

## 📌 과제 요구사항

1. `Thread` 클래스를 상속한 `HelloThread` 클래스 만들기
2. `Runnable` 인터페이스를 구현한 `HelloRunnable` 클래스 만들기
3. 두 쓰레드를 `Controller`에서 실행해보기
4. 실행 결과를 로그로 출력하며, 순서가 **비동기적으로** 출력되는 것 확인

---

## ✨ 보너스 미션 (선택)

- `run()`을 직접 호출해보는 코드도 작성하고, `start()`와의 차이를 설명해보기
- 각각의 쓰레드에 이름(`setName`)을 지정하고 로그에 포함시켜 보기

---

## 📚 참고 개념 키워드

- `Thread vs Runnable`
- `start()` vs `run()` 차이
- Java 기본 쓰레드 스케줄링
- 동기 vs 비동기 실행

---

## 💬 예상 질문 (생각 정리용)

- Thread와 Runnable 중 어떤 걸 써야 하지?
- run()을 부르면 쓰레드가 아닌가?
- 순서가 바뀌는 건 의도된 건가?

---

## 🛠️ 참고자료

- [Java 공식 문서 - Thread](https://docs.oracle.com/javase/8/docs/api/java/lang/Thread.html)
- [Baeldung - Creating Threads in Java](https://www.baeldung.com/java-thread-creation)
- [비동기 실행이란 무엇인가? (실무 블로그 글 추천)](https://brunch.co.kr/@hyunjae/60)

---

> 과제를 시작해보자. 가장 기초지만, 가장 중요하다.
> 이걸 이해하면 나머지 9단계는 수월하게 쭉쭉 간다 🚀
