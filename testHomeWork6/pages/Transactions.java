package ru.gb.lesson.testHomeWork6.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Transactions extends BaseView {

    public Transactions(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//button[contains(.,'Transactions')]")
    private WebElement chooseTransactionButton;

    @Step("Переход на страницу трансакций")
    public Transactions transactions() {
        chooseTransactionButton.click();
        return this;
    }

    @Step("Проверка, что осуществлен переход на страницу трансакций")
    public Transactions checkTransactions() {
        new WebDriverWait(webDriver, 8).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Transaction Type')]")));
        return this;
    }
}
