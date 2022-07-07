package test_scripts;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import generic_scripts.spec_Builder_Api;
import io.restassured.response.Response;

public class Rest5 {
	public static void main(String[] args) throws IOException {
		Response ab = given().spec(spec_Builder_Api.request_spec_builder()).when().get("/api/users?page=2").then().
		spec(spec_Builder_Api.response_spec_builder(200)).extract().response();
		System.out.println(ab.asString());
		//System.out.println(ab.asPrettyString());
	}
}
