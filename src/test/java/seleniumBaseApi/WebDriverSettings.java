package seleniumBaseApi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class WebDriverSettings {
    private final String adress = "C:\\Users\\sohat\\IdeaProjects\\Drivers\\chromedriver.exe";
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", adress);
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void close() {
        driver.quit();
    }
}
