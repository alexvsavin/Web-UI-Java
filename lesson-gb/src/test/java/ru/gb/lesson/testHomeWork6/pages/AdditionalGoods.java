package ru.gb.lesson.testHomeWork6.pages;

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

    public AdditionalGoods additionalGoods() {
        addsOneGoods.click();
        return this;
    }

    public AdditionalGoods checkAdditionalGoods() {
        new WebDriverWait(webDriver, 8).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(), 'Sauce Labs Fleece Jacket')]")));
        return this;
    }

}
