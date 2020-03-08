package homeTask2WithinPageFactory.testDropDowns;

import homeTask2WithinPageFactory.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InitialDropDownsPage extends PageObject {
    @FindBy(id = "dropdownMenuButton")
    private WebElement dropDownMenuButton;

    public InitialDropDownsPage(WebDriver driver) {
        super(driver);
    }


    public InitialDropDownBox clickDropDownMenuButton() {
        dropDownMenuButton.click();
        return new InitialDropDownBox(driver);
    }
}
