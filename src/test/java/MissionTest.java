import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MissionTest {

    private Mission myMission;

    @Before
    public void before(){
        myMission = new Mission();
    }

    @Test
    public void robot1Test(){
        assertEquals("1 1 E", myMission.robot1Mission());
    }

    @Test
    public void robot2Test(){
        assertEquals("3 3 N LOST", myMission.robot2Mission());
    }

    @Test
    public void robot3Test(){
        assertEquals("2 3 S", myMission.robot3Mission());
    }



}
