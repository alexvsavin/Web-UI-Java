package ru.gb.lesson.homeWork3.project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ShopLogin {
    public static void main(String[] args) throws InterruptedException {

        WebDriver webDriver = WebDriverManager.chromedriver().create();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        webDriver.get("https://www.saucedemo.com/");

        webDriver.manage().window().setSize(new Dimension(1500, 720));

        webDriver.findElement(By.name("user-name")).sendKeys("problem_user");
        webDriver.findElement(By.name("password")).sendKeys("secret_sauce");
        webDriver.findElement(By.name("login-button")).click();

        Thread.sleep(5000);
        webDriver.quit();

    }
}