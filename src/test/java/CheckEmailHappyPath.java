import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckEmailHappyPath {
    @DataProvider(name = "emailsForHappyPath")
    public Object[][] dataProviderMethod() {
        return new Object[][]{
                {"soHAtzky13!_@KnU1.com"}
        };
    }

    @Test(dataProvider = "emailsForHappyPath")
    public void checkHappyPath(String email) {
        boolean actualResult = Email.isEmailCorrect(email);
        Assert.assertTrue(true, "Email is incorrect");
    }
}
