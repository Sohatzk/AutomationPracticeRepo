package homeTask2WithinPageFactory.testDropDowns.dropDownBoxPages;

import homeTask2WithinPageFactory.PageObject;
import org.openqa.selenium.WebDriver;

public class CheckBoxPage extends PageObject {
    public CheckBoxPage(WebDriver driver) {
        super(driver);
    }

    public String getUrlOfPage() {
        return this.driver.getCurrentUrl();
    }
}
