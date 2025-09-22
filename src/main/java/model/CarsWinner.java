package model;

import model.random.RandomGenerator;
import model.random.RandomMoveStrategy;

import java.util.ArrayList;
import java.util.List;

public class CarsWinner {
    private final List<Car> cars = new ArrayList<>();
    RandomGenerator generateRandom = new RandomMoveStrategy();

    public List<String> findWinners() {
        int maxPosition = findMaxPosition();
        List<String> winners = new ArrayList<>();
        for (Car car : cars) {
            checkAndAddWinner(winners, car, maxPosition);
        }
        return winners;
    }

    private void checkAndAddWinner(List<String> winners, Car car, int maxPosition) {
        if (car.getPosition() == maxPosition) {
            winners.add(car.getName());
        }
    }

    private int findMaxPosition() {
        int maxPosition = 0;
        for (Car car : cars) {
            maxPosition = Math.max(car.getPosition(), maxPosition);
        }
        return maxPosition;
    }
}
