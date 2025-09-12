
public class Car {

    private final String name;
    private int speed;
    private int speedCnt;
    private final int MINIMUM_SPEED_TO_MOVE = 4;
    java.util.Random random = new java.util.Random();

    public Car(String name) {
        this.name = name;
        this.speedCnt = 0;
    }

    public int getSpeedCnt() {

        if (speedCnt < Integer.MAX_VALUE) {
            speedCnt++;
        }
        return speedCnt;
    }

    private void upSpeedCnt() {
        speedCnt++;
    }

    public String getName() {
        return name;
    }

    private void setSpeed() {
        this.speed = random.nextInt(10);
    }

    public void carMove() {
        setSpeed();
        if (speed >= MINIMUM_SPEED_TO_MOVE) {
            upSpeedCnt();
        }
    }

}
