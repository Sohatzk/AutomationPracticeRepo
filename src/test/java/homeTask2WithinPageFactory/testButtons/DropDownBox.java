package homeTask2WithinPageFactory.testButtons;

import homeTask2WithinPageFactory.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class DropDownBox extends PageObject {

    @FindBy(xpath = "//a[text()='Dropdown link 2']")
    private WebElement groupDropDownLink1;

    @FindBy(xpath = "//a[text()='Dropdown link 2']")
    private WebElement groupDropDownLink2;

    DropDownBox(WebDriver driver) {
        super(driver);

    }

    public void instanceCreationConfirmation() {
        Assert.assertTrue(groupDropDownLink1.isDisplayed(), "DropDownLink1 button is not displayed");
        Assert.assertTrue(groupDropDownLink2.isDisplayed(), "DropDownLink2 down button is not displayed");
    }

    public String getUrlOfPage() {
        return driver.getCurrentUrl();
    }

    public void clickGroupDropDownLink1() {
        groupDropDownLink1.click();
    }

    public void clickGroupDropDownLink2() {
        groupDropDownLink2.click();
    }

}
