package stepDef;

import com.adrian.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.HomePage;
import page.MenuPage;

public class HomeStepDef extends BaseTest {
    HomePage homePage;
    MenuPage menuPage;
    @Then("user will be directed to the home page")
    public void userWillBeDirectedToTheHomePage() {
        homePage = new HomePage(driver);
        homePage.validateOnHomePage();

    }
    @When("user click filter button")
    public void userClickFilterButton() {
        homePage = new HomePage(driver);
        homePage.clickFilterButton();
    }

    @And("user select Name\\(Z to A)")
    public void userSelectNameZToA() {
        homePage.selectNameZtoAFilter();

    }

    @Then("The product names will be shown from Z to A")
    public void theProductNamesWillBeShownFromZToA() {
        homePage.validateNameZToAFilter();
    }

    @And("User click Price\\(low to high)")
    public void userClickPriceLowToHigh() {
        homePage.selectPriceLowToHighFilter();
    }

    @Then("The product prices will be shown from low to high")
    public void theProductPricesWillBeShownFromLowToHigh() {
        homePage.validatePriceLowToHighFilter();
    }

    @And("User click Price\\(high to low)")
    public void userClickPriceHighToLow() {
        homePage.selectPriceHighToLowFilter();
    }

    @Then("The product prices will be shown from high to low")
    public void theProductPricesWillBeShownFromHighToLow() {
        homePage.validatePriceHighToLowFilter();
    }

    //SIDEBAR MENU
    @When("user click menu button")
    public void userClickMenuButton() {
        menuPage = new MenuPage(driver);
        menuPage.clickMenuButton();
    }

    @And("user click about sidebar")
    public void userClickAboutSidebar() {
        menuPage.clickAboutElementButton();
    }

    @Then("the user can see the company information on the website")
    public void theUserCanSeeTheCompanyInformationOnTheWebsite() {
        //ACTUAL : MOVE TO SAUCELABS HOMEPAGE
        menuPage.navigateToSauceLabsPage();
    }

    @And("user click Logout sidebar")
    public void userClickLogoutSidebar() {
        menuPage.clickLogoutElement();
    }

    @And("user click Reset App State sidebar")
    public void userClickResetAppStateSidebar() {
        menuPage.clickResetAppState();
    }
}