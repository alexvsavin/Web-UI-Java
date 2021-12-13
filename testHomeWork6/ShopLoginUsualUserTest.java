package ru.gb.lesson.testHomeWork6;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.gb.lesson.testHomeWork6.pages.LoginPage;

@DisplayName("магазин с Обычным пользователем")
public class ShopLoginUsualUserTest extends BasicTest {

    @Test
    @DisplayName("Вход в магазин")
    @Description("Вход в магазин со стандартным юзером и заказ товара в корзину")
    @Severity(SeverityLevel.BLOCKER)
    void shopLoginUsualUserTest() throws InterruptedException {

        webDriver.get("https://www.saucedemo.com/");

        new LoginPage(webDriver).loginShopUsualUser("username", "password")
                .addToCartBackpackButton()
                .purchase()
                .checkPurchase();
        //Thread.sleep(3000);
    }
}
