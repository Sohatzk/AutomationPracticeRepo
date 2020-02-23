package homeTask2Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;


public class CheckAssertions {
    @Test
    public void testMethod1() {
        Assert.assertEquals("String", "String", "Strings are not equal");
        Assert.assertEquals("String", "String");
        Assert.assertEquals(true, false, "boleans are not equal");
        Assert.assertEquals(true, true);
        Assert.assertEquals(Arrays.asList("foo", "bar"), Arrays.asList("foo", "Not bar"),
                "Elements of the collections are not equal");
        Assert.assertTrue(true, "Test passed");
        Assert.assertFalse(true, "The parameter is true so it != false");
        Assert.assertFalse(false);

    }
}
