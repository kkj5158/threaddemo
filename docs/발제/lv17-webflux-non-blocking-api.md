# 🧵 Lv.17 - WebFlux 기반 논블로킹 API 서버 구현

---

## ✅ 학습 목표

- Spring WebFlux 기반으로 **논블로킹 API 서버**를 구성한다.
- `Mono`, `Flux` 를 이용해 **Reactive 방식으로 데이터 흐름을 설계**한다.
- 동기/비동기와 **논블로킹/블로킹의 차이**를 체감하고, WebClient 연계까지 실습한다.

---

## 🤔 왜 이걸 배워야 할까?

지금까지는 **멀티 쓰레드 기반 비동기 처리**를 배웠다.  
하지만 고성능 시스템에서는 **아예 쓰레드를 점유하지 않는 Non-blocking I/O 방식**이 핵심이다.

> WebFlux는 적은 수의 쓰레드로도 수천 개 요청을 처리할 수 있게 해주는 Reactive 기반 Web 프레임워크다.

**이벤트 루프 기반 구조 (Netty)**,  
**백프레셔(Backpressure)**,  
**데이터 스트림의 반응형 처리**까지 포함한  
**스프링 진짜 Reactive 설계의 시작점**이다.

---

## 📌 과제 요구사항

1. Spring WebFlux 프로젝트를 생성하고, `/articles` GET API를 구현하라
2. 서비스 레이어에서 3개의 외부 뉴스 API를 `WebClient`로 병렬 호출하고, 결과를 `Flux<Article>`로 리턴
3. 컨트롤러에서 `Flux<Article>`을 그대로 응답해 클라이언트 스트리밍 처리
4. 병렬 호출 시간이 실제로 단축되는지 로그로 측정

---

## ✨ 보너스 미션 (선택)

- `zip()`, `flatMap()`, `merge()` 등을 활용한 Flux 조합 실험
- `Mono<Void>`로 처리하는 알림 전송 API 구성
- 예외 발생 시 fallback 처리 (`onErrorResume`)

---

## 📚 참고 개념 키워드

- `Mono<T>`, `Flux<T>`
- `WebClient` vs `RestTemplate`
- `flatMap`, `switchIfEmpty`, `onErrorResume`
- 논블로킹 처리, 백프레셔(Backpressure)

---

## 💬 예상 질문 (생각 정리용)

- WebFlux는 성능이 무조건 좋은가?
- `Mono`와 `Flux`는 언제 쓰는 게 맞을까?
- 블로킹 코드가 WebFlux 안에 섞이면 어떤 일이 발생할까?

---

## 🛠️ 참고자료

- [Spring Docs - WebFlux](https://docs.spring.io/spring-framework/docs/current/reference/html/web-reactive.html)
- [Baeldung - Spring WebFlux Guide](https://www.baeldung.com/spring-webflux)
- [Project Reactor](https://projectreactor.io/docs)

---

> 이번 과제는 “진짜 Reactive 시스템”을 경험하는 입문이다.  
> 쓰레드를 돌리는 게 아니라, **데이터 흐름을 컨트롤하고 설계하는 감각**을 익히자.

> 서버가 2개 → 100개 되는 순간, WebFlux의 진짜 위력이 드러난다 😎
