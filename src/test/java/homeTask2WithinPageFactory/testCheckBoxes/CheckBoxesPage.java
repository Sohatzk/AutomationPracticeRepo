package homeTask2WithinPageFactory.testCheckBoxes;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CheckBoxesPage {
    protected WebDriver driver;
    @FindBy(xpath = "//*[@value='checkbox-1']")
    private WebElement checkBox1xPath;
    @FindBy(xpath = "//*[@id='checkbox-2']")
    private WebElement checkBox2xPath;
    @FindBy(xpath = "//*[@class='row'][3]//input")
    private WebElement checkBox3xPath;
    @FindBy(css = "[id='checkbox-3']")
    private WebElement checkBox1css;
    @FindBy(css = "[id='checkbox-3']")
    private WebElement checkBox2css;
    @FindBy(css = "[id='checkbox-3']")
    private WebElement checkBox3css;


    public CheckBoxesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        instanceCreationConfirmation();
    }

    public void instanceCreationConfirmation() {
        Assert.assertTrue(checkBox1xPath.isDisplayed(), "Checkbox 1 is not displayed");
        Assert.assertTrue(checkBox2xPath.isDisplayed(), "Check box 2 is not displayed");
        Assert.assertTrue(checkBox3xPath.isDisplayed(), "Check box 3 is not displayed");
    }

    public String getUrlOfPage() {
        return this.driver.getCurrentUrl();
    }

    public WebElement getCheckBox1ViaXpath() {
        return checkBox1xPath;
    }

    public WebElement getCheckBox2ViaXPath() {
        return checkBox2xPath;
    }

    public WebElement getCheckBox3ViaXPath() {
        return checkBox3xPath;
    }

    public WebElement getCheckBox1ViaCSS() {
        return checkBox1css;
    }

    public WebElement getCheckBox2ViaCSS() {
        return checkBox2css;
    }

    public WebElement getCheckBox3ViaCSS() {
        return checkBox3css;
    }
}
