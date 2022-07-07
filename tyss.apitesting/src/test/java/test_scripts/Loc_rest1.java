package test_scripts;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import generic_scripts.spec_Builder_Api;
import io.restassured.response.Response;

public class Loc_rest1 {
	public static void main(String[] args) throws IOException {
		Response b = given().log().all().spec(spec_Builder_Api.request_spec_builder()).when().
				get("/maps/api/place/get/json?place_id=b9c94f182b13ea59b1166c3865ce1925&key=qaclick123")
				.then().spec(spec_Builder_Api.response_spec_builder(200)).log().all().extract().response();
		System.out.println(b.asString());
	}
}
