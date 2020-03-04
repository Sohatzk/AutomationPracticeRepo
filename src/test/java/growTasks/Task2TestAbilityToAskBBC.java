package growTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Task2TestAbilityToAskBBC {
    private WebDriver chromeDriver;
    private WebDriverWait wait;

    @DataProvider
    public Object[][] getFields() {
        return new Object[][]{
                {
                        "Will someone bit the Arsenal's Premier League record - unbeatable during one season? Or this is unreachable peak for all time and all teams?",
                        "Bohdan",
                        "sohatzky.bogdan@gmail.com",
                        "21",
                        "1234"
                },
                {
                        "Will someone bit the Arsenal's Premier League record - unbeatable during one season? Or this is unreachable peak for all time and all teams??",
                        "Bohdan",
                        "sohatzky.bogdan@gmail.com",
                        "21",
                        "1234"
                },
                {
                        "Will someone bit the Arsenal's Premier League record - unbeatable during one season? Or this is unreachable peak for all time and all teams?",
                        "",
                        "sohatzky.bogdan@gmail.com",
                        "21",
                        "1234"
                },
                {
                        "Will someone bit the Arsenal's Premier League record - unbeatable during one season? Or this is unreachable peak for all time and all teams?",
                        "Bohdan",
                        "",
                        "21",
                        "1234"
                }
        };
    }

    public void fillInFields(String question, String name, String email, String age, String postCode) {
        WebElement textField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@placeholder='What questions would you like us to investigate?']")));
        WebElement nameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Name']")));
        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Email address']")));
        WebElement ageField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Age']")));
        WebElement postCodeField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Postcode']")));
        if (textField.getText() != "") {
            textField.sendKeys(Keys.CONTROL + "a");
            textField.sendKeys(Keys.DELETE);
        }
        if (nameField.getText() != "") {
            nameField.sendKeys(Keys.CONTROL + "a");
            nameField.sendKeys(Keys.DELETE);
        }
        if (emailField.getText() != "") {
            emailField.sendKeys(Keys.CONTROL + "a");
            emailField.sendKeys(Keys.DELETE);
        }
        if (ageField.getText() != "") {
            ageField.sendKeys(Keys.CONTROL + "a");
            ageField.sendKeys(Keys.DELETE);
        }
        if (postCodeField.getText() != "") {
            postCodeField.sendKeys(Keys.CONTROL + "a");
            postCodeField.sendKeys(Keys.DELETE);
        }
        textField.sendKeys(question);
        nameField.sendKeys(name);
        emailField.sendKeys(email);
        ageField.sendKeys(age);
        postCodeField.sendKeys(postCode);
    }

    public void checkFields(WebElement text, WebElement name, WebElement email) {
        if (text.getText() == "") {
            chromeDriver.findElement(By.xpath("//button[text()='Submit']")).click();
            WebElement textError = chromeDriver.findElement(By.xpath("//textarea[@placeholder='What questions would you like us to investigate?']//following-sibling::div[@class='input-error-message']"));
            Assert.assertTrue(textError.isDisplayed(),
                    "The text \"" + textError.getText() + "\" doesn't display under the empty \"Textarea\" field");
        }

        if (name.getText() == "") {
            chromeDriver.findElement(By.xpath("//button[text()='Submit']")).click();
            WebElement nameError = chromeDriver.findElement(By.xpath("//div[@class='input-threeup-leading ']//label/div"));
            Assert.assertTrue(nameError.isDisplayed(),
                    "The text \"" + nameError.getText() + "\" doesn't display under the empty \"Name\" field");
        }

        if (email.getText() == "") {
            chromeDriver.findElement(By.xpath("//button[text()='Submit']")).click();
            WebElement emailError = chromeDriver.findElement(By.xpath("//div[@class='input-threeup-leading input-threeup-following ']//label/div"));
            Assert.assertTrue(emailError.isDisplayed(),
                    "The text \"" + emailError.getText() + "\" doesn't display under the empty \"Email\" field");
        }
    }


    @BeforeClass
    public void setUp() {
        String address = "C:\\Users\\sohat\\IdeaProjects\\Drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", address);
        chromeDriver = new ChromeDriver();
        wait = new WebDriverWait(chromeDriver, 20);
        chromeDriver.get("https://www.bbc.com/");
        chromeDriver.findElement(By.xpath("//div[@id='orb-nav-links']//a[text()='News']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='gel-long-primer gs-u-ph']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='nw-c-nav__wide-overflow']//span[text()='Have Your Say']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/news/uk-47933096']"))).click();
    }


    @Test(dataProvider = "getFields")
    public void testSubmitQuestionToBBC(String question, String name, String email, String age, String postCode) {
        fillInFields(question, name, email, age, postCode);
        WebElement textAreaField = chromeDriver.findElement(By.xpath("//textarea[@placeholder='What questions would you like us to investigate?']"));
        WebElement nameField = chromeDriver.findElement(By.xpath("//input[@placeholder='Name']"));
        WebElement emailField = chromeDriver.findElement(By.xpath("//input[@placeholder='Email address']"));
        checkFields(textAreaField, nameField, emailField);
        Assert.assertNotEquals(chromeDriver.getCurrentUrl(), "https://www.bbc.com/news/uk-47933096",
                "The current url is \"" + chromeDriver.getCurrentUrl() + "\" while it is expected to be other as \"Submit\" button was clicked");

    }

    @AfterClass
    public void closeWindow() {
        chromeDriver.quit();
    }
}
