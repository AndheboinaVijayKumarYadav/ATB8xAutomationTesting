package com.vijay.testing.TestNGExamples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class APITestNGParamater012 {

    // parameter value is taken from the xml file in this testing.chrome.xml
    @Parameters("browser")
    @Test
    void demo1(String value) {
        // value is taken from xml file
        System.out.println("Browser is " + value);
        // Open the Browser and select dadadada
        if (value.equalsIgnoreCase("chrome")) {
            System.out.println("Start my Testing");
        }
        if (value.equalsIgnoreCase("firefox")) {
            System.out.println("Start my Firefox");
        }

    }
}
