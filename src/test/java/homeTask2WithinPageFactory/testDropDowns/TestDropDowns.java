package homeTask2WithinPageFactory.testDropDowns;

import homeTask2WithinPageFactory.WebDriverSettings;
import homeTask2WithinPageFactory.testDropDowns.dropDownBoxPages.*;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestDropDowns extends WebDriverSettings {
    protected InitialDropDownsPage initialDropDownsPage;
    protected InitialDropDownBox initialDropDownBox;

    @BeforeClass
    @Override
    public void setUp() {
        super.setUp();
        driver.get("https://formy-project.herokuapp.com/dropdown");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        initialDropDownsPage = new InitialDropDownsPage(driver);
    }

    @BeforeMethod
    public void moveToInitialPage() {
        driver.get("https://formy-project.herokuapp.com/dropdown");
        initialDropDownBox = initialDropDownsPage.clickDropDownMenuButton();
    }


    @Test(priority = 1)
    public void testAutocompleteButton() {
        AutocompletePage autocompletePage = initialDropDownBox.clickAutocompleteButton();
        Assert.assertEquals("https://formy-project.herokuapp.com/autocomplete", autocompletePage.getUrlOfPage(),
                "The current url: \""
                        + autocompletePage.getUrlOfPage() +
                        "\" doesn't match the expected: \"https://formy-project.herokuapp.com/autocomplete\"");

    }

    @Test(priority = 2)
    public void testButtonsButton() {
        ButtonsPage buttonsPage = initialDropDownBox.clickButtonsButton();
        Assert.assertEquals("https://formy-project.herokuapp.com/buttons", buttonsPage.getUrlOfPage(),
                "The current url: \""
                        + buttonsPage.getUrlOfPage() +
                        "\" doesn't match the expected: \"https://formy-project.herokuapp.com/autocomplete\"");

    }

    @Test(priority = 3)
    public void testCheckBoxButton() {
        CheckBoxPage checkBoxPage = initialDropDownBox.clickCheckBoxButton();
        Assert.assertEquals("https://formy-project.herokuapp.com/checkbox", checkBoxPage.getUrlOfPage(),
                "The current url: \""
                        + checkBoxPage.getUrlOfPage() +
                        "\" doesn't match the expected: \"https://formy-project.herokuapp.com/checkbox\"");

    }

    @Test(priority = 4)
    public void testDatePickerButton() {
        DatePickerPage datePickerPage = initialDropDownBox.clickDatePickerButton();
        Assert.assertEquals("https://formy-project.herokuapp.com/datepicker", datePickerPage.getUrlOfPage(),
                "The current url: \""
                        + datePickerPage.getUrlOfPage() +
                        "\" doesn't match the expected: \"https://formy-project.herokuapp.com/datepicker\"");

    }

    @Test(priority = 5)
    public void testDragAndDropButton() {
        DragAndDropPage dragAndDropPage = initialDropDownBox.clickDragAndDropButton();
        Assert.assertEquals("https://formy-project.herokuapp.com/dragdrop", dragAndDropPage.getUrlOfPage(),
                "The current url: \""
                        + dragAndDropPage.getUrlOfPage() +
                        "\" doesn't match the expected: \"https://formy-project.herokuapp.com/dragdrop\"");

    }

    @Test(priority = 6)
    public void testDropDownButton() {
        DropDownPage dropDownPage = initialDropDownBox.clickDropDownButton();
        Assert.assertEquals("https://formy-project.herokuapp.com/dropdown", dropDownPage.getUrlOfPage(),
                "The current url: \""
                        + dropDownPage.getUrlOfPage() +
                        "\" doesn't match the expected: \"https://formy-project.herokuapp.com/dropdown\"");

    }

    @Test(priority = 7)
    public void testEnableAndDisableElementsButton() {
        EnabledAndDisabledElementsPage enabledAndDisabledElementsPage = initialDropDownBox.clickEnabledAndDisabledElementsButton();
        Assert.assertEquals("https://formy-project.herokuapp.com/enabled", enabledAndDisabledElementsPage.getUrlOfPage(),
                "The current url: \""
                        + enabledAndDisabledElementsPage.getUrlOfPage() +
                        "\" doesn't match the expected: \"https://formy-project.herokuapp.com/enabled\"");

    }

    @Test(priority = 8)
    public void testFileUploadButton() {
        FileUploadPage fileUploadPage = initialDropDownBox.clickFileUploadButton();
        Assert.assertEquals("https://formy-project.herokuapp.com/fileupload", fileUploadPage.getUrlOfPage(),
                "The current url: \""
                        + fileUploadPage.getUrlOfPage() +
                        "\" doesn't match the expected: \"https://formy-project.herokuapp.com/fileupload\"");

    }

    @Test(priority = 9)
    public void testFileDownload() {
        FileDownLoadPage fileDownLoadPage = initialDropDownBox.clickFileDownloadButton();
        Assert.assertEquals("https://formy-project.herokuapp.com/filedownload", fileDownLoadPage.getUrlOfPage(),
                "The current url: \""
                        + fileDownLoadPage.getUrlOfPage() +
                        "\" doesn't match the expected: \"https://formy-project.herokuapp.com/filedownload\"");

    }

    @Test(priority = 10)
    public void testKeyAndMousePressButton() {
        KeyAndMousePressPage keyAndMousePressPage = initialDropDownBox.clickKeyAndMousePressButton();
        Assert.assertEquals("https://formy-project.herokuapp.com/keypress", keyAndMousePressPage.getUrlOfPage(),
                "The current url: \""
                        + keyAndMousePressPage.getUrlOfPage() +
                        "\" doesn't match the expected: \"https://formy-project.herokuapp.com/keypress\"");

    }

    @Test(priority = 11)
    public void testModalButton() {
        ModalPage modalPage = initialDropDownBox.clickModalButton();
        Assert.assertEquals("https://formy-project.herokuapp.com/modal", modalPage.getUrlOfPage(),
                "The current url: \""
                        + modalPage.getUrlOfPage() +
                        "\" doesn't match the expected: \"https://formy-project.herokuapp.com/modal\"");

    }

    @Test(priority = 12)
    public void testPageScrollButton() {
        ScrollPage scrollPage = initialDropDownBox.clickPageScrollButton();
        Assert.assertEquals("https://formy-project.herokuapp.com/scroll", scrollPage.getUrlOfPage(),
                "The current url: \""
                        + scrollPage.getUrlOfPage() +
                        "\" doesn't match the expected: \"https://formy-project.herokuapp.com/scroll\"");

    }

    @Test(priority = 13)
    public void RadioButton() {
        RadioButtonPage radioButtonPage = initialDropDownBox.clickRadioButton();
        Assert.assertEquals("https://formy-project.herokuapp.com/radiobutton", radioButtonPage.getUrlOfPage(),
                "The current url: \""
                        + radioButtonPage.getUrlOfPage() +
                        "\" doesn't match the expected: \"https://formy-project.herokuapp.com/radiobutton\"");

    }

    @Test(priority = 14)
    public void testSwitchWindowButton() {
        SwitchWindowPage switchWindowPage = initialDropDownBox.clickSwitchWindowButton();
        Assert.assertEquals("https://formy-project.herokuapp.com/switch-window", switchWindowPage.getUrlOfPage(),
                "The current url: \""
                        + switchWindowPage.getUrlOfPage() +
                        "\" doesn't match the expected: \"https://formy-project.herokuapp.com/switch-window\"");

    }

    @Test(priority = 15)
    public void testCompleteWebFormsButton() {
        CompleteWebFormPage completeWebFormPage = initialDropDownBox.clickCompleteWebFormButton();
        Assert.assertEquals("https://formy-project.herokuapp.com/form", completeWebFormPage.getUrlOfPage(),
                "The current url: \""
                        + completeWebFormPage.getUrlOfPage() +
                        "\" doesn't match the expected: \"https://formy-project.herokuapp.com/form\"");

    }
    
}


