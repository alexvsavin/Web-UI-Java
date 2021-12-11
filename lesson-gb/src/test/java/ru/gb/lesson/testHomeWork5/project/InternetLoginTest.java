package ru.gb.lesson.testHomeWork5.project;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class InternetLoginTest extends BasicTest{

    @Test
    void internetLoginTest() throws InterruptedException {
        webDriver.get("http://the-internet.herokuapp.com/login");

        webDriver.findElement(By.name("username")).sendKeys("tomsmith");
        webDriver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
        webDriver.findElement(By.xpath("//i[contains(.,' Login')]")).click();

        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(), 'Secure Area')]")));
        Thread.sleep(3000);

    }

}
