package model.Number;

import java.util.Random;

public class RandomNumberGenrator implements NumberGenrator{

    @Override
    public int genrator()
    {
        final Random random = new Random();
        return random.nextInt(10);
    }
}
