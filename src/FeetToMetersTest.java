import org.junit.Assert;

public class FeetToMetersTest {
    @org.junit.Test
    public void calculate() {
        Double expected_result = 30.5;
        Assert.assertEquals(30.5, expected_result, FeetToMeters.Calculate(100));

    }

}