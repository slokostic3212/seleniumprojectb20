package com.cybertek.tests.vytrack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
*/
public class Vytrack_Login {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://qa2.vytrack.com/user/login");

        driver.findElement(By.name("form-wrapper")).sendKeys("roles" + Keys.ENTER);

        String expectedTitle = "roles - Vytrack";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("search title verification passed");
        }else{
            System.out.println("search title verification failed");
        }


        driver.close();
    }

}
