import java.util.Scanner;
import java.util.Random;

public class RaceSetting {
    protected Car[] cars;
    protected int carNum;
    protected int raceNum;
    private static final int MINIMUM_SPEED_TO_MOVE = 4;

    Random random = new Random();


    public void setCarNum(Scanner scanner) {
        System.out.println("출전한 자동차 수: ");
        this.carNum = scanner.nextInt();
    }

    private void setRaceNum(Scanner scanner) {
        System.out.println("몇 번 달릴꺼야: ");
        this.raceNum = scanner.nextInt();
    }

    public void setCars(Scanner scanner) {
        this.cars = new Car[carNum];

        for (int i = 0; i < raceNum; i++) {
            System.out.println(i + "번 자동차 이름 : ");
            String temp = scanner.next();
            cars[i].setName(temp);
            setMoveCnt(cars[i]);
        }
    }


    public void setMoveCnt(Car temp) // car.move 진행
    {
        for (int i = 0; i < raceNum; i++) {
            checkSpeedTOMove(cars[i]);
        }

    }

    void checkSpeedTOMove(Car temp) {
        if (random.nextInt(10) > MINIMUM_SPEED_TO_MOVE) {
            temp.upmoveCnt();
        }
    }

    RaceSetting() {
        Scanner scanner = new Scanner(System.in);
        setCarNum(scanner);
        setRaceNum(scanner);
        setCars(scanner);
        scanner.close();
    }
}
