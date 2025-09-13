public class Car {

    private String name;
    private int moveCnt=0;


    public int getmoveCnt() {
        return moveCnt;
    }

    public void upmoveCnt() {
        moveCnt++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
