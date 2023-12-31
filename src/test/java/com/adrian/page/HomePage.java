package com.adrian.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void validateOnHomePage() {
        WebElement productElement = driver.findElement(By.id("item_4_title_link"));
        assertTrue(productElement.isDisplayed());
        assertEquals("Sauce Labs Backpack", productElement.getText());
    }


    By filterButton = By.cssSelector(".product_sort_container");

    public void clickFilterButton() {
        WebElement filterElement = driver.findElement(filterButton);
        filterElement.click();
    }

    public void selectNameZtoAFilter() {
        WebElement nameZtoAOption = driver.findElement(By.cssSelector(".product_sort_container option[value='za']"));
        nameZtoAOption.click();
    }

    public void validateNameZToAFilter() {
        WebElement firstProduct = driver.findElement(By.id("item_3_title_link"));
        assertEquals("Test.allTheThings() T-Shirt (Red)", firstProduct.getText());
    }

    public void selectPriceLowToHighFilter() {
        WebElement priceLowToHighOption = driver.findElement(By.cssSelector(".product_sort_container option[value='lohi']"));
        priceLowToHighOption.click();
    }

    public void validatePriceLowToHighFilter() {
        WebElement firstProduct = driver.findElement(By.id("item_2_title_link"));
        assertEquals("Sauce Labs Onesie", firstProduct.getText());
    }

    public void selectPriceHighToLowFilter() {
        WebElement priceHighToLowOption = driver.findElement(By.cssSelector(".product_sort_container option[value='hilo']"));
        priceHighToLowOption.click();
    }

    public void validatePriceHighToLowFilter() {
        WebElement firstProduct = driver.findElement(By.id("item_5_title_link"));
        assertEquals("Sauce Labs Fleece Jacket", firstProduct.getText());
    }
}