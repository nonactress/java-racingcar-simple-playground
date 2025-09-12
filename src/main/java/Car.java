
public class Car {

    private final String name;
    private int speed;
    private int speedCnt;
    private static final int MINIMUM_SPEED_TO_MOVE = 4;

    public Car(String name) {
        this.name = name;
        this.speedCnt=0;
    }

    public int getSpeedCnt() {
        return speedCnt;
    }

    private void upSpeedCnt() {
        speedCnt++;
    }

    public String getName() {
        return name;
    }

    private void setSpeed() {
        java.util.Random random = new java.util.Random();
        this.speed = random.nextInt(10);
    }

    public void carMove() {
        setSpeed();
        if (speed >= MINIMUM_SPEED_TO_MOVE) {
            upSpeedCnt();
        }
    }

}
