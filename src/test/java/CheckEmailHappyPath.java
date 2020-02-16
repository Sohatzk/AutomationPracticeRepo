import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckEmailHappyPath {
    @Test(dataProvider = "Email", dataProviderClass = UiTestsCases.class)
    public void checkHappyCase(String email) {
        boolean actualResult = Email.isEmailCorrect(email);
        Assert.assertEquals(actualResult, true);
    }
}
