package studentApiTest;

import org.testng.annotations.Test;

import apiConfigs.APIPath;
import baseTest.BaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetApiTests extends BaseTest{
	@Test
	public void getApiTest() {
	
	//RestAssured.when().get(APIPath.apiPath.GET_LIST_OF_POSTS).then().log().all();	
		Response Response = RestAssured.when().get(APIPath.apiPath.GET_LIST_OF_POSTS);
		System.out.println(Response.getBody().asString());
		System.out.println(Response.getStatusCode());
		System.out.println(Response.getTime());
		System.out.println(Response.getCookies());
	}

}
