import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UiTestsCases {

    @Test
    public void verifyString() {
        String address = "C:\\Users\\sohat\\IdeaProjects\\Drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", address);
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.youtube.com");
    }
}
