package com.cybertek.tests.day10_testbase_properties_driverUtil;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void reading_from_properties_file() throws FileNotFoundException {

        //Properties : use properties class object
        //We create properties object to be able to read configuration.properties file
        Properties properties = new Properties();

        //FileInputStream : opens the file
        String path = "configuration.properties";

        FileInputStream file = new FileInputStream(path);
        //we will load the file
        //we read from the file
        //close the file
    }
}
