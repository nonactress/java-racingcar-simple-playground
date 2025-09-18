public class RacingController {
    public void run() {
        String[] carNames = InputView.getCarNames();
        int raceCount = InputView.getRaceCount();

        Cars cars = new Cars(carNames);

        OutputView.printResultMessage();
        for (int i = 0; i < raceCount; i++) {
            cars.moveAll(); // Model의 상태 변경 요청
            OutputView.printRoundResult(cars.getCars()); // View에 출력 요청
        }

        OutputView.printWinners(cars.findWinners());
    }
}
