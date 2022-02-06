package Apis;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import Resources.Utilities;
import io.restassured.RestAssured;

public class GetCardLimitApi 
{

	
	@Test
	public void GetCardLimitApiTest()
	{
		System.out.println("Get Card Limit Api");
		System.out.println("------------------");
		RestAssured.baseURI="https://prepaid-gpr-dev-card-management-service.azuremicroservices.io";

		
		String res=	given().headers(Utilities.Headers()).
		when().
		post("/card-management/getCardLimit").
		then().assertThat().extract().response().toString();
		System.out.println(res);
		
		
	}
	
	
	
	
}
