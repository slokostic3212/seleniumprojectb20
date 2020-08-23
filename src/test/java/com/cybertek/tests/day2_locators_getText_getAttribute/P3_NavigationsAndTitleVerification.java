package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_NavigationsAndTitleVerification {
    public static void main(String[] args) {
             // TC #3: Back and forth navigation
            // 1-Open a chrome browser
        WebDriverManager.chromedriver().setup();

        //open browser
        WebDriver driver = new ChromeDriver();

            // 2-Go to: https://google.com http protocol is needed says going to web to get it
        driver.get("https://google.com");

            // 3-Click to Gmail from top right.
        driver.findElement(By.linkText("Gmail")).click();// wo click action google opened and located gmail
            // we are locating
            // 4-Verify title contains:
            // Expected: Gmail
        String expectedInTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if  (actualTitle.contains(expectedInTitle)){
            System.out.println(" Gmail Title Verification PASSED");
        }else{
            System.out.println("Gmail Title Verification FAILED!!");
        }

            // 5-Go back to Google by using the .back();
        driver.navigate().back();
            // 6-Verify title equals:
            // Expected: Google
        String expectedGoogleTitle = "Google";
        String actuaGoogleTitle = driver.getTitle();

        if (actuaGoogleTitle.equals(expectedGoogleTitle)){
            System.out.println("Google title verification PASSED!");
        }else{
            System.out.println("Google title verification FAILED!!");
        }
    }
}
