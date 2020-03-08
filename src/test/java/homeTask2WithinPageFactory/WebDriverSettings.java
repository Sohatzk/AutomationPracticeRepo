package homeTask2WithinPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class WebDriverSettings {
    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        String address = "C:\\Users\\sohat\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", address);
        driver = new ChromeDriver();
    }

    @AfterClass
    public void quitPage() {
        driver.quit();
    }
}

