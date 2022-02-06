package Apis;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import Resources.Utilities;
import io.restassured.RestAssured;

public class ReplaceCardApi 
{
	
	@Test
	public void ReplaceCard_ApiTest()
	{
		System.out.println("Replace Card Api");
		System.out.println("------------------");
		RestAssured.baseURI="https://prepaid-gpr-dev-card-management-service.azuremicroservices.io";

		
		String res=	given().queryParam("channelId", "").headers(Utilities.Headers()).
		when().
		post("/card-management/replaceCard").
		then().assertThat().extract().response().toString();
		System.out.println(res);
		
		
	}
	
	
	
	
}
