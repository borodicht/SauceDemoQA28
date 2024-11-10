import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTest {

    @Test
    public void checkLogin() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        String title = driver.findElement(By.cssSelector(".title")).getText();
        assertEquals(title,
                "Products",
                "переход на страницу не выполнен");
    }

    @Test
    public void checkLoginWithEmptyUserName() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        String errorMessage = driver.findElement(By.xpath("//h3[@data-test = 'error']")).getText();
        assertEquals(errorMessage, "Epic sadface: Username is required");
    }

    @Test
    public void checkLoginWithEmptyPassword() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("");
        driver.findElement(By.id("login-button")).click();
        String errorMessage = driver.findElement(By.xpath("//h3[@data-test = 'error']")).getText();
        assertEquals(errorMessage, "Epic sadface: Password is required");
    }
}
