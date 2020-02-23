package homeTask2Tests;

import homeTask2.VarargsExampleMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VarargsTests {
    @Test
    public void checkSumNumberMethods() {
        Assert.assertEquals(VarargsExampleMethods.sumNumber(1, 2), 3,
                "The sum of two numbers doesn't coincide with the expected");
        Assert.assertEquals(VarargsExampleMethods.sumNumber(1, 2, 3), 6,
                "The sum of three numbers doesn't coincide with the expected");
        Assert.assertEquals(VarargsExampleMethods.sum(1, 2, 3, 4, 5), 15,
                "The sum of numbers doesn't coincide with the expected");
    }

    @Test
    public void checkNegateMethod() {
        Assert.assertFalse(VarargsExampleMethods.negate(true, 1, 2, 3),
                "The returned boolean value doesn't coincide with the expected");
    }
}
