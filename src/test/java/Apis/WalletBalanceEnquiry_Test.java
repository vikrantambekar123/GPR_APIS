package Apis;

import org.testng.annotations.Test;

import Pojos.WalletBalanceEnuiry;
import Resources.Utilities;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;


public class WalletBalanceEnquiry_Test 
{
	
	@Test
	public void WalletbalanceEnquiry_ApiTest()
	{
		System.out.println("I am in WalletBalnaceEnquiry Api");
		RestAssured.baseURI="https://prepaid-gpr-dev-statement-service.azuremicroservices.io";
		
		WalletBalanceEnuiry w=new WalletBalanceEnuiry();
		w.setCardRefNumber("SPP000001557");
		w.setOutletId("00003495");
		w.setWalletName("TRANSIT");
		
		String res=	given().headers(Utilities.Headers()).
		body(w).log().all().
		when().
		post("/card-management/getWalletBalance").
		then().assertThat().extract().response().asString();
		
		System.out.println(res);
		
		
	}
	
	
	
	
	
}
