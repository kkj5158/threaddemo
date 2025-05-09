# 🧵 Lv.2 - 쓰레드 흐름 제어: sleep & join

---

## ✅ 학습 목표

- `Thread.sleep()`으로 쓰레드를 **일시 정지**시키는 방법을 익힌다.
- `Thread.join()`으로 쓰레드 **실행 완료를 기다리는 흐름 제어**를 학습한다.
- 여러 쓰레드가 비동기로 실행될 때, **순서를 제어**하는 기본 개념을 체득한다.

---

## 🤔 왜 이걸 배워야 할까?

멀티쓰레드는 기본적으로 비동기적으로 실행되기 때문에 **예측하기 어려운 흐름**을 갖는다.  
하지만 실무에서는 반드시 특정 작업을 먼저 끝내고 다음 작업을 해야 하는 경우가 많다.

- **sleep()** 은 일시 정지 (지연) → 실시간 처리 제어에 필수
- **join()** 은 완료 대기 → 동기화 흐름 제어 핵심

이 두 가지는 **비동기와 동기 흐름을 통제하는 최소 단위 도구**다.

---

## 📌 과제 요구사항

1. `Thread.sleep(ms)`을 사용해서 1초 간격으로 메시지를 출력하는 쓰레드를 만들어라
2. 두 개의 쓰레드를 동시에 실행하고, **`join()`을 이용해 첫 쓰레드가 끝날 때까지 기다린 후** 두 번째 쓰레드를 실행하라
3. 실행 결과가 의도한 순서대로 나오는지 로그로 검증하라

---

## ✨ 보너스 미션 (선택)

- 각 쓰레드의 시작/종료 시점을 `System.currentTimeMillis()`로 출력해 타이밍 확인
- `Thread.currentThread().getName()`으로 쓰레드 이름 출력해 시각적으로 확인

---

## 📚 참고 개념 키워드

- `sleep()`: 일정 시간 쓰레드 중지
- `join()`: 다른 쓰레드의 종료를 기다림
- 쓰레드 스케줄링
- 비동기 → 동기 흐름 전환

---

## 💬 예상 질문 (생각 정리용)

- `sleep()`과 `join()`은 어떤 쓰레드 기준으로 동작하나?
- `join()`을 사용하지 않으면 무슨 일이 벌어질까?
- 메인 쓰레드가 자식 쓰레드보다 먼저 종료될 수 있나?

---

## 🛠️ 참고자료

- [Java Thread.sleep() 공식 문서](https://docs.oracle.com/javase/8/docs/api/java/lang/Thread.html#sleep-long-)
- [Java Thread.join() 공식 문서](https://docs.oracle.com/javase/8/docs/api/java/lang/Thread.html#join--)
- [Baeldung - Thread Sleep and Join](https://www.baeldung.com/java-thread-sleep-join)

---

> 이번 단계는 "쓰레드가 실행되는 타이밍을 제어할 수 있다"는 감각을 익히는 게 핵심이다.
> 쓰레드가 단순히 `start()`만으로 끝나는 게 아니라, 그 흐름을 어떻게 **설계하고 통제**할 수 있는지를 직접 체험해보자.
