package com.cybertek.tests.day5_testNG_intro_dropdowns;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


    public class BitrixAutomation {
        WebDriver driver;

        @BeforeMethod
        public void setUpMethod() {
            driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.get("https://login2.nextbasecrm.com/auth/?backurl=%2Fstream%2F");


                WebElement userName = driver.findElement(By.xpath("//input[@class='login-inp']"));
                userName.sendKeys("marketing19@cybertekschool.com");

                WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
                password.sendKeys("UserUser");

                WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
                loginButton.click();

                BrowserUtils.wait(2);
            }

            @Test
            public void clickMessage(){
                WebElement message = driver.findElement(By.xpath("//span[.='Message']"));
                message.click();

                WebElement topicIcon = driver.findElement(By.xpath("//span[@title='Topic']"));
                topicIcon.click();

                WebElement TopicBlock = driver.findElement(By.xpath("//input[@class='feed-add-post-inp feed-add-post-inp-active']"));
                TopicBlock.click();

                BrowserUtils.wait(2);

            }


        }

