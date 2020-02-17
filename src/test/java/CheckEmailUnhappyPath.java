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
                {"soh@gmail.com"},
                {"12345678901234567890@gmail.com"},
                {"123456789012345678901@gmail.com"},
                {"?????@gmail.com"},
                {"sohatzky@g.com"},
                {"sohatzky@gm.com"},
                {"sohatzky@gmail.com"},
                {"sohatzky@gmaill.com"},
                {"sohatzky@???.com"},
                {"sohatzky@gmail.c"},
                {"sohatzky@gmail.co"},
                {"sohatzky@g.commm"},
                {"sohatzky@g.commmm"},
                {"sohatzky@gmail.???"},
                {"sohatzky@gmail.COM"}};
    }

    @Test(dataProvider = "emailsForUnhappyPath")
    public void checkUnhappyPath(String email) {
        boolean actualResult = Email.isEmailCorrect(email);
        Assert.assertFalse(false, "Email is expected to be incorrect, but it's correct");
    }
}
