package com.vijay.testing.TestNGExamples;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class APITestNG009 {

    // order of @BeforeTest is not guaranteed in IDE's so specific the order we have give order in xml files explicitly

    @BeforeTest
    public void getToken(){
        System.out.println("1");
    }

    @BeforeTest
    public void getBookingId(){
        System.out.println("2");
    }

    @Test
    public void test1(){
        System.out.println("3");
    }
}
