package ru.gb.lesson.testHomeWork6.pages;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BaseView {

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(name = "userSelect")
    private WebElement userSelect;

    @FindBy(name = "user-name")
    private WebElement userName;

    @FindBy(name = "password")
    private WebElement passWord;

    @FindBy(id = "login-button")
    private WebElement loginButtonForShop;

    @FindBy(xpath = "//button[contains(.,'Customer Login')]")
    private WebElement loginButtonForBank;

    @FindBy(xpath = "//button[contains(.,'Login')]")
    private WebElement registrationButtonForBank;

    @FindBy(name = "username")
    private WebElement userNameForInternet;

    @FindBy(xpath = "//i[contains(.,' Login')]")
    private WebElement loginButtonForInternet;

    public Products loginShopUsualUser(String username, String password) {

        userName.sendKeys("standard_user");
        passWord.sendKeys("secret_sauce");
        loginButtonForShop.click();
        return new Products(webDriver);
    }

    public AdditionalGoods loginShop(String username, String password) {

        userName.sendKeys("problem_user");
        passWord.sendKeys("secret_sauce");
        loginButtonForShop.click();
        return new AdditionalGoods(webDriver);
    }

    public Transactions loginBank(String username, String password) {

        loginButtonForBank.click();
        userSelect.sendKeys("Harry Potter");
        registrationButtonForBank.click();
        return new Transactions(webDriver);
    }

    public CheckInternetLogin loginInternet(String username, String password) {

        userNameForInternet.sendKeys("tomsmith");
        passWord.sendKeys("SuperSecretPassword!");
        loginButtonForInternet.click();
        return new CheckInternetLogin(webDriver);
    }
}
