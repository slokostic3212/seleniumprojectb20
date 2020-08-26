package com.cybertek.tests.day2_PracticeTasks;
/*
TC #3: Facebook header verification
1.Open Chrome browser
2.Go to https://www.facebook.com
3.Verify header text is as expected:
    Expected: “Connect with friends and the world around you on Facebook.”
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_Facebook_Header_Verification {
    public static void main(String[] args) {

        //1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // 2.Go to https://www.facebook.com
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        //  3. Verify header text is as expected: Expected: “Connect with friends and the world around you on Facebook

        String actualHeader = driver.findElement(By.tagName("h2")).getText();
        String expectedHeader = "Connect with friends and the world around you on Facebook.";

        if(actualHeader.equals(expectedHeader)){
            System.out.println("Header Verification PASSED!");
        }else {
            System.out.println("Header Verification FAILED!!!");
        }

        //close
        driver.close();


    }

    }


