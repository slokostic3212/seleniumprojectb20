package com.cybertek.tests.day13_pom_synchronization;

import com.cybertek.utilities.Driver;
import org.testng.annotations.Test;

//TC#40: Dynamically Loaded Page Elements 7
// 1.Go to http://practice.cybertekschool.com/dynamic_loading/7
// 2.Wait until title is “Dynamic Title”
// 3.Assert : Message “Done” is displayed.
// 4.Assert : Image is displayed.
// Note: Follow POM
public class Synchronization_Practices {

    @Test
    public void p40_dynamic_title_test(){
        String url = " http://practice.cybertekschool.com/dynamic_loading/7";
        Driver.getDriver().get(url);
    }

}
