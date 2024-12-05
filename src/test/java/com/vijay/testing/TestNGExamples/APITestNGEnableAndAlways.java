package com.vijay.testing.TestNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITestNGEnableAndAlways {

    @Test(enabled = false)
    public void test01(){
        Assert.assertTrue(true);
    }


    // alwaysRun will execute if dependsUponMethod fails also
    @Test(alwaysRun = true)
    public void test02(){
        Assert.assertTrue(true);
    }

    // test will run those many number of times
    @Test(invocationCount = 5)
    public void test03(){
        Assert.assertTrue(true);
    }
}
