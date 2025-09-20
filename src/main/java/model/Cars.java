package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.random.RandomMoveStrategy;
import model.random.RandomGenerator;

public class Cars {
    private final List<Car> cars;
    RandomGenerator generateRandom = new RandomMoveStrategy();
    //model.random.GenerateRandom testGenerateRandom = new model.random.TestGenerateRandom(); //단위 테스트용 코드

    public Cars(String[] carNames) {
        this.cars = new ArrayList<>();
        for (String name : carNames) {
            cars.add(new Car(name));
        }
    }

    public void moveAll() {
        for (Car car : cars) {
            move(car);
        }
    }

    private void move(Car car) {
        if (generateRandom.generate()) {
            car.move();
        }
//        if (testGenerateRandom.generate()) {
//            car.move();
//        }
    }

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

    public List<Car> getCars() {
        return Collections.unmodifiableList(cars);

        /*return this.cars;
         *위 방식을 안쓴 이유는 객체를 받아서 다른 메소드나 클래스에서
         *수정이 가능해 지기 때문에 위 컬렉션 메소드로 반환값 설정
         * */
    }
}
