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
                setDirection("W");
                break;
            case "E":
                setDirection("N");
                break;
            case "S":
                setDirection("E");
                break;
            case "W":
                setDirection("S");
                break;
        }
    }

    public void turnRight() {
        switch (direction) {
            case "N":
                setDirection("E");
                break;
            case "E":
                setDirection("S");
                break;
            case "S":
                setDirection("W");
                break;
            case "W":
                setDirection("N");
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

    public String receiveInstructionList(String instruction) {
        for (char item : instruction.toCharArray()) {
            receiveInstruction(item);
        }
        return getCombinedCoordinates();
    }

    public void receiveInstruction(char command){
        switch(command) {
            case 'F':
                moveForward();
                break;
            case 'R':
                turnRight();
                break;
            case 'L':
                turnLeft();
                break;
        }
    }

    public String getCombinedCoordinates(){
        String result = robotX.toString() + " " + robotY.toString() + " " + direction;
        return result;
     }


}
