package com.vijay.testing.RestAssuredBasics.GET;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITestNONBDD005 {

    static RequestSpecification r = RestAssured.given();

    @Description("TC1 - Non BDD Style - Positive")
    @Test
    public void test_Get_Request_Positive(){
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/388620");
        r.when().log().all().get();
        r.then().log().all().statusCode(200);
    }

    @Description("TC1 - Non BDD Style - Negative")
    @Test
    public void test_Get_Request_Negative(){
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/-1");
        r.when().log().all().get();
        r.then().log().all().statusCode(200);
    }
}
