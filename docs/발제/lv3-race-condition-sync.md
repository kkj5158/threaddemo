# 🧵 Lv.3 - 동시성 문제 실습: Race Condition & synchronized

---

## ✅ 학습 목표

- 멀티쓰레드 환경에서 발생하는 **Race Condition(경합 조건)** 의 개념을 이해한다.
- `synchronized` 키워드를 이용해 **공유 자원에 대한 접근을 안전하게 제어**하는 방법을 익힌다.
- 직접 **버그를 유발**하고, 그걸 **해결**하는 흐름을 통해 실무 감각을 기른다.

---

## 🤔 왜 이걸 배워야 할까?

멀티쓰레드 환경에서 가장 흔하고 위험한 문제는 바로 **동시성 이슈**다.  
2개 이상의 쓰레드가 **같은 데이터에 동시에 접근하고 수정하면**, 예상치 못한 결과(데이터 꼬임, 덮어쓰기 등)가 발생한다.

이걸 해결하려면 쓰레드 간 **자원 접근을 제어**해야 하며,  
그 핵심 키워드가 바로 `synchronized`, 혹은 이후 배울 `Lock`, `Atomic` 클래스 등이다.

---

## 📌 과제 요구사항

1. `BankAccount` 클래스를 만들고, `withdraw(int amount)` 메서드를 정의하라
2. 두 개의 쓰레드를 만들어 같은 계좌에서 동시에 출금하도록 구현하라
3. `잔액 부족` 조건이 제대로 작동하지 않고 마이너스 잔액이 되는 현상을 유도하라 (Race Condition 발생!)
4. `synchronized`를 활용하여 동시성 문제를 해결하라

---

## ✨ 보너스 미션 (선택)

- `synchronized` 메서드 vs `synchronized 블럭` 방식 비교
- `AtomicInteger`를 이용한 비동기 안전 구조도 추가로 실험해보기

---

## 📚 참고 개념 키워드

- Race Condition
- 공유 자원
- synchronized 키워드
- 동시성 이슈, 비원자성 연산
- Thread-safe

---

## 💬 예상 질문 (생각 정리용)

- 왜 synchronized가 없으면 데이터가 꼬일까?
- 모든 메서드를 synchronized로 만들면 성능은?
- 멀티스레드 환경에서 안전한 객체란?

---

## 🛠️ 참고자료

- [Baeldung - Race Condition in Java](https://www.baeldung.com/java-race-condition)
- [Java synchronized 문서](https://docs.oracle.com/javase/tutorial/essential/concurrency/syncmeth.html)
- [Java Concurrency - Atomic Variables](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/atomic/package-summary.html)

---

> 이번 과제는 실제로 **문제가 생기는 상황을 직접 만들어보는 게 핵심**이다.
> 디버깅하며 "왜 이래?"라는 생각이 들 때, 진짜 멀티쓰레드 감각이 생긴다.
