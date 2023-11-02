package com.adrian.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.adrian.page.HomePage;

public class HomeStepDef extends BaseTest {
    HomePage homePage;
    @Then("user will be directed to the homepage")
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

}