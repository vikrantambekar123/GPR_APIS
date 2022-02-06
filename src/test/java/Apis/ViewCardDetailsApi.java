package Apis;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import Resources.Utilities;
import io.restassured.RestAssured;

public class ViewCardDetailsApi 
{

	@Test
	public void SetLimitEnable_ApiTest()
	{
		System.out.println("View Card Details Api");
		System.out.println("------------------");
		RestAssured.baseURI="https://prepaid-gpr-dev-card-management-service.azuremicroservices.io";

		
		String res=	given().queryParam("channelId", "").headers(Utilities.Headers()).
		when().
		post("/card-management/getViewCard").
		then().assertThat().extract().response().toString();
		System.out.println(res);
	}
	
	
	
	
}
