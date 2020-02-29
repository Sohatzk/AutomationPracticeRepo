package seleniumBaseApi;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestButtons extends WebDriverSettings {

    @BeforeClass
    @Override
    public void setUp() {
        super.setUp();
        driver.get("https://formy-project.herokuapp.com/buttons");
    }

    @Test(priority = 1)
    public void testPrimaryButton() {
        driver.findElement(By.xpath("//button[text()='Primary']")).click();
    }

    @Test(priority = 2)
    public void testSuccessButton() {
        driver.findElement(By.xpath("//button[text()='Success']")).click();
    }

    @Test(priority = 3)
    public void testInfoButton() {
        driver.findElement(By.xpath("//button[@class='btn btn-lg btn-info']")).click();
    }

    @Test(priority = 4)
    public void testWarningButton() {
        driver.findElement(By.xpath("//button[@class='btn btn-lg btn-warning']")).click();
    }

    @Test(priority = 5)
    public void testDangerButton() {
        driver.findElement(By.xpath("//button[text()='Danger']")).click();
    }

    @Test(priority = 6)
    public void testLinkButton() {
        driver.findElement(By.xpath("//button[text()='Link']")).click();
    }

    @Test(priority = 7)
    public void testLeftButton() {
        driver.findElement(By.xpath("//button[text()='Left']")).click();
    }

    @Test(priority = 8)
    public void testMiddleButton() {
        driver.findElement(By.xpath("//button[text()='Middle']")).click();
    }

    @Test(priority = 9)
    public void testRightButton() {
        driver.findElement(By.xpath("//button[text()='Right']")).click();
    }

    @Test(priority = 10)
    public void test1Button() {
        driver.findElement(By.xpath("//button[text()='1']")).click();
    }

    @Test(priority = 11)
    public void test2Button() {
        driver.findElement(By.xpath("//button[text()='2']")).click();
    }

    @Test(priority = 12)
    public void testDropDownLink1() {
        driver.findElement(By.id("btnGroupDrop1")).click();
        driver.findElement(By.xpath("//a[text()='Dropdown link 1']")).click();
    }

    @Test(priority = 13)
    public void testDropDownLink2() {
        driver.findElement(By.id("btnGroupDrop1")).click();
        driver.findElement(By.xpath("//a[text()='Dropdown link 2']")).click();
        driver.quit();
    }

}
