import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CheckEmailUnhappyPath {
    @Test(dataProvider = "Email", dataProviderClass = UiTestsCases.class)
    public void checkUnhappyCase(String email) {
        boolean actualResult = Email.isEmailCorrect(email);
        Assert.assertEquals(actualResult, false);
    }
}
