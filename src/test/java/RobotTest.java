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

}
