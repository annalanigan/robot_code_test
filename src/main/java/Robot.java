public class Robot {

    private int robotX;
    private int robotY;
    private String direction;

    public Robot(int inputX, int inputY, String dir) {
        this.robotX = inputX;
        this.robotY = inputY;
        this.direction = dir;
    }

    public int getRobotX() {
        return robotX;
    }

    public void setRobotX(int robotX) {
        this.robotX = robotX;
    }

    public int getRobotY() {
        return robotY;
    }

    public void setRobotY(int robotY) {
        this.robotY = robotY;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void changeDirection(String turn){
        // if turn == L
        // case when N change to W
        //      when E change to N
        //      when S change to E
        //      when W change to S
        // if turn == R
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

    // public String getCombined(){
        // get all coordinates back in a string
        // return String result;
    // }

}
