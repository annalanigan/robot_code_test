import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsTest {

    private Mars mars1;
    private Mars mars2;

    @Before
    public void before(){
        mars1 = new Mars(5,5);
        mars2 = new Mars(2,4);
    }

    @Test
    public void canBuildXAxis(){
        mars1.buildXAxis();
        assertEquals(6, mars1.getSizeOfInner());
    }

    @Test
    public void canBuildMars(){
        mars2.buildMars();
        assertEquals(3, mars2.getSizeOfInner());
        assertEquals(5, mars2.getSizeOfOuter());
    }

}
