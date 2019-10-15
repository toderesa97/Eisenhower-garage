import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GarageShould {

    @Test
    public void return_1_check_errors_for_current_garage() {
        Garage garage = new Garage();
        garage.add(new CheckWork("", 0));
        assertEquals(1, garage.countForCheckErrors());
    }

    @Test
    public void return_zero_check_errors_for_checked_check_works() {
        Garage garage = new Garage();
        garage.add(new CheckWork("", 0)
                .setChekList(new String[]{"Si", "Si", "Si", "Si", "Si", "Si", "Si", "Si", "Si", "Si"}));
        assertEquals(0, garage.countForCheckErrors());
    }

    @Test
    public void print_works_ordered_ASC_by_description() {
        Garage garage = new Garage();
        garage.add(new FixWork("b", 0));
        garage.add(new FixWork("a", 1));
        garage.add(new FixWork("d", 2));
        garage.add(new FixWork("z", 3));
        garage.add(new FixWork("w", 4));
        garage.add(new FixWork("f", 5));
        garage.saveAll();
    }

}
