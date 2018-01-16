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

    public void turnLeft() {
        switch (direction) {
            case "N":
                direction = "W";
                break;
            case "E":
                direction = "N";
                break;
            case "S":
                direction = "E";
                break;
            case "W":
                direction = "S";
                break;
        }
    }

    public void turnRight() {
        switch (direction) {
            case "N":
                direction = "E";
                break;
            case "E":
                direction = "S";
                break;
            case "S":
                direction = "W";
                break;
            case "W":
                direction = "N";
                break;
        }
    }

    public void moveForward(){
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
