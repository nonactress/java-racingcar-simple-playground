package controller;

import model.Cars;
import view.InputView;
import view.OutputView;

public class RacingController {
    public void run() {
        String[] carNames = InputView.getCarNames();
        int raceCount = InputView.getRaceCount();

        Cars cars = new Cars(carNames);

        OutputView.printResultMessage();
        RacingService racingService = new RacingService();
        racingService.startRace(cars, raceCount);

        OutputView.printWinners(cars.findWinners());
    }
}
