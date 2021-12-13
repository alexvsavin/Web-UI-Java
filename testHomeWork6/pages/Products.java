package ru.gb.lesson.testHomeWork6.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Products extends BaseView {

    public Products(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement addToCart;

    @Step("Выбор товара на основной странице магазина")
    public MyCart addToCartBackpackButton() {
        addToCart.click();
        return new MyCart(webDriver);
    }

}
