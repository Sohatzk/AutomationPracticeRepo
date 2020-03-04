package growTasks;

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


public class Task1TestNameOfArticles {
    private WebDriver chromeDriver;
    private WebDriverWait wait;

    @DataProvider
    public Object[][] secondArticles() {
        return new Object[][]{
                {"Biden seals comeback with Super Tuesday victories", "//div[contains(@class, 'secondary-item--1')]//h3"},
                {"US air strike targets Taliban days after deal", "//div[contains(@class, 'secondary-item--2')]//h3"},
                {"Venezuelan leader urges women to have six children", "//div[contains(@class, 'secondary-item--3')]//h3"},
                {"Student spends $20k to make class on time", "//div[contains(@class, 'secondary-item--4')]//h3"},
                {"Girl, 3, who laughed at bombs, escapes Syria war", "//div[contains(@class, 'secondary-item--5')]//h3"}
        };
    }

    @BeforeClass
    public void setUp() {
        String address = "C:\\Users\\sohat\\IdeaProjects\\Drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", address);
        chromeDriver = new ChromeDriver();
        wait = new WebDriverWait(chromeDriver, 10);
        chromeDriver.get("https://www.bbc.com/");
        chromeDriver.findElement(By.xpath("//div[@id='orb-nav-links']//a[text()='News']")).click();
    }


    @Test(priority = 1)
    public void testBBCMainArticle() {
        WebElement webElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='gs-c-promo-body gs-u-display-none gs-u-display-inline-block@m gs-u-mt@xs gs-u-mt0@m gel-1/3@m']//h3")));

        Assert.assertEquals("Italy considers closing all school and colleges", webElem.getText(),
                "Expected title - \"Italy considers closing all school and colleges\" but it's \""
                        + webElem.getText() + "\"");
    }

    @Test(priority = 2, dataProvider = "secondArticles")
    public void testSecondaryArticles(String[] titles) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(titles[1])));
        WebElement element = chromeDriver.findElement(By.xpath(titles[1]));
        Assert.assertEquals(titles[0], element.getText(),
                "The current title of the article - \"" + element.getText() + "\" - doesn't match the expected - \"" + titles[0] + "\"");
    }

    @Test(priority = 3)
    public void testFirstArticleAfterSearch() {
        String categoryLink = wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//div[@class='gs-c-promo-body gs-u-display-none gs-u-display-inline-block@m gs-u-mt@xs gs-u-mt0@m gel-1/3@m']//ul//span"))).getText();
        chromeDriver.findElement(By.id("orb-search-q")).sendKeys(categoryLink);
        chromeDriver.findElement(By.id("orb-search-button")).click();
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='search-result-0']//following-sibling::div//a")));
        Assert.assertEquals("World's End: World's End", element.getText(),
                "The current title of the article - \"" + element.getText() + "\" - doesn't match the expected - \"World's End: World's End\"");
    }

    @AfterClass
    public void quitBrowser() {
        chromeDriver.quit();
    }

}

