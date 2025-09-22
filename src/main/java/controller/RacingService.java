package controller;

import model.Cars;
import model.random.RandomGenerator;
import model.random.RandomMoveStrategy;
import view.OutputView;

public class RacingService {
    public void startRace(Cars cars, int raceCount) {
        RandomGenerator generateRandom = new RandomMoveStrategy();

        for (int i = 0; i < raceCount; i++) {
            cars.moveAll(generateRandom); // Model의 상태 변경 요청
            OutputView.printRoundResult(cars.getCars()); // View에 출력 요청
        }
    }
}
