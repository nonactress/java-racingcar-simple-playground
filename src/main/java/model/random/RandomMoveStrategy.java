package model.random;

import java.util.Random;

public class RandomMoveStrategy implements RandomGenerater {
    private Random random = new Random();

    @Override
    public boolean generate() {
        if (random.nextInt(10) > RandomGenerater.MOVE_CONDITION) {
            return true;
        }
        return false;

    }
}
