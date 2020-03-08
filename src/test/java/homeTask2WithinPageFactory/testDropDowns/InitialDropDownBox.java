package homeTask2WithinPageFactory.testDropDowns;

import homeTask2WithinPageFactory.PageObject;
import homeTask2WithinPageFactory.testDropDowns.dropDownBoxPages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InitialDropDownBox extends PageObject {

    @FindBy(xpath = "//div[@class='dropdown-menu show']/a[1]")
    private WebElement autocompleteButton;

    @FindBy(xpath = "//div[@class='dropdown-menu show']/a[2]")
    private WebElement buttonsButton;

    @FindBy(xpath = "//div[@class='dropdown-menu show']/a[3]")
    private WebElement checkBoxButton;

    @FindBy(xpath = "//div[@class='dropdown-menu show']/a[4]")
    private WebElement datePickerButton;

    @FindBy(xpath = "//div[@class='dropdown-menu show']/a[5]")
    private WebElement dragAndDropButton;

    @FindBy(xpath = "//div[@class='dropdown-menu show']/a[6]")
    private WebElement dropDownButton;

    @FindBy(xpath = "//div[@class='dropdown-menu show']/a[7]")
    private WebElement enabledAndDisabledElementsButton;

    @FindBy(xpath = "//div[@class='dropdown-menu show']/a[8]")
    private WebElement fileUploadButton;

    @FindBy(xpath = "//div[@class='dropdown-menu show']/a[9]")
    private WebElement fileDownloadButton;

    @FindBy(xpath = "//div[@class='dropdown-menu show']/a[10]")
    private WebElement keyAndMousePressButton;

    @FindBy(xpath = "//div[@class='dropdown-menu show']/a[11]")
    private WebElement modalButton;

    @FindBy(xpath = "//div[@class='dropdown-menu show']/a[12]")
    private WebElement pageScrollButton;

    @FindBy(xpath = "//div[@class='dropdown-menu show']/a[13]")
    private WebElement radioButton;

    @FindBy(xpath = "//div[@class='dropdown-menu show']/a[14]")
    private WebElement switchWindowButton;

    @FindBy(xpath = "//div[@class='dropdown-menu show']/a[15]")
    private WebElement completeWebFormButton;

    InitialDropDownBox(WebDriver driver) {
        super(driver);
    }

    public String getUrlOfPage() {
        return driver.getCurrentUrl();
    }

    public AutocompletePage clickAutocompleteButton() {
        autocompleteButton.click();
        return new AutocompletePage(driver);
    }

    public ButtonsPage clickButtonsButton() {
        buttonsButton.click();
        return new ButtonsPage(driver);
    }

    public CheckBoxPage clickCheckBoxButton() {
        checkBoxButton.click();
        return new CheckBoxPage(driver);
    }

    public DatePickerPage clickDatePickerButton() {
        datePickerButton.click();
        return new DatePickerPage(driver);
    }

    public DragAndDropPage clickDragAndDropButton() {
        dragAndDropButton.click();
        return new DragAndDropPage(driver);
    }

    public DropDownPage clickDropDownButton() {
        dropDownButton.click();
        return new DropDownPage(driver);
    }

    public EnabledAndDisabledElementsPage clickEnabledAndDisabledElementsButton() {
        enabledAndDisabledElementsButton.click();
        return new EnabledAndDisabledElementsPage(driver);
    }

    public FileUploadPage clickFileUploadButton() {
        fileUploadButton.click();
        return new FileUploadPage(driver);
    }

    public FileDownLoadPage clickFileDownloadButton() {
        fileDownloadButton.click();
        return new FileDownLoadPage(driver);
    }

    public KeyAndMousePressPage clickKeyAndMousePressButton() {
        keyAndMousePressButton.click();
        return new KeyAndMousePressPage(driver);
    }

    public ModalPage clickModalButton() {
        modalButton.click();
        return new ModalPage(driver);
    }

    public ScrollPage clickPageScrollButton() {
        pageScrollButton.click();
        return new ScrollPage(driver);
    }

    public RadioButtonPage clickRadioButton() {
        radioButton.click();
        return new RadioButtonPage(driver);
    }

    public SwitchWindowPage clickSwitchWindowButton() {
        switchWindowButton.click();
        return new SwitchWindowPage(driver);
    }

    public CompleteWebFormPage clickCompleteWebFormButton() {
        completeWebFormButton.click();
        return new CompleteWebFormPage(driver);
    }

}
