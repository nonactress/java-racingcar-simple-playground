package model.Number;

public class IsMovable {
    private RandomNumberGenrator randomNumberGenrator= new RandomNumberGenrator();
    private static final int MOVE_CONITION = 4;

    public Boolean getcheck() {
        return randomNumberGenrator.genrator() > MOVE_CONITION;
    }
}
