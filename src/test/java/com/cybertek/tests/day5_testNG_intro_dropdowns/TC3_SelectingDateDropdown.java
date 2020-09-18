package com.cybertek.tests.day5_testNG_intro_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

public class TC3_SelectingDateDropdown {
    //TC #3: Selecting date on dropdown and verifying
    // 1.Open Chrome browser
    // 2.Go to http://practice.cybertekschool.com/dropdown
    // 3.Select “December 1st, 1921” and verify it is selected.S
    // Select year using: visible text
    // Select month using : value attribute
    // Select day using: index number

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");

    }
    @Test
    public void selectYear() throws InterruptedException {
        Select selectYear = new Select(driver.findElement(By.id("year")));
        selectYear.selectByVisibleText("1921");
        String actualYear =selectYear.getFirstSelectedOption().getText();
        String expectedYear= "1921";
        Assert.assertEquals(actualYear,expectedYear,"Year is not a match, failed");

        Select selectMonth = new Select(driver.findElement(By.id("month")));
        selectMonth.selectByValue("11");
        Thread.sleep(3000);
        String actualMonth = selectMonth.getFirstSelectedOption().getText();
        String expectedMonth ="December";
        Assert.assertEquals(actualMonth,expectedMonth,"Month is not a match, test failed");

        Select selectDay =new Select(driver.findElement(By.id("day")));
        selectDay.selectByValue("1");
        Thread.sleep(3000);
        String actualDay = selectDay.getFirstSelectedOption().getText();
        String expectedDate = "1";
        Assert.assertEquals(actualDay,expectedDate,"Day is not a match, failed.");
    }


}
