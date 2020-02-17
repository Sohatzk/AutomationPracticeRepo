import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckEmailUnhappyPath {
    @DataProvider(name = "emailsForUnhappyPath")
    public Object[][] dataProviderMethod() {
        return new Object[][]{
                {"sohatzkygmail.com"},
                {"sohatzky@gmailcom"},
                {"so@gmail.com"},
                {"123456789012345678901@gmail.com"},
                {"?????@gmail.com"},
                {"sohatzky@gmaill.com"},
                {"sohatzky@???.com"},
                {"sohatzky@gmail.c"},
                {"sohatzky@g.commmm"},
                {"sohatzky@gmail.???"},
                {"sohatzky@gmail.COM"}};
    }

    @Test(dataProvider = "emailsForUnhappyPath")
    public void checkUnhappyPath(String email) {
        boolean actualResult = Email.isEmailCorrect(email);
        Assert.assertFalse(actualResult, "Email is expected to be incorrect, but it's correct");
    }
}
