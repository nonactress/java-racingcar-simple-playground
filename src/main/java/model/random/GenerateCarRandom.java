package model.random;

import java.util.Random;
import model.random.GenerateCarRandom;

public class GenerateCarRandom implements GenerateRandom {
    private Random random = new Random();

    @Override
    public boolean generate() {
        if (random.nextInt(10) > GenerateRandom.MOVE_CONDITION) {
            return true;
        }
        return false;

    }
}
