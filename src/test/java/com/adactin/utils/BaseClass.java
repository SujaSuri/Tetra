package com.adactin.utils;

import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

public class BaseClass {
    public static WebDriver driver;
    public static Scenario scenario;

   public static String readProperties(String key)
    {
        String value = null;
        try{
            File file = new File ("C:src/test/resources/config.properties") ;
            FileInputStream fis = new FileInputStream(file);
            Properties properties = new Properties();
            properties.load(fis);
            value = properties.getProperty(key);
    } catch (Exception e)

    {
        e.printStackTrace();
    }
    return value;

    }
    public void launchBrowser(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("edge"))
        {
            WebDriverManager.edgedriver().setup();
            driver=new EdgeDriver();
        }
    }

    public void maxi() {
        driver.manage().window().maximize();
    }

    public void iwait(int time) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
    }

    public void closeBrowser() {
        driver.quit();
    }

    public void send(WebElement element, String value) {
        element.clear();
        element. sendKeys(value);
    }

    public void tap(WebElement element) {
        element.click();
    }

    public void openUrl(String url) {
        driver.get(url);
    }

    public void dropDownByText(WebElement element, int index)
    {
        Select sc= new Select(element);
        sc.selectByIndex(index);
    }
    public void dropDownByText(WebElement element, String text)
    {
        Select sc= new Select(element);
        sc.selectByVisibleText(text);
    }
    }




