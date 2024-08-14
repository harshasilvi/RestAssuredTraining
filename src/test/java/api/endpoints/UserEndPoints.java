package api.endpoints;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;
import api.payload.User;


import io.restassured.http.ContentType;


public class UserEndPoints {
	
	//user endpoints for curd operations
	
	public static Response createresonse(User payload)
	{
		Response response = given().contentType(ContentType.JSON).accept(ContentType.JSON)
				.body(payload).when().post(Routes.post_url);
		return response;
	}
	
	public static Response readuser(String username) { 
		
		Response response = given().pathParam("uname", username).when()
				.get(Routes.get_url);
		return response;
	}
	
	public static Response updateuser(User payload, String username) {
		
		Response response = given().contentType(ContentType.JSON).accept(ContentType.JSON)
				.body(payload).pathParam("uname", username).put(Routes.put_url);
		return response;
	}
	
	public static Response deleteuser(String username) {
		
		Response response = given().pathParam("uname", username).delete(Routes.delete_url);
		return response;
	}

}
