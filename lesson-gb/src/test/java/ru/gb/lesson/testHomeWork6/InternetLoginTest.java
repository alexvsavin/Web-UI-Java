package ru.gb.lesson.testHomeWork6;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.gb.lesson.testHomeWork6.pages.LoginPage;

public class InternetLoginTest extends BasicTest {

    @Test
    void internetLoginTest() throws InterruptedException {
        webDriver.get("http://the-internet.herokuapp.com/login");

        new LoginPage(webDriver).loginInternet("username", "password")
                .checkInternetLogin();

                Thread.sleep(3000);

    }

}
