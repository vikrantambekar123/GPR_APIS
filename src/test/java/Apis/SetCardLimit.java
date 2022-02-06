package Apis;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import Resources.Utilities;
import io.restassured.RestAssured;

public class SetCardLimit
{

	@Test
	public void ReplaceCard_ApiTest()
	{
		System.out.println("Set Card Limit Api");
		System.out.println("------------------");
		RestAssured.baseURI="https://prepaid-gpr-dev-card-management-service.azuremicroservices.io";

		
		String res=	given().queryParam("channelId", "").headers(Utilities.Headers()).
		when().
		post("/card-management/setCardLimit").
		then().assertThat().extract().response().toString();
		System.out.println(res);
	}
	
	
	
	
	
}
