import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckWorkShould {

    private CheckWork checkWork;

    @Before
    public void init() {
        checkWork = new CheckWork("", 0);
    }

    @Test
    public void multiply_taken_hours_by_30_plus_20() {
        checkWork.add(5);
        assertEquals(170, checkWork.getPrice(), 0.0001);
    }

}
