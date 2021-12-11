package ru.gb.lesson.testHomeWork5.project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ShopLoginTest {
    WebDriver webDriver;
    public WebDriverWait webDriverWait;

    @BeforeEach
    void setUp() {
        webDriver = WebDriverManager.chromedriver().create();
        webDriver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        webDriverWait = new WebDriverWait(webDriver, 7);
    }


    @Test
    void tapeShopLoginTest() throws InterruptedException {
        //WebDriver webDriver;
        //WebDriverWait webDriverWait = null;
        // webDriverWait = new WebDriverWait(webDriver, 7);
        //webDriverWait = new WebDriverWait(webDriver, 7);
        // WebDriver webDriver = WebDriverManager.chromedriver().create();
        //webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        webDriver.get("https://www.saucedemo.com/");
        webDriver.manage().window().setSize(new Dimension(1500, 720));
        webDriver.findElement(By.name("user-name")).sendKeys("problem_user");
        webDriver.findElement(By.name("password")).sendKeys("secret_sauce");
        webDriver.findElement(By.name("login-button")).click();
        // new WebDriverWait(webDriver, 7);
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(), 'Products')]")));

        Thread.sleep(3000);

        // Напишите ещё два тест-кейса для своего проекта, автоматизируйте основные проверки.

        webDriver.findElement(By.xpath("//a[@id='item_4_title_link']/div")).click();
        Thread.sleep(5000);
        webDriver.quit();

    }
}