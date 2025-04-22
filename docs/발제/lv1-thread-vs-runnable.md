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

## 📌 과제 요구사항 + 세부 가이드

### 1️⃣ `Thread` 클래스를 상속한 `HelloThread` 클래스 만들기

- `Thread`를 상속한 클래스 생성
- 생성자에서 이름(`name`)을 받아 `super(name)`으로 넘기기
- `run()` 메서드를 오버라이드하고, 쓰레드 이름 출력
- `getName()` 사용하여 로그 출력

---

### 2️⃣ `Runnable` 인터페이스를 구현한 `HelloRunnable` 클래스 만들기

- `Runnable` 구현 클래스 생성
- 생성자에서 이름 필드 주입
- `run()` 메서드에서 이름 출력
- 반드시 `new Thread(runnable).start()`로 실행

---

### 3️⃣ 두 쓰레드를 Spring Boot `Controller`에서 실행해보기

- `@RestController` 생성
- `/test/threads` API에서 `HelloThread`, `HelloRunnable` 인스턴스 생성 후 `start()` 호출
- 응답은 `String`으로 간단히 메시지 반환
- 실제 실행 결과는 콘솔 로그에서 확인

---

### 4️⃣ 실행 결과가 **비동기적으로 출력되는 것** 확인

- 두 쓰레드 모두 `start()`로 실행 → 실제 실행 순서는 예측 불가
- 실행 시 로그가 순차적으로 찍히지 않음을 콘솔에서 확인

---

## ✨ 보너스 미션 (선택)

- `run()`을 직접 호출해보는 API 추가하고, `start()`와 차이를 체험
- `Thread.setName()`을 사용하여 이름 커스터마이징
- `Thread.currentThread().getName()`을 로그에 함께 출력

---

## 💬 예상 질문 (생각 정리용)

- Thread와 Runnable 중 어떤 걸 써야 하지?
- run()을 부르면 쓰레드가 아닌가?
- 순서가 바뀌는 건 의도된 건가?

---

## 📚 참고자료

- [Java 공식 문서 - Thread](https://docs.oracle.com/javase/8/docs/api/java/lang/Thread.html)
- [Baeldung - Creating Threads in Java](https://www.baeldung.com/java-thread-creation)
- [비동기 실행이란 무엇인가? (실무 블로그 글)](https://brunch.co.kr/@hyunjae/60)

---

> 과제를 시작해보자. 가장 기초지만, 가장 중요하다.  
> 이걸 이해하면 나머지 9단계는 수월하게 쭉쭉 간다 🚀
