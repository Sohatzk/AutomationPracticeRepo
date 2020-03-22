package growTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
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


public class TaskOneTestNameOfArticles {
    private final String expectedNameOfMainArticle = "Italy considers closing all school and colleges";
    private final String expectedNameOfFirstArticle = "Biden seals comeback with Super Tuesday victories";
    private final String expectedNameOfSecondArticle = "US air strike targets Taliban days after deal";
    private final String expectedNameOfThirdArticle = "Venezuelan leader urges women to have six children";
    private final String expectedNameOfFourthArticle = "Student spends $20k to make class on time";
    private final String expectedNameOfFifthArticle = "Girl, 3, who laughed at bombs, escapes Syria war";
    private final String expectedNameOfAfterSearchArticle = "World's End: World's End";
    private WebDriver chromeDriver;
    private WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
        wait = new WebDriverWait(chromeDriver, 15);
        chromeDriver.get("https://www.bbc.com/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='orb-nav-links']//a[text()='News']"))).click();
    }


    @Test(priority = 1)
    public void testBBCMainArticle() {
        WebElement mainArticle = findElemByXPath(By.xpath("//div[contains(@class, '@m gs-u-mt@xs')]//h3"));
        String actualNameOfMainArticle = mainArticle.getText();
        Assert.assertEquals(expectedNameOfMainArticle, actualNameOfMainArticle,
                "The current title of the article - \"" + actualNameOfMainArticle + "\" - doesn't match the expected - \"" + expectedNameOfMainArticle + "\"");
    }

    @Test(priority = 2)
    public void testSecondaryArticleOne() {
        WebElement firstArticle = findElemByXPath(By.xpath("//div[contains(@class, 'secondary-item--1')]//h3"));
        String actualNameOfFirstArticle = firstArticle.getText();
        Assert.assertEquals(expectedNameOfFifthArticle, actualNameOfFirstArticle,
                "The current title of the article - \"" + actualNameOfFirstArticle + "\" - doesn't match the expected - \"" + expectedNameOfFirstArticle + "\"");
    }

    @Test(priority = 3)
    public void testSecondaryArticleTwo() {
        WebElement secondArticle = findElemByXPath(By.xpath("//div[contains(@class, 'secondary-item--2')]//h3"));
        String actualNameOfSecondArticle = secondArticle.getText();
        Assert.assertEquals(expectedNameOfSecondArticle, actualNameOfSecondArticle,
                "The current title of the article - \"" + actualNameOfSecondArticle + "\" - doesn't match the expected - \"" + expectedNameOfSecondArticle + "\"");
    }

    @Test(priority = 4)
    public void testSecondaryArticleThree() {
        WebElement thirdArticle = findElemByXPath(By.xpath("//div[contains(@class, 'secondary-item--3')]//h3"));
        String actualNameOfThirdArticle = thirdArticle.getText();
        Assert.assertEquals(expectedNameOfThirdArticle, actualNameOfThirdArticle,
                "The current title of the article - \"" + actualNameOfThirdArticle + "\" - doesn't match the expected - \"" + expectedNameOfThirdArticle + "\"");
    }

    @Test(priority = 5)
    public void testSecondaryArticleFour() {
        WebElement fourthArticle = findElemByXPath(By.xpath("//div[contains(@class, 'secondary-item--4')]//h3"));
        String actualNameOfFourthArticle = fourthArticle.getText();
        Assert.assertEquals(expectedNameOfFourthArticle, actualNameOfFourthArticle,
                "The current title of the article - \"" + actualNameOfFourthArticle + "\" - doesn't match the expected - \"" + expectedNameOfFourthArticle + "\"");
    }

    @Test(priority = 6)
    public void testSecondaryArticleFive() {
        WebElement fifthArticle = findElemByXPath(By.xpath("//div[contains(@class, 'secondary-item--4')]//h3"));
        String actualNameOfFifthArticle = fifthArticle.getText();
        Assert.assertEquals(expectedNameOfFifthArticle, actualNameOfFifthArticle,
                "The current title of the article - \"" + actualNameOfFifthArticle + "\" - doesn't match the expected - \"" + expectedNameOfFifthArticle + "\"");
    }

    @Test(priority = 7)
    public void testFirstArticleAfterSearch() {
        String categoryLink = findElemByXPath(By.xpath("//a[contains(@class, 'gs-c-section-link--truncate')][1]")).getText();
        chromeDriver.findElement(By.id("orb-search-q")).sendKeys(categoryLink);
        chromeDriver.findElement(By.id("orb-search-button")).click();
        WebElement afterSearchArticle = findElemByXPath(By.xpath("//a[contains(@class, 'ett16tt7')][1]"));
        String actualNameOfAfterSearchArticle = afterSearchArticle.getText();
        Assert.assertEquals(expectedNameOfAfterSearchArticle, actualNameOfAfterSearchArticle,
                "The current title of the article - \"" + actualNameOfAfterSearchArticle + "\" - doesn't match the expected - \"" + expectedNameOfAfterSearchArticle + "\"");
    }

    @AfterClass
    public void quitBrowser() {
        chromeDriver.quit();
    }

    public WebElement findElemByXPath(By xPath) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(xPath)).findElement(xPath);
    }

}

