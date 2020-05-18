# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 기능 요구 사항
* 초간단 자동차 경주 게임을 구현한다.
* 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
* 사용자는 몇 대의 자동차로 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
* 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다.
* 자동차의 상태를 화면에 출력한다. 어느 시점에 출력할 것인지에 대한 제약은 없다.

## 기능 목록
* 자동차 대수 입력
* 시도할 횟수 입력
* 게임 정보(시도 횟수, 자동차 대수) 저장 객체
* 자동차 Position 초기화값 0
* 자동차 상태 확인
* 자동차 상태 출력
* 전진 또는 멈춤 판단  
    * 4이상일 경우 전진 

## 프로그래밍 요구사항
* 값을 입력 받는 API는 Scanner를 이용
* 랜덤 값은 자바 java.util.Random 클래스의 nextInt(10) 메소드를 활용
* 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분
* 모든 로직에 단위 테스트를 구현
* else 예약어를 쓰지 않는다.
* 자바 코드 컨벤션을 지키면서 프로그래밍

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)
