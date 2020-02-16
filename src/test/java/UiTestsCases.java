import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UiTestsCases {
    private static WebDriver driver;
    @DataProvider(name = "Email")
    public Object[][] dataProviderMethod() {
        return new Object[][] {
                { "sohatzky13!_@gmail.com" },
                { "sohatzkygmail.com" },
                {"sohatzky@gmailcom"},
                {"so@gmail.com"},
                {"soh@gmail.com"},
                {"12345678901234567890@gmail.com"},
                {"123456789012345678901@gmail.com"},
                {"?????@gmail.com"},
                {"sohatzky@g.com"},
                {"sohatzky@gm.com"},
                {"sohatzky@gmail.com"},
                {"sohatzky@gmaill.com"},
                {"sohatzky@???.com"},
                {"sohatzky@gmail.c"},
                {"sohatzky@gmail.co"},
                {"sohatzky@g.commm"},
                {"sohatzky@g.commmm"},
                {"sohatzky@gmail.???"},
                {"sohatzky@gmail.COM"}};
    }
    @Test
    public void verifyString() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sohat\\IdeaProjects\\Drivers\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.youtube.com");
    }
}
