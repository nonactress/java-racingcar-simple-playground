import java.util.Scanner;

public class RaceSetting {
    private Car[] cars;
    private int carNum;
    private int raceNum;

    public void setCarNum(Scanner scanner)
    {
        System.out.println("출전한 자동차 수: ");
        this.carNum = scanner.nextInt();
    }

    private void setRaceNum(Scanner scanner) {
        System.out.println("몇 번 달릴꺼야: ");
        this.raceNum = scanner.nextInt();
    }

    public void setCars(Scanner scanner) {
        this.cars=new Car[carNum];

        for(int i=0;i<raceNum;i++)
        {
            String temp=scanner.next();
            cars[i].setName(temp);
        }
    }

    RaceSetting()
    {
        Scanner scanner = new Scanner(System.in);
        setCarNum(scanner);
        setRaceNum(scanner);
        setCars(scanner);
        scanner.close();
    }
}
