package homeTask2WithinPageFactory.testButtons;

import homeTask2WithinPageFactory.WebDriverSettings;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestButtons extends WebDriverSettings {
    ButtonsPage buttonsPage;
    String expectedURL = "https://formy-project.herokuapp.com/buttons";

    @BeforeClass
    @Override
    public void setUp() {
        super.setUp();
        driver.get("https://formy-project.herokuapp.com/buttons");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        buttonsPage = new ButtonsPage(driver);
    }


    @Test(priority = 0)
    public void testPrimaryButton() {
        buttonsPage.clickPrimaryButton();
        Assert.assertEquals(expectedURL, buttonsPage.getUrlOfPage(),
                "The current url: \"" + buttonsPage.getUrlOfPage() + "\" doesn't match the expected: \"" + expectedURL + "\"");
    }

    @Test(priority = 1)
    public void testSuccessButton() {
        buttonsPage.clickSuccessButton();
        Assert.assertEquals(expectedURL, buttonsPage.getUrlOfPage(),
                "The current url: \"" + buttonsPage.getUrlOfPage() + "\" doesn't match the expected: \"" + expectedURL + "\"");
    }

    @Test(priority = 3)
    public void testInfoButton() {
        buttonsPage.clickInfoButton();
        Assert.assertEquals(expectedURL, buttonsPage.getUrlOfPage(),
                "The current url: \"" + buttonsPage.getUrlOfPage() + "\" doesn't match the expected: \"" + expectedURL + "\"");
    }

    @Test(priority = 4)
    public void testWarningButton() {
        buttonsPage.clickWarningButton();
        Assert.assertEquals(expectedURL, buttonsPage.getUrlOfPage(),
                "The current url: \"" + buttonsPage.getUrlOfPage() + "\" doesn't match the expected: \"" + expectedURL + "\"");
    }

    @Test(priority = 5)
    public void testDangerButton() {
        buttonsPage.clickDangerButton();
        Assert.assertEquals(expectedURL, buttonsPage.getUrlOfPage(),
                "The current url: \"" + buttonsPage.getUrlOfPage() + "\" doesn't match the expected: \"" + expectedURL + "\"");
    }

    @Test(priority = 6)
    public void testLinkButton() {
        buttonsPage.clickLeftButton();
        Assert.assertEquals(expectedURL, buttonsPage.getUrlOfPage(),
                "The current url: \"" + buttonsPage.getUrlOfPage() + "\" doesn't match the expected: \"" + expectedURL + "\"");
    }

    @Test(priority = 7)
    public void testMiddleButton() {
        buttonsPage.clickMiddleButton();
        Assert.assertEquals(expectedURL, buttonsPage.getUrlOfPage(),
                "The current url: \"" + buttonsPage.getUrlOfPage() + "\" doesn't match the expected: \"" + expectedURL + "\"");
    }

    @Test(priority = 8)
    public void testRightButton() {
        buttonsPage.clickRightButton();
        Assert.assertEquals(expectedURL, buttonsPage.getUrlOfPage(),
                "The current url: \"" + buttonsPage.getUrlOfPage() + "\" doesn't match the expected: \"" + expectedURL + "\"");
    }

    @Test(priority = 9)
    public void test1Button() {
        buttonsPage.click1Button();
        Assert.assertEquals(expectedURL, buttonsPage.getUrlOfPage(),
                "The current url: \"" + buttonsPage.getUrlOfPage() + "\" doesn't match the expected: \"" + expectedURL + "\"");
    }

    @Test(priority = 10)
    public void test2Button() {
        buttonsPage.click2Button();
        Assert.assertEquals(expectedURL, buttonsPage.getUrlOfPage(),
                "The current url: \"" + buttonsPage.getUrlOfPage() + "\" doesn't match the expected: \"" + expectedURL + "\"");
    }

    @Test(priority = 11)
    public void testDropDownLink1Button() {
        DropDownBox dropDownBox = buttonsPage.clickGroupDropDown();
        dropDownBox.clickGroupDropDownLink1();
        Assert.assertEquals(expectedURL + '#', dropDownBox.getUrlOfPage(),
                "The current url: \"" + dropDownBox.getUrlOfPage() + "\" doesn't match the expected: \"" + expectedURL + "#\"");
    }

    @Test(priority = 12)
    public void testDropDownLink2Button() {
        driver.get("https://formy-project.herokuapp.com/buttons");
        DropDownBox dropDownBox = buttonsPage.clickGroupDropDown();
        dropDownBox.clickGroupDropDownLink2();
        Assert.assertEquals(expectedURL + '#', dropDownBox.getUrlOfPage(),
                "The current url: \"" + dropDownBox.getUrlOfPage() + "\" doesn't match the expected: \"" + expectedURL + "#\"");
    }

}