package ru.gb.lesson.testHomeWork6;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.gb.lesson.testHomeWork6.pages.LoginPage;

@DisplayName("БАНК")
public class BankLoginTest extends BasicTest {

    @Test
    @DisplayName("Вход в банк")
    @Description("Вход в банк с именем Гарри Поттер и просмотр трасакций")
    @Severity(SeverityLevel.BLOCKER)
    void bankLoginTest() throws InterruptedException {

        webDriver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/");

        new LoginPage(webDriver).loginBank("username", "password")
                .transactions()
                .checkTransactions();

        //Thread.sleep(3000);

    }
}
