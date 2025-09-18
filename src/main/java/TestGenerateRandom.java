public class TestGenerateRandom implements GenerateRandom {
    private final int TEST_NUM = 5;

    @Override
    public boolean generate() {
        if (TEST_NUM > MOVE_CONDITION) {
            return true;
        }
        return false;
    }
}
