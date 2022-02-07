package Apis;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import Pojos.ViewCardStatement;
import Resources.Utilities;
import io.restassured.RestAssured;

public class EnableDisable_TranactionStatus 
{

	@Test
	public void EnableDisable_StatusofTransaction()
	{
	
	System.out.println("Enable Disbale Status Transaction");
	System.out.println("------------------");
	RestAssured.baseURI="https://prepaid-gpr-dev-card-management-service.azuremicroservices.io";

	
	String res=	given().headers(Utilities.Headers()).
	when().
	get("/card-management/enablementcardservice/SPP000000539/CTLS/DOM").
	then().assertThat().extract().response().asString();
	System.out.println("--------Response--------");
	System.out.println(res);
	System.out.println("----------------");

	}
	
	
	
}
