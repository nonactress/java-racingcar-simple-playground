package controller;
import model.Cars;
import view.OutputView;

public class RacingService {
    public RacingService(Cars cars, int raceCount) {
        for(int i=0;i<raceCount;i++)
        {
            cars.moveAll(); // Model의 상태 변경 요청
            OutputView.printRoundResult(cars.getCars()); // View에 출력 요청
        }
    }
}
