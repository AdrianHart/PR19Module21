package com.adrian.stepDef;

import com.adrian.page.CartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartStepDef extends BaseTest {

    CartPage cartPage;

    @When("user click Add to cart button of Sauce Labs Backpack")
    public void userClickAddToCartButton() {
        cartPage = new CartPage(driver);
        cartPage.clickAddToCartButton();
    }
    @When("user click all Add to cart button")
    public void userClickAllAddToCartButton() {
        cartPage = new CartPage(driver);
        cartPage.clickAllAddToCartButton();
    }

    @Then("the products are added to the cart")
    public void theProductIsAddedToTheCart() {
        cartPage = new CartPage(driver);
        cartPage.clickCartButton();
        cartPage.validateAddedProductOnCart();
    }

    @Then("Sauce Labs Backpack is added to the cart")
    public void sauceLabsBackpackIsAddedToTheCart() {
        cartPage.clickCartButton();
        cartPage.validateItemAppeared();
    }

    @Then("the products are all removed from the cart")
    public void theProductsAreAllRemovedFromTheCart() {
        cartPage.clickCartButton();
        cartPage.validateAllProductsAreRemoved();
    }

    @And("user click all Remove button")
    public void userClickAllRemoveButton() {
        cartPage.clickAllRemoveButton();
    }
}

