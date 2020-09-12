package com.cybertek.tests.day4_findElements_checkboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P0_FindElements_Practice1 {

    public static void main(String[] args) {
        //TC #0: FINDELEMENTS
        // 1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        // 3.Print out the texts of all links
          List<WebElement> listOfLinks =  driver.findElements(By.xpath("//body//a"));


        //looping thru the lsit of webelements we jsut created
        for (WebElement eachLink : listOfLinks){
           // System.out.println(eachLink);
            //[[ChromeDriver: chrome on WINDOWS (b91957ed57fd65aaa5c6dcf17474baaa)] -> xpath: //body//a]
            //[[ChromeDriver: chrome on WINDOWS (b91957ed57fd65aaa5c6dcf17474baaa)] -> xpath: //body//a]

             //getting the text of each element in each iteration and printing the values
            System.out.println(eachLink.getText());// get Home
                                                   // get Cybertek School
        }

        // 4.Print out how many total link
        int numberOfLinks = listOfLinks.size();

        System.out.println("numberOfLinks = " + numberOfLinks);//get Home
                                                               //get Cybertek School
                                                               // get numberOfLinks = 2
    }
}
