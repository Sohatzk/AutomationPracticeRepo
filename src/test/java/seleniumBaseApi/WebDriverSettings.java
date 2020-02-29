package seleniumBaseApi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class WebDriverSettings {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        String address = "C:\\Users\\sohat\\IdeaProjects\\Drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", address);
        driver = new ChromeDriver();
    }
}
