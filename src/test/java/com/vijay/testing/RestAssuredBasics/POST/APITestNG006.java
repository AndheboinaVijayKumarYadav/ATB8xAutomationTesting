package com.vijay.testing.RestAssuredBasics.POST;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class APITestNG006 {

    // Rest ful booker
    // https://restful-booker.herokuapp.com/auth
    //{
    //    "username" : "admin",
    //    "password" : "password123"
    //}

    // Content-Type: application/json

    @Description("TC1: Verification of POST Request for creating a token BDD style: Positive")
    @Test
    public void test_Post_request_positive(){

        String payload  = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth")
                .contentType(ContentType.JSON)
                .log().all().body(payload)
                .when().log().all().post()
                .then().statusCode(200);
    }
}
