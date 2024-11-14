package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CartTest extends BaseTest {

    @Test
    public void checkCart() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.clickAddButton("Sauce Labs Backpack");
        productsPage.clickShoppingCart();
        String product = driver.findElement(By.cssSelector(".inventory_item_name")).getText();
        assertEquals(product, "Sauce Labs Backpack");
    }
}
