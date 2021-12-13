package ru.gb.lesson.testHomeWork6;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.gb.lesson.testHomeWork6.pages.LoginPage;
@DisplayName("тестирование Интернет-входа")
public class InternetLoginTest extends BasicTest {

    @Test
    @DisplayName("Вход по интернет логину")
    @Description("Вход по интернет логину с проверкой")
    @Severity(SeverityLevel.BLOCKER)
    void internetLoginTest() throws InterruptedException {
        webDriver.get("http://the-internet.herokuapp.com/login");

        new LoginPage(webDriver).loginInternet("username", "password")
                .checkInternetLogin();

                //Thread.sleep(3000);

    }

}
