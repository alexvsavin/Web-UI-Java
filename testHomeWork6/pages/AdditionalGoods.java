package ru.gb.lesson.testHomeWork6.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdditionalGoods extends BaseView {

    public AdditionalGoods(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//a[@id='item_4_title_link']/div")
    private WebElement addsOneGoods;

    @Step("Перейти на страницу дополнительного товара")
    public AdditionalGoods additionalGoods() {
        addsOneGoods.click();
        return this;
    }

    @Step("Проверка, что мы на странице дополнительного товара")
    public AdditionalGoods checkAdditionalGoods() {
        new WebDriverWait(webDriver, 8).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(), 'Sauce Labs Fleece Jacket')]")));
        return this;
    }

}
