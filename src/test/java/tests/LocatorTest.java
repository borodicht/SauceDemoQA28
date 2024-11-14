package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LocatorTest extends BaseTest{

    @Test
    public void locatorTest() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id(""));
        driver.findElement(By.className(""));
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }
}
