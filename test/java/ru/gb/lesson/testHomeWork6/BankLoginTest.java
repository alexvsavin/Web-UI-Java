package ru.gb.lesson.testHomeWork6;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.gb.lesson.testHomeWork6.pages.LoginPage;


public class BankLoginTest extends BasicTest {

    @Test
    void bankLoginTest() throws InterruptedException {

        webDriver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/");

        new LoginPage(webDriver).loginBank("username", "password")
                .transactions()
                .checkTransactions();

                Thread.sleep(3000);

    }
}
