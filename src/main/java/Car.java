public class Car {
    private static final int MOVE_CONDITION = 4; // 전진 조건
    private String name;
    private int position = 0;


    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }

    public void move(int randomNumber) {
        if (randomNumber >= MOVE_CONDITION) {
            this.position++;
        }
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
