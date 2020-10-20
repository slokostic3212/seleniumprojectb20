package com.cybertek.tests.Library;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class Library_POM {
    public Library_POM() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // set up locators
    @FindBy(xpath = "//input[@id='inputEmail']" )
    public WebElement emailBox;

    @FindBy(xpath = "//input[@id='inputPassword']" )
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy(xpath = "//a[@href='#books']")
    public  WebElement booksButton;
    // set up locators

    // book tab locators
    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;

    @FindBy(xpath = "//td[.='TLKN-1937']")
    public WebElement ISBNText;

    // book tab locators

    @BeforeMethod
    public void setUp() {
        Driver.getDriver().get("http://library2.cybertekschool.com/login.html");
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        emailBox.sendKeys("librarian51@library");
        passwordBox.sendKeys("dBq7G87s");
        signInButton.click();

    }

    @AfterMethod
    public void tearDown(){
        Driver.getDriver().quit();
    }
}
