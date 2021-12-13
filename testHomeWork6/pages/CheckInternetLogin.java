package ru.gb.lesson.testHomeWork6.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckInternetLogin extends BaseView {

    public CheckInternetLogin(WebDriver webDriver) {
        super(webDriver);
    }

    @Step("Проверка, что мы вошли в аккаунт")
    public CheckInternetLogin checkInternetLogin() {
        new WebDriverWait(webDriver, 8).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(), 'Secure Area')]")));
        return this;
    }
}
