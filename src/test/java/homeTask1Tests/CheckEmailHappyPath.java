package homeTask1Tests;

import homeTask1.Email;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckEmailHappyPath {
    @DataProvider(name = "emailsForHappyPath")
    public Object[][] dataProviderMethod() {
        return new Object[][]{
                {"soHAtzky13!_@KnU1.com"},
                {"soh@gmail.com"},
                {"soha@gmail.com"},
                {"1234567890123456789@gmail.com"},
                {"12345678901234567890@gmail.com"},
                {"sohatzky@gm.com"},
                {"sohatzky@gma.com"},
                {"sohatzky@gmai.com"},
                {"sohatzky@gmail.com"},
                {"sohatzky@gmail.co"},
                {"sohatzky@gmail.comm"},
                {"sohatzky@gmail.commm"}
        };
    }

    @Test(dataProvider = "emailsForHappyPath")
    public void checkHappyPath(String email) {
        boolean actualResult = Email.isEmailCorrect(email);
        Assert.assertTrue(actualResult, "Email is incorrect");
    }
}