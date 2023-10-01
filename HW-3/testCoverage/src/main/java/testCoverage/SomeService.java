package testCoverage;

public class SomeService {

    public boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean numberInInterval(int n) {
        if (n > 25 && n < 100)
            return true;
        else
            return false;
    }

}
