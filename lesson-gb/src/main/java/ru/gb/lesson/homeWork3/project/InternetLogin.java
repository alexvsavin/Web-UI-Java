package ru.gb.lesson.homeWork3.project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class InternetLogin {

    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = WebDriverManager.chromedriver().create();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        webDriver.get("http://the-internet.herokuapp.com/login");

        webDriver.manage().window().setSize(new Dimension(700, 520));

        webDriver.findElement(By.name("username")).sendKeys("tomsmith");
        webDriver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
        webDriver.findElement(By.xpath("//i[contains(.,' Login')]")).click();


        Thread.sleep(5000);
        webDriver.quit();
    }
}
