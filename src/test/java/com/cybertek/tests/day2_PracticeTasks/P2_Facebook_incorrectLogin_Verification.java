package com.cybertek.tests.day2_PracticeTasks;
/*
TC #2: Facebook incorrect login title verification
1.Open Chrome browser
2.Go to https://www.facebook.com
3.Enter incorrect username
4.Enter incorrect password
5.Verify title changed to:
    Expected: “Log into Facebook | Facebook”
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_Facebook_incorrectLogin_Verification {
    public static void main(String[] args) {

        // 1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // 2.Go to https://www.facebook.com
        driver.get("https:www.facebook.com");
        driver.manage().window().maximize();

        // 3.Enter incorrect username
        driver.findElement(By.name("email")).sendKeys("slo.kos2020@gmail.com");
        //4. Enter incorrect password
        driver.findElement(By.id("pass")).sendKeys("livinthelife");
        driver.findElement(By.name("login")).click();

        // 5.Verify title changed to: Expected: “Log into Facebook | Facebook
        String expectedTitle = "Log into Facebook | Facebook";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");
        }

        //close
        driver.close();

    }
}
