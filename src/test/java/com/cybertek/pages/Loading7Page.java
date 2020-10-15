package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class Loading7Page {

    public Loading7Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
