package com.vijay.testing.TestNGExamples;

import org.testng.annotations.Test;

public class APITestNG010 {

    @Test(priority = 2)
    public void test1(){
        System.out.println("1");
    }

    @Test(priority = 3)
    public void test2(){
        System.out.println("2");
    }

    @Test(priority = 1)
    public void test3(){
        System.out.println("3");
    }



//    if priority is not mentioned then it will take alphanumeric order execution
//    @Test
//    public void b(){
//        System.out.println("b");
//    }
//    @Test
//    public void a(){
//        System.out.println("a");
//    }


}
