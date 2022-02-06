package Apis;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import Resources.Utilities;
import io.restassured.RestAssured;

public class GetMaxCardLimit
{

	@Test
	public void GetMaxCardLimit_ApiTest()
	{
		System.out.println("Get Max Card Limit Enable Api");
		System.out.println("------------------");
		RestAssured.baseURI="https://prepaid-gpr-dev-card-management-service.azuremicroservices.io";

		
		String res=	given().headers(Utilities.Headers()).
		when().
		post("/card-management/getMaxCardLimit").
		then().assertThat().extract().response().toString();
		System.out.println(res);
		
		
	}
	
	
	
	
	
}
