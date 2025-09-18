import java.util.Random;

public class GenerateCarRandom implements GenerateRandom {
    private Random random = new Random();

    @Override
    public boolean generate() {
        if (random.nextInt(10) > MOVE_CONDITION) {
            return true;
        }
        return false;

    }
}
