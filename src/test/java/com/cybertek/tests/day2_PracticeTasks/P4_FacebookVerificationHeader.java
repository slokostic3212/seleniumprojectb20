package com.cybertek.tests.day2_PracticeTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC #4: Facebook header verification
1.Open Chrome browser
2.Go to https://www.facebook.com
3.Verify “Create a page” link href value contains text:
    Expected: “registration_form”
 */
public class P4_FacebookVerificationHeader {
    public static void main(String[] args) {

        //1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // 2.Go to https://www.facebook.com
        driver.get("https:www.facebook.com");
        driver.manage().window().maximize();

        // 3.Verify “Create a page” link href value contains text: Expected: “registration_form”

        String actualHREF = driver.findElement(By.className("_8eso")).getAttribute("href");
        String expectedHREF = "registration_form";

        if(actualHREF.equals(expectedHREF)){
            System.out.println("Verification PASSED!");
        }else{
            System.out.println("Verification FAILED!!!");
        }
    }

}
