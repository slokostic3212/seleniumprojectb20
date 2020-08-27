package com.cybertek.tests.day2_PracticeTasks;
/*
TC #1: Zero Bank title verification
1.Open Chrome browser
2.Go to http://zero.webappsecurity.com/login.html
3.Verify title
    Expected: “Zero -Log in”
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Pract1_ZeroBank_TitleVerification {
    public static void main(String[] args) {

        //1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //2.Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");
        driver.manage().window().maximize();

        //3.Verify title Expected: “Zero -Log in”
        String expectedTitle = "Zero -Log in";
        String actualResult = driver.getTitle();

        if (actualResult.equals(expectedTitle)) {
            System.out.println("Verification Passed");
        } else {
            System.out.println("Verification Failed");
        }
    }

}
