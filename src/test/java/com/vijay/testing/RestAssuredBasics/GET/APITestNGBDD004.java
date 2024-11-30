package com.vijay.testing.RestAssuredBasics.GET;


import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITestNGBDD004 {

    @Test
    public void test_Get_Request_Positive(){
        String pin_code =  "388620";
        RestAssured
                .given()
                    .baseUri("https://api.zippopotam.us")
                    .basePath("/IN/"+pin_code)
                .when()
                    .log()
                    .all()
                    .get()
                .then()
                    .log().all()
                    .statusCode(200);
    }
}
