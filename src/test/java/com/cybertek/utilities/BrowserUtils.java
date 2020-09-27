package com.cybertek.utilities;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/*
in this class we will store utility methods that can be applied to any browser to any browser content

anytime you feel like you have a good logic that you can use in the future,
create a method of it and store it in this class

then call it in the future

 */
public class BrowserUtils {

    /**
     * accepts a list of Web Elements
     *
     * @param list
     * @return List<String>
     * method should be returning a list of strings
     */

    public static List<String> getElementsText(List<WebElement> list) {

        List<String> webElementsAsString = new ArrayList<>();
        for(WebElement each : list){
            webElementsAsString.add(each.getText());
        }
        return webElementsAsString;
    }

    /*
    create a utility method named: wait
    static method
    @param sec
    @return void
    the integer number I pass as parameter should be accepted as SECONDS
    handle checked exception with try/cathc
     */

    public static void wait(int sec){
        try {

            Thread.sleep(1000);
        }catch (InterruptedException e){
            //e.printStackTrace();
            System.out.println("Interrupted exception caught");
        }
    }
}



