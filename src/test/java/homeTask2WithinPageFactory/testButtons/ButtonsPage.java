package homeTask2WithinPageFactory.testButtons;

import homeTask2WithinPageFactory.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ButtonsPage extends PageObject {

    @FindBy(xpath = "//button[text()='Primary']")
    private WebElement primaryButton;

    @FindBy(xpath = "//button[text()='Success']")
    private WebElement successButton;

    @FindBy(xpath = "//button[@class='btn btn-lg btn-info']")
    private WebElement infoButton;

    @FindBy(xpath = "//button[@class='btn btn-lg btn-warning']")
    private WebElement warningButton;

    @FindBy(xpath = "//button[text()='Danger']")
    private WebElement dangerButton;

    @FindBy(xpath = "//button[text()='Link']")
    private WebElement linkButton;

    @FindBy(xpath = "//button[text()='Left']")
    private WebElement leftButton;

    @FindBy(xpath = "//button[text()='Middle']")
    private WebElement middleButton;

    @FindBy(xpath = "//button[text()='Right']")
    private WebElement rightButton;

    @FindBy(xpath = "//button[text()='1']")
    private WebElement button_1;

    @FindBy(xpath = "//button[text()='2']")
    private WebElement button_2;

    @FindBy(id = "btnGroupDrop1")
    private WebElement groupDropDown;

    @FindBy(xpath = "//a[text()='Dropdown link 1']")
    private WebElement groupDropDownLink1;


    public ButtonsPage(WebDriver driver) {
        super(driver);
        instanceCreationConfirmation();
    }

    public void instanceCreationConfirmation() {
        Assert.assertTrue(primaryButton.isDisplayed(), "Primary button is not displayed");
        Assert.assertTrue(successButton.isDisplayed(), "Success button is not displayed");
        Assert.assertTrue(infoButton.isDisplayed(), "Info button is not displayed");
        Assert.assertTrue(warningButton.isDisplayed(), "Warning button is not displayed");
        Assert.assertTrue(dangerButton.isDisplayed(), "Danger button is not displayed");
        Assert.assertTrue(linkButton.isDisplayed(), "Link button is not displayed");
        Assert.assertTrue(leftButton.isDisplayed(), "Left button is not displayed");
        Assert.assertTrue(middleButton.isDisplayed(), "Middle button is not displayed");
        Assert.assertTrue(rightButton.isDisplayed(), "Right button is not displayed");
        Assert.assertTrue(button_1.isDisplayed(), "Button 1 button is not displayed");
        Assert.assertTrue(button_2.isDisplayed(), "Button 2 button is not displayed");
        Assert.assertTrue(groupDropDown.isDisplayed(), "Group drop down button is not displayed");
    }

    public String getUrlOfPage() {
        return driver.getCurrentUrl();
    }

    public void clickPrimaryButton() {
        primaryButton.click();
    }

    public void clickSuccessButton() {
        successButton.click();
    }

    public void clickInfoButton() {
        infoButton.click();
    }

    public void clickWarningButton() {
        warningButton.click();
    }

    public void clickDangerButton() {
        dangerButton.click();
    }

    public void clickLinkButton() {
        linkButton.click();
    }

    public void clickLeftButton() {
        leftButton.click();
    }

    public void clickMiddleButton() {
        middleButton.click();
    }

    public void clickRightButton() {
        rightButton.click();
    }

    public void click1Button() {
        button_1.click();
    }

    public void click2Button() {
        button_2.click();
    }

    public DropDownBox clickGroupDropDown() {
        groupDropDown.click();
        return new DropDownBox(driver);
    }

}
