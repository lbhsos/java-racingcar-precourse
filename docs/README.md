# 요구사항 정리
- [ ] 자동차 이름은 사용자 입력을 쉼표(,)를 구분하여 얻을 수 있다.
- [ ] 경주 시도 횟수는 사용자가 입력한다.
- [ ] 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException을 발생시킨다.
  - [ ] Exception이 아닌 IllegalArgumentException, IllegalStateException 등과 같은 명확한 유형을 처리한다.
  - [ ] 사용자가 자동차 이름을 입력할 때 자동차 이름의 길이가 5자를 넘어서면 에러를 던진다.
  - [ ] 사용자가 자동차 이름을 입력할 때 자동차 이름의 길이가 1자보다 작으면 에러를 던진다.
  - [ ] 사용자가 자동차 이름을 입력할 때 문자가 아닐 경우 에러를 던진다.
  - [ ] 사용자가 시도 횟수를 입력할 때 숫자가 아닐 경우 에러를 던진다.
  - [ ] 사용자가 시도 횟수를 입력할 때 입력 길이가 1자보다 작으면 에러를 던진다.
  - [ ] 사용자 입력에서 에러가 발생할 경우 '[ERROR]'로 시작하는 에러메시지를 출력 후 그 부분부터 입력을 다시 받는다.
- [ ] 자동차는 주어진 횟수 동안 random값을 구하여 전진 또는 멈춘다.
  - [ ] random값은 0-9 사이에서 구한다.
  - [ ] random값이 4 이상일 경우 전진한다.
  - [ ] random값이 3 이하의 값이면 멈춘다.
- [ ] 각 시도횟수마다 자동차 이름과 전진거리를 같이 출력한다.
- [ ] 자동차 경주 게임을 완료한 후 누가 우승했는지 출력한다.
  - [ ] 우승자가 한 명 이상일 경우, 쉼표(,)로 이름을 구분해 출력한다.