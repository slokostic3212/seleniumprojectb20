package com.cybertek.tests.day3_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class TC1 {

        public static void main(String[] args) {

            //XPATHand CSSSelectorPRACTICESDO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
            // TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
            // 1. Open Chrome browser

            WebDriver driver = WebDriverFactory.getDriver("chrome");

            // 2. Go to http://practice.cybertekschool.com/forgot_password

            driver.get("http://practice.cybertekschool.com/forgot_password");

            // 3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
            // a. “Home” link

            WebElement homeLink = driver.findElement(By.xpath("//a[@class='nav-link']"));

            if (homeLink.isDisplayed()) {
                System.out.println("Home link is displayed");
            } else {
                System.out.println("Home link is Not displayed");
            }
            // b. “Forgot password” header
            WebElement forgotPasswordHeader = driver.findElement(By.xpath("//*[@id=content']/div/h2"));

            if (forgotPasswordHeader.isDisplayed()) {
                System.out.println("Forgot Password header is displayed");
            } else {
                System.out.println("Forgot Password Header is Not displayed");
            }
            // c. “E-mail” text
          //  WebElement emailText = driver.findElement(By.xpath("//label[@for='email']"));

         // ​if (emailText.isDisplayed()) {
          //      System.out.println("Email text is displayed");
          //  } else {
          //      System.out.println("Email text is Not displayed");
         //   }
             //d. E-mail input box
            WebElement forgetPassword = driver.findElement(By.xpath("//*[@id='forgot_password']"));

            if (forgetPassword.isDisplayed()) {
                System.out.println("Forgot password is displayed");
            } else {
                System.out.println("Forgot password is Not displayed");
            }
           // e. “Retrieve password” button
            WebElement retrievePassword = driver.findElement(By.xpath("//*[@id=/'form_submit/']/i"));

            if (retrievePassword.isDisplayed()) {
                System.out.println("Retrieve button is DISPLAYED");
            } else {
                System.out.println("Retrieve button is NOT DISPLAYED");
            }
            // f. “Powered by Cybertek School” text
            WebElement poweredByCybertekSchool = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

            if (poweredByCybertekSchool.isDisplayed()) {
                System.out.println("Powdered by Cybertek School is displayed");
            } else {
                System.out.println("Powered by Cybertek is Not displayed");
            }


            // 4. Verify all WebElements are displayed.
            WebElement allWebElements = driver.findElement(By.xpath("//html[contains(@class,'no-js')]"));

            if (allWebElements.isDisplayed()) {
                System.out.println("All WebElements are displayed");
            } else {
                System.out.println("All WebElements are Not displayed");
            }
            driver.close();


        }
    }
