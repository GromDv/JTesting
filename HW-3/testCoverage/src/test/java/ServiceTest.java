import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import testCoverage.SomeService;

public class ServiceTest {
    private SomeService srv;

    @BeforeEach
    void initSrvice() {
        SomeService srv = new SomeService();
        this.srv = srv;
    }

    @ParameterizedTest
    @ValueSource(ints = {2,3})
    void EvenOddNumberTest(int num) {
        if(num == 2)
            assert srv.evenOddNumber(num) == true;
        else if(num == 3)
            assert srv.evenOddNumber(num) == false;
    }

    @ParameterizedTest
    @ValueSource(ints = {10,30,120})
    void numberInIntervalTest(int num) {
        if(num < 25)
            assert srv.numberInInterval(num) == false;
        else if(num > 100)
            assert srv.numberInInterval(num) == false;
        else
            assert srv.numberInInterval(num) == true;
    }
}
