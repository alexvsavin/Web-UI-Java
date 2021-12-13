package ru.gb.lesson.testHomeWork6;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.gb.lesson.testHomeWork6.pages.LoginPage;
import ru.gb.lesson.testHomeWork6.pages.LoginPage;

@DisplayName("магазин Проблемный пользователь")
public class ShopLoginTest extends BasicTest {

    @Test
    @DisplayName("Вход в магазин")
    @Description("Вход в магазин с проблемным юзером и просмотр дополнительного товара")
    @Severity(SeverityLevel.BLOCKER)
    void tapeShopLoginTest() throws InterruptedException {
        webDriver.get("https://www.saucedemo.com/");

        new LoginPage(webDriver).loginShop("username", "password")
                .additionalGoods()
                .checkAdditionalGoods();

        //Thread.sleep(3000);
    }
}