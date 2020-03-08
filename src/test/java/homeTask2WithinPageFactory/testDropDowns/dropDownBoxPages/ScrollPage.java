package homeTask2WithinPageFactory.testDropDowns.dropDownBoxPages;

import homeTask2WithinPageFactory.PageObject;
import org.openqa.selenium.WebDriver;

public class ScrollPage extends PageObject {
    public ScrollPage(WebDriver driver) {
        super(driver);
    }

    public String getUrlOfPage() {
        return this.driver.getCurrentUrl();
    }
}
