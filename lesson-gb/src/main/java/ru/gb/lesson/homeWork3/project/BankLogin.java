package ru.gb.lesson.homeWork3.project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BankLogin {

    public static void main(String[] args) throws InterruptedException {

        WebDriver webDriver = WebDriverManager.chromedriver().create();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        webDriver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/");

        webDriver.manage().window().setSize(new Dimension(500, 460));

        webDriver.findElement(By.xpath("//button[contains(.,'Customer Login')]")).click();

        new WebDriverWait(webDriver, 5).until(ExpectedConditions.presenceOfElementLocated(By.name("userSelect")));
        webDriver.findElement(By.name("userSelect")).sendKeys("Harry Potter");
        webDriver.findElement(By.xpath("//button[contains(.,'Login')]")).click();



       // webDriver.findElement(By.cssSelector("center:nth-child(1) > .btn")).click();

        Thread.sleep(5000);
        webDriver.quit();
    }
}
