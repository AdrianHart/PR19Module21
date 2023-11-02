package stepDef;

import com.adrian.BaseTest;
import io.cucumber.java.en.Given;
import page.LoginPage;

public class BrowserStepDef extends BaseTest {
    LoginPage loginPage;

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        loginPage = new LoginPage(driver);
        loginPage.goToLoginPage();
    }
}