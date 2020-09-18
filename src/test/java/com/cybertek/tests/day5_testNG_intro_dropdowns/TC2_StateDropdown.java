package com.cybertek.tests.day5_testNG_intro_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC2_StateDropdown {
    //TC #2: Selecting state from State dropdown and verifyingresult
    // 1.Open Chrome browser
    // 2.Go to http://practice.cybertekschool.com/dropdown
    // 3.Select Illinois
    // 4.Select Virginia
    // 5.Select California
    // 6.Verify final selected option is California.
    //   Use all Select options.(visible text, value, index

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test
    public void state_dropdown() throws InterruptedException {
        Select stateSelection = new Select(driver.findElement(By.id("state")));
        stateSelection.selectByVisibleText("Illinois");
        String actualSelectedState = stateSelection.getFirstSelectedOption().getText();
        String expectedState = "Illinois";
        Assert.assertEquals(actualSelectedState, expectedState, "Actual state does not match, failed");
        Thread.sleep(3000);
        driver.close();

    }

    @Test
    public void state_dropdown1() throws InterruptedException {
        Select stateSelection = new Select(driver.findElement(By.id("state")));
        stateSelection.selectByVisibleText("Virginia");
        String actualSelectedState = stateSelection.getFirstSelectedOption().getText();
        String expectedState = "Virginia";
        Assert.assertEquals(actualSelectedState, expectedState, "Actual state does not match, failed");
        Thread.sleep(3000);
        driver.close();

    }

    @Test
    public void state_dropdown2() throws InterruptedException {
        Select stateSelection = new Select(driver.findElement(By.id("state")));
        stateSelection.selectByVisibleText("California");
        String actualSelectedState = stateSelection.getFirstSelectedOption().getText();
        String expectedState = "California";
        Assert.assertEquals(actualSelectedState, expectedState, "Actual state does not match, failed");
        Thread.sleep(3000);
        driver.close();
    }
}