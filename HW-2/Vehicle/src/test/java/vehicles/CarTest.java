package vehicles;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CarTest {
    Car myCar = null;

    @BeforeEach
    void initCar() {
        Car myCar = new Car("BMW", "X5", 2020);
        this.myCar = myCar;
    }

    @Test
    void testCarClass() {
        assert myCar instanceof Vehicle;
    }

    @Test
    void testCarHas4Wheels() {
        assert myCar.getNumWheels() == 4;
    }

    @ParameterizedTest
    @ValueSource(ints = {60})
    void testCarHas60TestdriveSpeed(int speed) {
        myCar.testDrive();
        assert myCar.getSpeed() == speed;
    }

    @ParameterizedTest
    @ValueSource(ints = {0})
    void testCarParkingStop(int speed) {
        myCar.testDrive();
        myCar.park();
        assert myCar.getSpeed() == speed;
    }

}
