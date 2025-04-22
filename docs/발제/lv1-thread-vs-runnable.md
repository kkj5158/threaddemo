# 🧵 Lv.1 - Java Thread 기초 실습: Thread vs Runnable

---

## ✅ 학습 목표 (Goal)

> Java에서 **쓰레드를 생성하고 실행하는 두 가지 방식**을 이해하고,  
> **Spring Boot 환경에서 실제로 실행해봄으로써** 쓰레드의 개념과 동작 원리를 체득한다.

### 📌 이번 레벨을 통해 달성해야 할 것

- `Thread 상속 방식`과 `Runnable 구현 방식`의 차이점 설명 가능
- `start()`와 `run()`의 차이를 실제 실행 결과를 통해 인지
- Spring Boot 애플리케이션 내에서 쓰레드를 직접 생성하고 실행해봄
- 쓰레드 실행 순서가 **비동기적이라는 점을 로그로 확인**

---

## 🤔 왜 이걸 배워야 할까?

- Java 백엔드에서 멀티쓰레드 개념은 **비동기 처리의 근간**
- `@Async`, `ExecutorService`, `CompletableFuture` 같은 고급 기능도 결국 이 기반 위에 있다
- Spring Boot 내에서 **별도 쓰레드를 활용한 비동기 작업**을 구현할 때 필요한 기본기

---

## 🧪 실습 내용 + 가이드

### 1️⃣ `Thread` 클래스를 상속한 `HelloThread` 클래스 만들기

| 항목 | 설명 |
|------|------|
| 목표 | Thread 상속 방식으로 쓰레드를 생성하고 실행해본다 |
| 구현 | `Thread` 클래스를 상속하고, `run()`을 오버라이드하여 이름 출력 |
| 주의 | `getName()`은 Thread가 가진 고유한 이름을 반환함 |

#### 예시 코드 스니펫
```java
public class HelloThread extends Thread {
    public HelloThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Hello from Thread: " + getName());
    }
}
```

---

### 2️⃣ `Runnable` 인터페이스를 구현한 `HelloRunnable` 클래스 만들기

| 항목 | 설명 |
|------|------|
| 목표 | Runnable 구현 방식으로 쓰레드를 생성하고 실행해본다 |
| 구현 | Runnable을 구현한 클래스에서 `run()` 작성 후, `new Thread(runnable).start()`로 실행 |
| 차이 | Thread 자체를 상속받지 않고 유연하게 활용 가능 (e.g. 다른 클래스와 조합) |

---

### 3️⃣ Spring Boot `@RestController`에서 두 쓰레드 실행하기

| 항목 | 설명 |
|------|------|
| 목표 | Spring 환경에서 실제로 쓰레드가 실행되는 걸 확인 |
| 구현 | `/test/threads` API에서 `HelloThread`, `HelloRunnable` 실행 |
| 검증 | 응답은 단순 텍스트, **실제 실행 결과는 로그에서 확인** |

```java
@GetMapping("/test/threads")
public String testThreads() {
    new HelloThread("Thread-A").start();
    new Thread(new HelloRunnable("Runnable-B")).start();
    return "쓰레드 실행됨! 콘솔을 확인하세요.";
}
```

---

### 4️⃣ `run()` vs `start()`의 차이 확인 (보너스 포함)

| 항목 | 설명 |
|------|------|
| 목표 | run()과 start() 차이를 직접 실행하며 확인 |
| 구현 | 별도 API를 만들고, 동일한 클래스에서 run()과 start() 각각 실행해보기 |
| 검증 | run()은 동기적으로 실행되며, start()는 비동기로 실행됨 |

---

## ✅ 완료 체크리스트 (Done Criteria)

- [ ] `HelloThread`, `HelloRunnable` 클래스 구현 완료
- [ ] Spring Boot에서 `/test/threads` API 호출 시 두 쓰레드 실행됨
- [ ] 콘솔 로그에서 쓰레드 이름이 **비동기적으로 출력**되는 것 확인
- [ ] `start()`와 `run()`의 실행 결과가 다른 점을 설명 가능
- [ ] Thread와 Runnable 방식의 차이 및 장단점을 설명 가능

---

## ✨ 보너스 미션

- [ ] `Thread.setName()`을 사용해 동적으로 쓰레드 이름 설정
- [ ] `Thread.currentThread().getName()`을 통해 현재 실행 중인 쓰레드 이름 확인
- [ ] run()으로 실행했을 때 동기 실행인 것을 직접 확인하는 API 구성

---

## 💬 생각해보면 좋은 질문들

- `Thread`와 `Runnable`의 가장 큰 차이점은 뭘까?
- 언제 `Thread` 상속을 쓰고, 언제 `Runnable`을 구현할까?
- `run()`을 호출하면 왜 비동기가 아닌 걸까?
- Spring Boot의 `@Async`는 내부적으로 어떻게 쓰레드를 쓸까?

---

## 📚 참고자료

- [Java 공식 문서 - Thread 클래스](https://docs.oracle.com/javase/8/docs/api/java/lang/Thread.html)  
  Java에서 Thread 클래스의 구조와 사용 방법을 자세히 설명한 공식 문서입니다.

- [Baeldung - Java에서 Thread 시작하기](https://www.baeldung.com/java-start-thread)  
  Java에서 Thread를 시작하는 다양한 방법과 예제를 다루는 튜토리얼입니다.

- [Baeldung - Thread와 Runnable 비교](https://www.baeldung.com/java-runnable-vs-extending-thread)  
  Thread 클래스를 상속하는 방법과 Runnable 인터페이스를 구현하는 방법의 차이점을 설명한 글입니다.

- [망나니개발자 - Thread와 Runnable에 대한 이해 및 사용법](https://mangkyu.tistory.com/258)  
  Thread와 Runnable의 차이점, 장단점, 사용 예제 등을 상세히 설명한 블로그 글입니다.

- [Gnaseel blog - Runnable과 Thread의 차이 및 간단한 실행 예제](https://gnaseel.tistory.com/21)  
  Runnable과 Thread의 차이점과 간단한 실행 예제를 통해 개념을 설명한 블로그 글입니다.

- [velog - 비동기 처리: Thread 클래스와 Runnable 인터페이스](https://velog.io/@dev_lee/Java-비동기-처리-Thread클래스와-Runnable-인터페이스)  
  Thread와 Runnable의 개념과 사용 방법을 정리한 블로그 글입니다.
---

> **🎯 요약:** 이 과제는 Java의 쓰레드 동작 방식을 **정확히 이해하고, 직접 실행해보는 게 핵심**이다.  
> 다음 레벨부터 나오는 `Executor`, `Future`, `@Async`로 가기 위한 완벽한 디딤돌이야.
