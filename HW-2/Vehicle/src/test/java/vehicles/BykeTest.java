package vehicles;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BykeTest {
    Motorcycle myByke = null;
    @BeforeEach
    void initByke() {
        Motorcycle myByke = new Motorcycle("BMW","Striker", 2020);
        this.myByke = myByke;
    }
    @Test
    void testMotorcycleHas2Wheels() {
        assert myByke.getNumWheels() == 2;
    }
    @Test
    void testMotorcycleHas75TestdriveSpeed() {
        myByke.testDrive();
        assert myByke.getSpeed() == 75;
    }
    @Test
    void testMotorcycleParkingStop() {
        myByke.testDrive();
        myByke.park();
        assert myByke.getSpeed() == 0;
    }
}
