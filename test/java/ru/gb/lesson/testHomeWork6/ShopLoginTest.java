package ru.gb.lesson.testHomeWork6;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.gb.lesson.testHomeWork6.pages.LoginPage;
import ru.gb.lesson.testHomeWork6.pages.LoginPage;


public class ShopLoginTest extends BasicTest {

    @Test
    void tapeShopLoginTest() throws InterruptedException {
        webDriver.get("https://www.saucedemo.com/");

        new LoginPage(webDriver).loginShop("username", "password")
                .additionalGoods()
                .checkAdditionalGoods();

        Thread.sleep(3000);
    }
}