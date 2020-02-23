package seleniumBaseApi;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestDropDownList extends WebDriverSettings {
    private String[] urls = {"https://formy-project.herokuapp.com/autocomplete", "https://formy-project.herokuapp.com/buttons",
            "https://formy-project.herokuapp.com/checkbox", "https://formy-project.herokuapp.com/datepicker",
            "https://formy-project.herokuapp.com/dragdrop", "https://formy-project.herokuapp.com/dropdown",
            "https://formy-project.herokuapp.com/enabled", "https://formy-project.herokuapp.com/fileupload",
            "https://formy-project.herokuapp.com/filedownload", "https://formy-project.herokuapp.com/keypress",
            "https://formy-project.herokuapp.com/modal", "https://formy-project.herokuapp.com/scroll",
            "https://formy-project.herokuapp.com/radiobutton", "https://formy-project.herokuapp.com/switch-window",
            "https://formy-project.herokuapp.com/form"};

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        driver.get("https://formy-project.herokuapp.com/dropdown");
    }

    @Test
    public void testDropDown() throws InterruptedException {
        for (int i = 1; i <= 15; i++) {
            driver.findElement(By.id("dropdownMenuButton")).click();
//            Thread.sleep(3000);
            String xPath = "//div[@class='dropdown-menu show']/a" + "[" + i + "]";
            driver.findElement(By.xpath(xPath)).click();
//            Thread.sleep(3000);
            Assert.assertEquals(driver.getCurrentUrl(), urls[i - 1], "The actual url doesn't match the expected");
            driver.get("https://formy-project.herokuapp.com/dropdown");
        }
    }
}


