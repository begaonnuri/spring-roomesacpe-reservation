# 요구사항

## 1단계

### 기능 요구사항

- [x] 웹 요청 / 응답 처리로 입출력 추가
  - [x] 예약 생성
  - [x] 예약 목록 조회
  - [x] 예약 삭제
- [x] 예외 처리
  - [x] 예약 생성 시 날짜와 시간이 똑같은 예약이 이미 있는 경우 예약을 생성할 수 없다.

### 프로그래밍 요구사항

- 기존 콘솔 애플리케이션은 그대로 잘 동작해야한다.
- 콘솔 애플리케이션과 웹 애플리케이션의 비즈니스 로직 중복을 최소화 한다.

## 2단계

### 기능 요구사항

- [x] 메모리 대신 데이터베이스 적용

## 3단계

### 기능 요구사항

- [x] 테마 관리 기능 추가
- [x] 테마별 스케줄 관리 기능 추가
- [x] 추가된 테마와 스케줄에 따라 기존에 구현된 예약을 리팩터링
- [ ] 예약과 관련된 예외 상황을 처리
  - [ ] 예약 등록을 하려는 날짜와 시간에 이미 등록되어있으면 예약을 등록을 실패한다.
  - [ ] 예약이 없는 경우에도 빈 응답 값을 응답한다.
  - [ ] 예약이 존재하지 않는 경우 예약 삭제를 실패한다.

### 프로그래밍 요구사항

- [ ] 예약과 테마 등 도메인 설계를 자유롭게 한다.
- [ ] 도메인 설계로 인해 생성되는 객체와 데이터베이스의 테이블의 스키마는 일치하지 않아도 된다.
- [ ] 계층을 고려한 리팩터링을 한다.
