package com.cybertek.tests.day2_PracticeTasks;
/*
TC #1: Facebook title verification
1.Open Chrome browser
2.Go to https://www.facebook.com
3.Verify title:
    Expected: “Facebook -Log In or Sign Up”
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_FacebookLoginVerification {
    public static void main(String[] args) {

        //TC #1: Facebook title verification
        //1.Open Chrome browser
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        //2.Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        //3.Verify title: Expected: "Facebook -Log In or Sign Up"
        String actualTitle = driver.getTitle();
        String expectedTitle = "Facebook - Log In or Sign Up";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Verification Passed");
        }else{
            System.out.println("Verifiction Failed");
        }

         //close
        driver.close();

    }
}
