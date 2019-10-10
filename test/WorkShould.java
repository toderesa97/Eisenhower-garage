import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WorkShould {

    private Work work;

    @Before
    public void init() {
        work = new Work("",0) {
            @Override
            public float getPrice() {
                return 0;
            }
        };
    }

    @Test
    public void initially_set_done_to_false() {
        assertFalse(work.isDone());
    }

    @Test
    public void get_empty_string_as_description() {
        assertEquals("", work.getDescription());
    }

    @Test
    public void get_price_zero() {
        assertEquals(0, work.getPrice(), 0.0001);
    }

    @Test
    public void get_ID_zero() {
        assertEquals(0, work.getID());
    }

    @Test
    public void initially_be_zero_taken_hours() {
        assertEquals(0, work.getTakenHours());
    }

    @Test
    public void sum_added_hours_to_taken_hours() {
        work.add(1);
        assertEquals(1, work.getTakenHours());
    }

    @Test
    public void set_new_description() {
        work.setDescription("a");
        assertEquals("a", work.getDescription());
    }

    @Test
    public void set_work_to_done() {
        work.markAsDone();
        assertTrue(work.isDone());
    }

}
