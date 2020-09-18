package com.cybertek.tests.day5_testNG_intro_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC1_SimpleDropDown_State {
    //TC#1: Verifying “Simple dropdown” and “State selection” dropdown default values
    // 1.Open Chrome browser
    // 2.Go to http://practice.cybertekschool.com/dropdown
    // 3.Verify “Simple dropdown” default selected value is correct
    //   Expected: “Please select an option”
    // 4.Verify“State selection” default selected value is correct
    //   Expected: “Select a State”

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");

    }
    @Test
    public void dropdown() throws InterruptedException{
        Select simpleSelect = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

        String expectedResult = "Please select an option";
        String actualResult = simpleSelect.getFirstSelectedOption().getText();

        Assert.assertEquals(expectedResult, actualResult);

        simpleSelect.selectByVisibleText("Option 1");

    }
    @Test
    public void state(){
        Select stateSelection = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        String stateExpectedResult = "Select a State";
        String stateActualResult = stateSelection.getFirstSelectedOption().getText();

        Assert.assertEquals(stateActualResult, stateExpectedResult);

        stateSelection.selectByVisibleText("Virginia");

    }
    @AfterMethod
    public void closeMethod() throws InterruptedException{
        Thread.sleep(3000);
        driver.close();
    }

}
