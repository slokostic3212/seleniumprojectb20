package com.cybertek.tests.day2_PracticeTasks;

/*
TC #2: Zero Bank link text verification
1.Open Chrome browser
2.Go to http://zero.webappsecurity.com/login.html
3.Verify link text from top left:
    Expected: “Zero Bank”
4.Verify link hrefattribute value contains:
        Expected: “index.html”
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract2_ZeroBank_LinkText_Verification {
    public static void main(String[] args) {
        //1.Open Chrome browser
        WebDriverManager.chromedriver();
        WebDriver driver = new ChromeDriver();

        //2.Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        //3.Verify link text from top left:
        //    Expected: “Zero Bank”
        String expectedlinkText = "Zero Bank";
        String actualLinkText = driver.findElement(By.className("brand")).getText();
        if(actualLinkText.equals(expectedlinkText)){
            System.out.println("Verification Passed");

        }else{
            System.out.println("Verification Failed");

        }
        //4.Verify link hrefattribute value contains:
        //        Expected: “index.html”

        String expectedHref="index.html";
        String actualHref=driver.findElement(By.className("brand")).getAttribute("href");
​
​
        if(actualHref.contains(expectedHref)){
            System.out.println("Href attribute verification PASSED!");
        }else{
            System.out.println("Href attribute verification FAILED!!!");
        }




    }
}
