import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RobotTest {

    private Robot robot1;
    private Robot robot2;

    @Before
    public void before(){
        this.robot1 = new Robot(1, 1, "N");
        this.robot2 = new Robot(2, 3, "E");
    }

    @Test
    public void robotHasCoordinates(){
        assertEquals(1, robot1.getRobotX());
        assertEquals(1, robot1.getRobotY());
        assertEquals(2, robot2.getRobotX());
        assertEquals(3, robot2.getRobotY());
    }

    @Test
    public void robotCanTurnLeft(){
        robot1.turnLeft();
        robot2.turnLeft();
        assertEquals("W", robot1.getDirection());
        assertEquals("N", robot2.getDirection());
    }

    @Test
    public void robotCanTurnRight(){
        robot1.turnRight();
        robot2.turnRight();
        assertEquals("E", robot1.getDirection());
        assertEquals("S",robot2.getDirection());
    }

    @Test
    public void robotCanMove__N(){
        robot1.moveForward();
        assertEquals(2, robot1.getRobotY());
        assertEquals(1, robot1.getRobotX());
    }

    @Test
    public void robotCanMove__E(){
        robot2.moveForward();
        assertEquals(3, robot2.getRobotY());
        assertEquals(3, robot2.getRobotX());
    }

    @Test
    public void robotCanMove__S(){
        robot2.turnRight();
        robot2.moveForward();
        assertEquals(2, robot2.getRobotY());
        assertEquals(2, robot2.getRobotX());
    }

    @Test
    public void robotCanMove__W(){
        robot1.turnLeft();
        robot1.moveForward();
        assertEquals(1, robot1.getRobotY());
        assertEquals(0, robot1.getRobotX());
    }

    @Test
    public void canGetCombinedCoordinates__1(){
        assertEquals("1 1 N", robot1.getCombinedCoordinates());
    }

    @Test
    public void canGetCombinedCoordinates__2(){
        assertEquals("2 3 E", robot2.getCombinedCoordinates());
    }

    @Test
    public void canTurnMoveAndReturn(){
        robot1.turnRight();
        robot1.moveForward();
        robot1.moveForward();
        assertEquals("3 1 E", robot1.getCombinedCoordinates());
    }

}
