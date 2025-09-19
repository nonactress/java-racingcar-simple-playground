package view;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public static String[] getCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String[] splitCar = scanner.nextLine().split(",");
        while(true)
        {
            if(isValid(splitCar)){
                return splitCar;
            }
            splitCar = scanner.nextLine().split(",");
        }

    }

    public static int getRaceCount() {
        System.out.println("시도할 회수는 몇회인가요?");
        int count = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 제거
        return count;
    }

    public static boolean isValid(String [] cars){
        if(cars.length == 1 ){
            System.out.println("한 개 이상의 자동차를 입력해주세요!");
            return false;
        }

        for (String car : cars) {
            if(car.trim().isEmpty())
            {
                System.out.println("자동차의 이름이 공백일 순 없습니다!");
                return false;
            }
        }
        return true;
    }
}
