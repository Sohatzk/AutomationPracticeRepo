package seleniumBaseApi;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDropDownList extends WebDriverSettings {
    @DataProvider
    public Object[][] urlAndXPathData() {
        return new Object[][]{
                {"//div[@class='dropdown-menu show']/a[1]", "https://formy-project.herokuapp.com/autocomplete"},
                {"//div[@class='dropdown-menu show']/a[2]", "https://formy-project.herokuapp.com/buttons"},
                {"//div[@class='dropdown-menu show']/a[3]", "https://formy-project.herokuapp.com/checkbox"},
                {"//div[@class='dropdown-menu show']/a[4]", "https://formy-project.herokuapp.com/datepicker"},
                {"//div[@class='dropdown-menu show']/a[5]", "https://formy-project.herokuapp.com/dragdrop"},
                {"//div[@class='dropdown-menu show']/a[6]", "https://formy-project.herokuapp.com/dropdown"},
                {"//div[@class='dropdown-menu show']/a[7]", "https://formy-project.herokuapp.com/enabled"},
                {"//div[@class='dropdown-menu show']/a[8]", "https://formy-project.herokuapp.com/fileupload"},
                {"//div[@class='dropdown-menu show']/a[9]", "https://formy-project.herokuapp.com/filedownload"},
                {"//div[@class='dropdown-menu show']/a[10]", "https://formy-project.herokuapp.com/keypress"},
                {"//div[@class='dropdown-menu show']/a[11]", "https://formy-project.herokuapp.com/modal"},
                {"//div[@class='dropdown-menu show']/a[12]", "https://formy-project.herokuapp.com/scroll"},
                {"//div[@class='dropdown-menu show']/a[13]", "https://formy-project.herokuapp.com/radiobutton"},
                {"//div[@class='dropdown-menu show']/a[14]", "https://formy-project.herokuapp.com/switch-window"},
                {"//div[@class='dropdown-menu show']/a[15]", "https://formy-project.herokuapp.com/form"}
        };
    }

    @BeforeMethod
    public void beforeClickDropDowns() {
        driver.get("https://formy-project.herokuapp.com/dropdown");
    }

    @Test(dataProvider = "urlAndXPathData")
    public void testDropDown(String[] urlAndXPath) {
        driver.findElement(By.id("dropdownMenuButton")).click();
        driver.findElement(By.xpath(urlAndXPath[0])).click();
        Assert.assertEquals(driver.getCurrentUrl(), urlAndXPath[1],
                "The actual url: \"" + driver.getCurrentUrl() + "\" - doesn't match the expected: \"" + urlAndXPath[1] + "\"");
    }

    @AfterClass
    public void quitPage() {
        driver.quit();
    }
}



