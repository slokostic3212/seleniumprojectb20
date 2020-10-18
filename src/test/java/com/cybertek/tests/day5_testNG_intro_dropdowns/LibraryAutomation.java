package com.cybertek.tests.day5_testNG_intro_dropdowns;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LibraryAutomation {

    WebDriver driver;

    @BeforeMethod
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
    @Test
    public void clickBooks(){
        WebElement books = driver.findElement(By.xpath("//span[.='Books']"));
        books.click();

        BrowserUtils.wait(2);

        WebElement tabAdd = driver.findElement(By.xpath("//a[@class='btn btn-lg btn-outline btn-primary btn-sm add_book_btn']"));
        tabAdd.click();

         BrowserUtils.wait(2);
    }

}