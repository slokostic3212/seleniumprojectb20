package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekURLVerification {

    public static void main(String[] args) {
        //TC	#2:
        // Cybertek	verifications
        // 1.Open	Chrome	browser
        // i need to setup my browser driver
        WebDriverManager.chromedriver().setup();

        //to create instance of chrome browser from WebDriver
        WebDriver driver = new
                ChromeDriver();

        //this line will maximize the newly opened browser page
        driver.manage().window().maximize();

        // 2.Go	to	https://practice.cybertekschool.com
        driver.get("http://practice.cybertekschool.com");

        // 3.Verify	URL	contains
        // Expected:	cybertekschool
        String expectedInURL = "cybertekschool";
        String actualURL = driver.getCurrentUrl();

        if (actualURL.contains(expectedInURL)){
            System.out.println("URL verification PASSED");
        }else{
            System.out.println("URL verification FAILED!!");
        }

        // 4.Verify	title:
        // Expected: Practice

        //   actual                    expected
        if (driver.getTitle().equals("Practice")){
            System.out.println("Title Verification PASSED");
        }else{
            System.out.println("Title Verificaton FAILED !!");
        }
    }
}
