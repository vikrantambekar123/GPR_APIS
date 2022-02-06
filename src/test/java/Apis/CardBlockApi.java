package Apis;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import Resources.Utilities;
import io.restassured.RestAssured;

public class CardBlockApi 
{

	@Test
	public void CardBlockTest()
	{
		System.out.println("Card Block  Api");
		System.out.println("------------------");
		RestAssured.baseURI="https://prepaid-gpr-dev-card-management-service.azuremicroservices.io";

		
		String res=	given().headers(Utilities.Headers()).
		when().
		post("/card-management/blockCard").
		then().assertThat().extract().response().toString();
		System.out.println(res);
	}
	
	
	
	
	
	
}
