package ru.gb.lesson.testHomeWork6.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyCart extends BaseView {

    public MyCart(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//span[contains(.,'1')]")
    private WebElement myCartBuying;

    public MyCart purchase() {
        myCartBuying.click();
        return this;
    }

    public MyCart checkPurchase() {
        new WebDriverWait(webDriver, 8).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(), 'Your Cart')]")));
        return this;
    }
}
