package model.random;

import java.util.Random;

public class RandomMoveStrategy implements RandomGenerator {
    private Random random = new Random();

    @Override
    public boolean generate() {
        if (random.nextInt(10) > RandomGenerator.MOVE_CONDITION) {
            return true;
        }
        return false;

    }
}
