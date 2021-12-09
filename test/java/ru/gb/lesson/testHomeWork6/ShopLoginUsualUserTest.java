package ru.gb.lesson.testHomeWork6;

import org.junit.jupiter.api.Test;
import ru.gb.lesson.testHomeWork6.pages.LoginPage;

public class ShopLoginUsualUserTest extends BasicTest {

    @Test
    void shopLoginUsualUserTest() throws InterruptedException {

        webDriver.get("https://www.saucedemo.com/");

        new LoginPage(webDriver).loginShopUsualUser("username", "password")
                .addToCartBackpackButton()
                .purchase()
                .checkPurchase();
        Thread.sleep(3000);
    }
}
