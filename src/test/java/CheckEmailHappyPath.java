import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckEmailHappyPath {
    @DataProvider
    public Object[][] happyEmailsData() {
        return new Object[][]{
                {"_!G@K2.ua"},
                {"soHAtzky1234567!07!_@KnU12.commm"}
        };
    }

    @Test(dataProvider = "happyEmailsData")
    public void checkHappyPath(String email) {
        boolean actualResult = Email.isEmailCorrect(email);
        Assert.assertTrue(actualResult, "Email " + email + " is incorrect");
    }
}
