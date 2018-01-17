import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MissionTest {

    private Mission myMission;
    private Robot robot1;
    private Robot robot2;
    private Robot robot3;
    private String instructions1;
    private String instructions2;
    private String instructions3;

    @Before
    public void before(){
        myMission = new Mission(5, 3);
        robot1 = new Robot(1, 1, "E");
        robot2 = new Robot(3, 2, "N");
        robot3 = new Robot(0, 3, "W");
        instructions1 = "RFRFRFRF";
        instructions2 = "FRRFLLFFRRFLL";
        instructions3 = "LLFFFLFLFL";
    }

    @Test
    public void canCheckForScent(){
        myMission.addToLostCoords("5 5 N");
        assertEquals(true, myMission.checkForScent("5 5 N"));
    }



}
