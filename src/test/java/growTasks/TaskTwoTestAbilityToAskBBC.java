package growTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

public class TaskTwoTestAbilityToAskBBC {
    private final String doYouHaveAQuestionPageAddress = "https://www.bbc.com/news/uk-47933096";
    private final By textAreaAddress = By.xpath("//textarea[@placeholder='What questions would you like us to investigate?']");
    private final By nameAreaAddress = By.xpath("//input[@placeholder='Name']");
    private final By emailAreaAddress = By.xpath("//input[@placeholder='Email address']");
    private final By ageAreaAddress = By.xpath("//input[@placeholder='Age']");
    private final By postCodeAreaAddress = By.xpath("//input[@placeholder='Postcode']");
    private final By textAreaErrorMessageAddress = By.xpath("//textarea[@placeholder='What questions would you like us to investigate?']//following-sibling::div[@class='input-error-message']");
    private final By nameAreaErrorMessageAddress = By.xpath("//div[@class='input-threeup-leading ']//label/div");
    private final By emailAreaErrorMessageAddress = By.xpath("//div[@class='input-threeup-leading input-threeup-following ']//label/div");
    private final By submitButtonAddress = By.xpath("//button[text()='Submit']");
    private final String textAreaValue = "Will someone bit the Arsenal's Premier League record - unbeatable during one season? Or this is unreachable peak for all time and all teams?";
    private final String nameAreaValue = "Bohdan";
    private final String emailAreaValue = "sohatzky.bogdan@gmail.com";
    private final String ageAreaValue = "Have no matter what the value is";
    private final String postCodeAreaValue = "Have no matter what the value is";
    private final String expectedURL = "https://www.bbc.com/news/uk-47933096";

    private WebDriver chromeDriver;
    private WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
        wait = new WebDriverWait(chromeDriver, 20);
    }

    @BeforeMethod
    public void doYouHaveAQuestionPage() {
        chromeDriver.get(doYouHaveAQuestionPageAddress);
    }

    @Test()
    public void testSubmitQuestionToBBCWithAllFieldsFilledProperly() {
        fillInFields(textAreaValue, nameAreaValue, emailAreaValue, ageAreaValue, postCodeAreaValue);
        Assert.assertNotEquals(expectedURL, chromeDriver.getCurrentUrl(),
                "The current url is \"" + chromeDriver.getCurrentUrl() + "\" while it is expected to be other as \"Submit\" button was clicked");

    }

    @Test(priority = 1)
    public void testSubmitQuestionToBBCWithTextFieldTooLong() {
        fillInFields(textAreaValue + "?", nameAreaValue, emailAreaValue, ageAreaValue, postCodeAreaValue);
        Assert.assertNotEquals(expectedURL, chromeDriver.getCurrentUrl(),
                "The current url is \"" + chromeDriver.getCurrentUrl() + "\" while it is expected to be other as \"Submit\" button was clicked");

    }

    @Test(priority = 2)
    public void testSubmitQuestionToBBCWithEmptyTextField() {
        fillInFields("", nameAreaValue, emailAreaValue, ageAreaValue, postCodeAreaValue);
        clickOnElemByXPath(submitButtonAddress);
        WebElement textError = findElemByXPath(textAreaErrorMessageAddress);
        Assert.assertTrue(textError.isDisplayed(),
                "The text \"" + textError.getText() + "\" doesn't display under the empty \"Textarea\" field");
    }

    @Test(priority = 3)
    public void testSubmitQuestionToBBCWithEmptyNameField() {
        fillInFields(textAreaValue, "", emailAreaValue, ageAreaValue, postCodeAreaValue);
        clickOnElemByXPath(submitButtonAddress);
        WebElement nameError = findElemByXPath(nameAreaErrorMessageAddress);
        Assert.assertTrue(nameError.isDisplayed(),
                "The text \"" + nameError.getText() + "\" doesn't display under the empty \"Name\" field");
    }

    @Test(priority = 4)
    public void testSubmitQuestionToBBCWithEmptyEmailField() {
        fillInFields(textAreaValue, nameAreaValue, "", ageAreaValue, postCodeAreaValue);
        clickOnElemByXPath(submitButtonAddress);
        WebElement emailError = findElemByXPath(emailAreaErrorMessageAddress);
        Assert.assertTrue(emailError.isDisplayed(),
                "The text \"" + emailError.getText() + "\" doesn't display under the empty \"Email\" field");
    }

    @AfterClass
    public void closeBrowser() {
        chromeDriver.quit();
    }

    public void clickOnElemByXPath(By xPath) {
        findElemByXPath(xPath).click();
    }

    public WebElement findElemByXPath(By xPath) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(xPath)).findElement(xPath);
    }

    public void fillInFields(String question, String name, String email, String age, String postCode) {
        findElemByXPath(textAreaAddress).sendKeys(question);
        findElemByXPath(nameAreaAddress).sendKeys(name);
        findElemByXPath(emailAreaAddress).sendKeys(email);
        findElemByXPath(ageAreaAddress).sendKeys(age);
        findElemByXPath(postCodeAreaAddress).sendKeys(postCode);
    }

}
