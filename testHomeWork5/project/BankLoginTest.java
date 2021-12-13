package ru.gb.lesson.testHomeWork5.project;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class BankLoginTest extends BasicTest {

    @Test
    void chooseBankLoginTest() throws InterruptedException {

        //WebDriver webDriver = WebDriverManager.chromedriver().create();
        //webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        webDriver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/");

        webDriver.manage().window().setSize(new Dimension(500, 460));

        webDriver.findElement(By.xpath("//button[contains(.,'Customer Login')]")).click();
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.name("userSelect")));
        //new WebDriverWait(webDriver, 5).until(ExpectedConditions.presenceOfElementLocated(By.name("userSelect")));
        webDriver.findElement(By.name("userSelect")).sendKeys("Harry Potter");
        webDriver.findElement(By.xpath("//button[contains(.,'Login')]")).click();


        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Welcome')]")));

        Thread.sleep(3000);

        // Напишите ещё два тест-кейса для своего проекта, автоматизируйте основные проверки.

        webDriver.findElement(By.xpath("//button[contains(.,'Transactions')]")).click();

        Thread.sleep(5000);
        //webDriver.quit();
    }
}
