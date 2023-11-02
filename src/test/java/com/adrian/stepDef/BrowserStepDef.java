package com.adrian.stepDef;

import io.cucumber.java.en.Given;
import com.adrian.page.LoginPage;

public class BrowserStepDef extends BaseTest {
    LoginPage loginPage;

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        loginPage = new LoginPage(driver);
        loginPage.goToLoginPage();
    }
}