package ru.gb.lesson.homeWork3.crm;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        //System.out.println ("Hello World!");

        WebDriver webDriver = WebDriverManager.chromedriver().create();

       // System.setProperty ("webdriver.chrome.driver", "src\main\resources\chromedriver");
       // WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://crm.geekbrains.space/");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        webDriver.quit();
    }
}
