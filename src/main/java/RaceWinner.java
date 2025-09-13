public class RaceWinner extends RaceSetting{
    int winnerCnt = -1;

    void findWinnerCnt() //
    {
        for (Car car : cars) {
            if(winnerCnt<car.getmoveCnt())
            {
                winnerCnt=car.getmoveCnt();
            }
        }
    }

    void printWinner()
    {
        System.out.println("우승 : ");
        for (Car car : cars) {
            if(winnerCnt==car.getmoveCnt())
            {
                System.out.println(car.getName());
            }
        }
    }





}
