import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UiTestsCases {
    private final String adress = "C:\\Users\\sohat\\IdeaProjects\\Drivers\\chromedriver.exe";

    @Test
    public void verifyString() {
        System.setProperty("webdriver.chrome.driver", adress);
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.youtube.com");
    }
}
