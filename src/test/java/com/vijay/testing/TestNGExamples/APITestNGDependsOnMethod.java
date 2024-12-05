package com.vijay.testing.TestNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITestNGDependsOnMethod {

    @Test
    public void serverStartedOk(){
        System.out.println("started");
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = "serverStartedOk")
    public void method1(){
        System.out.println("working on server, looks good");
    }

    @Test(dependsOnMethods = "serverStartedOk")
    public void method2(){
        System.out.println("I am method2 also working on server, looks good");
    }

}
