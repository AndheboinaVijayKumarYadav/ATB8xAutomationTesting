package com.vijay.testing.RestAssuredBasics.POST;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITestNG007 {

    @Description("TC1: Verify the Post request with Non BDD style: Positive")
    @Test
    public void test_Post_request_positive(){
        String payload  = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        RequestSpecification r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON).log().all();
        r.body(payload);
        r.when().post();
        r.then().log().all().statusCode(200);
    }
}
