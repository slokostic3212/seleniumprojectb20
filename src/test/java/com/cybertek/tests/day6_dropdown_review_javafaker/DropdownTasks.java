package com.cybertek.tests.day6_dropdown_review_javafaker;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;
//TC #2: Selecting state from State dropdown and verifyingresult
// 1.Open Chrome browser
// 2.Go to http://practice.cybertekschool.com/dropdown

public class DropdownTasks {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //open a new browser
        driver = WebDriverFactory.getDriver("chrome");
        //maximize the page
        driver.manage().window().maximize();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //get the page
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    //TC #2: Selecting state from State dropdown and verifying result
    @Test
    public void test2_verify_state_dropdown() {
        // we need to locate the dropdown
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        //3. Select Illinois -- selecting by visible text
        Thread.sleep(1000);
        stateDropdown.selectByVisibleText("Illinois");

        //4. Select Virginia --> selecting by value
        Thread.sleep(1000);
        stateDropdown.selectByValue("VA");

        //5. Select California --> select by index
        Thread.sleep(1000);
        stateDropdown.selectByIndex(5);
        //6. Verify final selected option is California.
        String exectedResult = "California";
        String actualResult = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualResult, exectedResult, "Acutal vs expected is not equal");
        // this msg is for failed condition
        //Use all Select options. (visible text, value, index)

    }

    @Test
    public void test3_date_dropdown_verification() {
        //TC #3: Selecting date on dropdown and verifying

        //locate all web elements/dropdowns
        Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='mont']")));
        Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));

        //3. Select “December 1 , 1921” and verify it is selected.

        // selecting year using text
        yearDropdown.selectByVisibleText("1921");

        // selecting month by value attribute
        monthDropdown.selectByValue("11");

        // selecting day by using index
        dayDropdown.selectByIndex(0);

        //creating expected values in one place
        String expectedYear = "1921";
        String expectedMonth = "December";
        String expectedDay = "1";

        //getting our actual values from the web page
        String actualYear = yearDropdown.getFirstSelectedOption().getText();
        String actualMonth = monthDropdown.getFirstSelectedOption().getText();
        String actualDay = dayDropdown.getFirstSelectedOption().getText();

        //creating assert line to compare actual vs expected
        Assert.assertEquals(actualYear, expectedYear, "Actual year vs expected year not equal");
        Assert.assertEquals(actualMonth, expectedMonth, "Actual month vs expected month not equal");
        Assert.assertTrue(actualDay.equals(expectedDay), "Actual day vs expected day not equal");


    }



    //TC #4: Selecting value from multiple select dropdown
    @Test
    public void test4_multiple_value_select_dropdown(){

        //3. Select all the options from multiple select dropdown.
        // locate the dropdown

        Select multipleSelectDropdown = new Select((driver.findElement(By.xpath("//select[@name='Languages']"))));

        //creating a list of web elements to store all of the options inside of this dropdown

        List<WebElement> allOptions = multipleSelectDropdown.getOptions();

        //Loop thru the options to select all of them
        for(WebElement eachOption : allOptions){
            eachOption.click(); // this will click each option with every iteration

            //4. Print out all selected values.
            System.out.println("Selected: " + eachOption.getText());

            //Asserting the option is actually selected or not
            Assert.assertTrue(eachOption.isSelected(), "The option: "+eachOption.getText()+" is not selected!");

        }

        //5. Deselect all values.
        multipleSelectDropdown.deselectAll();

        for(WebElement eachOption : allOptions){
            //Assert.assertTrue(!eachOption.isSelected()); //it will be false boolean value, with ! we make it "true"

            // assertFalse method looks for "false" boolean value to pass the test.
            Assert.assertFalse(eachOption.isSelected());
    }


}






}



