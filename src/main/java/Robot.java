public class Robot {

    private Integer robotX;
    private Integer robotY;
    private String direction;

    public Robot(Integer inputX, Integer inputY, String dir) {
        this.robotX = inputX;
        this.robotY = inputY;
        this.direction = dir;
    }

    public int getRobotX() {
        return robotX;
    }

    public void setRobotX(Integer robotX) {
        this.robotX = robotX;
    }

    public int getRobotY() {
        return robotY;
    }

    public void setRobotY(Integer robotY) {
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
        switch (direction) {
            case "N":
                robotY++;
                break;
            case "E":
                robotX++;
                break;
            case "S":
                robotY--;
                break;
            case "W":
                robotX--;
                break;
        }
    }

     public String getCombinedCoordinates(){
        String result = robotX.toString() + " " + robotY.toString() + " " + direction;
        return result;
     }

}
