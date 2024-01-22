import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.devtonin.Car;
import com.devtonin.Main;

public class CarTest {
    
    @Test
    public void whenNumberOfCarObjectsInitializedThenStaticCounterIncreases () {
        new Car("Vectra", "2.0 aspirado");
        new Car("Tracker", "1.4 turbo");

        //Car.numberOfCars++;

        //Main.setNumberOfCars(4);

        assertEquals(2, Car.numberOfCars);
    }
}
