public class Robot {

    private int robotX;
    private int robotY;
    private String direction;

    public void Robot(int inputX, int inputY, String dir) {
        this.robotX = inputX;
        this.robotY = inputY;
        this.direction = dir;
    }

    public void changeDirection(){
        // if instruction == L
        // case when N change to W
        //      when E change to N
        //      when S change to E
        //      when W change to S
        // if instruction == R
        // case when N change to E
        //      when E change to S
        //      when S change to W
        //      when W change to N
    }

    public void changePosition(){
        // if instruction == F
        // when direction == N
        //      y++
        // when direction == E
        //      x--
        // when direction == S
        //      y--
        // when direction == W
        //      x++
    }

}
