# 🧵 Lv.4 - 생산자-소비자 모델: wait & notify

---

## ✅ 학습 목표

- `wait()`와 `notify()`를 활용해 쓰레드 간 **협력 방식(동기화 큐 구조)** 을 익힌다.
- 고전적인 **생산자-소비자 패턴**을 통해 공유 자원 제어와 쓰레드 통신을 경험한다.
- 자바의 Object 동기화 메커니즘을 실무와 연결해서 체득한다.

---

## 🤔 왜 이걸 배워야 할까?

멀티쓰레드는 단순히 병렬로만 실행되는 게 아니다.  
**서로를 기다리고**, **데이터를 주고받고**, **순서를 맞춰야** 할 때가 많다.  
예를 들어:

- 소비자가 데이터를 기다리는 동안 생산자는 데이터를 넣고
- 소비자는 `notify()`가 올 때까지 `wait()` 상태로 대기한다

이 패턴은 큐 기반 작업, 로그 시스템, 이벤트 처리기 등 **실무에서 빈번히 등장**한다.

---

## 📌 과제 요구사항

1. 고정 크기 버퍼(List 또는 Queue)를 공유 자원으로 만들어라 (예: 최대 5개)
2. `Producer` 쓰레드는 1초 간격으로 데이터를 버퍼에 추가
3. `Consumer` 쓰레드는 데이터를 버퍼에서 꺼내 처리
4. 버퍼가 꽉 차면 `Producer`는 `wait()` 하고, 비면 다시 `notify()` 받아 작동
5. 반대로 버퍼가 비면 `Consumer`가 `wait()` 하고, 데이터가 들어오면 `notify()` 받아 작동

---

## ✨ 보너스 미션 (선택)

- `notify()` vs `notifyAll()`의 차이 실험
- `ReentrantLock` + `Condition` 을 사용한 고급 구현 추가

---

## 📚 참고 개념 키워드

- 공유 자원 (Shared Buffer)
- 쓰레드 간 통신
- wait(), notify(), notifyAll()
- 동기화 모니터
- 생산자-소비자 패턴

---

## 💬 예상 질문 (생각 정리용)

- wait은 어떤 객체에 걸리는가?
- notify는 어떻게 작동하는가? 모든 쓰레드에 알리나?
- wait과 synchronized는 어떤 관계가 있을까?

---

## 🛠️ 참고자료

- [Java Thread Communication - wait & notify](https://www.baeldung.com/java-wait-notify)
- [Oracle 공식 문서 - Object.wait()](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#wait--)
- [Baeldung - Producer Consumer Problem](https://www.baeldung.com/java-producer-consumer-problem)

---

> 이번 과제는 “쓰레드는 혼자 일하는 게 아니다”를 배우는 단계다.  
> 진짜
