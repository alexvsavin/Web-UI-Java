package ru.gb.lesson.testHomeWork6.pages.listener;

import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

import java.io.ByteArrayInputStream;
import java.util.Arrays;

import static io.qameta.allure.Allure.step;

public class ActionEventListener extends AbstractWebDriverEventListener {
    private static final Logger logger = LoggerFactory.getLogger("Action Logger");

    @Override
    public void beforeClickOn(WebElement element, WebDriver driver) {
        String stepName = "Нажать на элемент с текстом" + element.getText();
        step(stepName);
        logger.info(stepName);
        Allure.addAttachment("ScreenShot", new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
    }

    @Override
    public void afterClickOn(WebElement element, WebDriver driver) {
        String stepName = "Успех";
        step(stepName);
        logger.info(stepName);
    }

    @Override
    public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
        String stepName = "Ввести текст " + Arrays.toString(keysToSend) + " в поле с name = " + element.getAttribute("name");
        step(stepName);
        logger.info(stepName);
        Allure.addAttachment("ScreenShot", new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
    }

    @Override
    public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
        String stepName = "Успех";
        step(stepName);
        logger.info(stepName);
    }

    @Override
    public void onException(Throwable throwable, WebDriver driver) {
        Allure.addAttachment("ScreenShot", new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
    }
}
