
import java.util.Scanner;

public class CarMain {
  //  public int maxIndex(int[] arr,int max)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("출전한 자동차 : ");
        int carNum = scanner.nextInt();

        System.out.println("몇 번 달릴까? : ");
        int raceNum = scanner.nextInt();

        scanner.close();

        Car[] cars = new Car[carNum];
        int[] forwardCnt = new int[carNum];
        int maxCnt=-1;

        for (int i = 0; i < carNum; i++) {
            race(cars, i, raceNum);
        }

        showFrowardCnt(cars,carNum);

        System.out.print("우승한 car : ");

        for(int i=0;i<carNum;i++)
        {
            forwardCnt[i] = cars[i].getSpeedCnt();
            maxCnt=Math.max(maxCnt,forwardCnt[i]);
        }

        for(int i=0;i<carNum;i++)
        {
            showFirstPrize(maxCnt, forwardCnt, i, cars);
        }

    }

    private static void showFirstPrize(int maxCnt, int[] forwardCnt, int i, Car[] cars) {
        if(maxCnt == forwardCnt[i])
        {
            System.out.print(cars[i].getName() + " " );
        }
    }


    private static void showFrowardCnt(Car[] cars,int carNum) {
        for(int i = 0; i< carNum; i++){
            System.out.println(cars[i].getName()+ "forwardCnt = " + cars[i].getSpeedCnt());
        }
    }

    private static void race(Car[] cars, int i, int raceNum) {
        cars[i] = new Car("F" + (i + 1));
        for(int j = 0; j< raceNum; j++)
        {
            cars[i].carMove();
        }
    }

}
