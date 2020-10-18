package com.cybertek.tests.day5_testNG_intro_dropdowns;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LibraryAutomation {

    WebDriver driver;

    @Test
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://library2.cybertekschool.com/login.html");

        WebElement emailAddress = driver.findElement(By.xpath("//input[@id='inputEmail']"));
        emailAddress.sendKeys("librarian51@library");

        WebElement password = driver.findElement(By.xpath("//input[@id ='inputPassword']"));
        password.sendKeys("dBq7G87s");

        WebElement signIn = driver.findElement(By.xpath("//button[@type='submit']"));
        signIn.click();

        BrowserUtils.wait(2);

    }
}