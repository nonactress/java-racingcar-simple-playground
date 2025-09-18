import java.util.Random;

public class GenerateCarRandom implements GenerateRandom {
    private Random random = new Random();

    @Override
    public int generate() {
        return random.nextInt(10);
    }
}
