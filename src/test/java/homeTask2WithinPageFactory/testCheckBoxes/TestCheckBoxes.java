package homeTask2WithinPageFactory.testCheckBoxes;


import homeTask2WithinPageFactory.WebDriverSettings;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCheckBoxes extends WebDriverSettings {
    protected CheckBoxesPage checkBoxesPage;
    private String expectedURL = "https://formy-project.herokuapp.com/checkbox";

    @BeforeClass
    @Override
    public void setUp() {
        super.setUp();
        driver.get("https://formy-project.herokuapp.com/checkbox");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        checkBoxesPage = new CheckBoxesPage(driver);
    }

    @DataProvider()
    public Object[][] xPathData() {
        return new Object[][]{
                {checkBoxesPage.getCheckBox1ViaXpath()},
                {checkBoxesPage.getCheckBox2ViaXPath()},
                {checkBoxesPage.getCheckBox3ViaXPath()}
        };
    }

    @DataProvider()
    public Object[][] cssLocators() {
        return new Object[][]{
                {checkBoxesPage.getCheckBox1ViaCSS()},
                {checkBoxesPage.getCheckBox2ViaCSS()},
                {checkBoxesPage.getCheckBox3ViaCSS()}
        };
    }

    @Test(dataProvider = "xPathData")
    public void testCheckBoxesWithXPath(WebElement elem) {
        elem.click();
        Assert.assertEquals(expectedURL, checkBoxesPage.getUrlOfPage(),
                "The current url: \"" + checkBoxesPage.getUrlOfPage() + "\" doesn't match the expected: \"" + expectedURL + "\"");
    }

    @Test(dataProvider = "cssLocators")
    public void testCheckBoxesWithCss(WebElement elem) {
        elem.click();
        Assert.assertEquals(expectedURL, checkBoxesPage.getUrlOfPage(),
                "The current url: \"" + checkBoxesPage.getUrlOfPage() + "\" doesn't match the expected: \"" + expectedURL + "\"");
    }
}

