package seleniumBaseApi;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCheckBoxes extends WebDriverSettings {
    @DataProvider
    public Object[][] cssLocators() {
        return new Object[][]{
                {"[value='checkbox-1']"},
                {"#checkbox-2"},
                {"[id='checkbox-3']"}
        };
    }

    @DataProvider
    public Object[][] xPathData() {
        return new Object[][]{
                {"//*[@value='checkbox-1']"},
                {"//*[@id='checkbox-2']"},
                {"//*[@class='row'][3]//input"}
        };
    }

    @BeforeClass
    @Override
    public void setUp() {
        super.setUp();
        driver.get("https://formy-project.herokuapp.com/checkbox");
    }

    @Test(dataProvider = "xPathData")
    public void testCheckBoxesWithXPath(String xPath) {
        driver.findElement(By.xpath(xPath)).click();
    }

    @Test(dataProvider = "cssLocators")
    public void testCheckBoxesWithCss(String css) {
        driver.findElement(By.cssSelector(css)).click();
    }

    @AfterClass
    public void quitPage() {
        driver.quit();
    }
}
