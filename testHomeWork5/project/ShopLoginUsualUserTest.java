package ru.gb.lesson.testHomeWork5.project;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ShopLoginUsualUserTest extends BasicTest {

    @Test
    void shopLoginUsualUserTest() throws InterruptedException {

        webDriver.get("https://www.saucedemo.com/");

        webDriver.manage().window().setSize(new Dimension(1500, 720));

        webDriver.findElement(By.name("user-name")).sendKeys("standard_user");
        webDriver.findElement(By.name("password")).sendKeys("secret_sauce");
        webDriver.findElement(By.id("login-button")).click();
        webDriver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(3000);

        webDriver.findElement(By.xpath("//span[contains(.,'1')]")).click();

        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Your Cart')]")));

        Thread.sleep(5000);

    }
}
