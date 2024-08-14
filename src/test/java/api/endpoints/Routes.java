package api.endpoints;
import static io.restassured.RestAssured.*;


public class Routes {
	
	/*Swagger Base URL="https://petstore.swagger.io/"
			Posturl-"https://petstore.swagger.io/user"
			Geturl-"https://petstore.swagger.io/user/{username}"
			Puturl-"https://petstore.swagger.io/user/{username}"
			deleteurl-"https://petstore.swagger.io/user/{username}"*/
			
	public static String base_url="https://petstore.swagger.io/";
	//get user endpoints
	
	public static String post_url= base_url+"/user";
	public static String get_url= base_url+"/user/{username}";
	public static String put_url= base_url+"/user/{username}";
   public static String delete_url= base_url+"/user/{username}";
   
   //store endpoints
   
   //pet endpoints

	

}
