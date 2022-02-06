package Apis;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import Pojos.ViewCardStatement;
import Pojos.WalletBalanceEnuiry;
import Resources.Utilities;
import io.restassured.RestAssured;

public class ViewCardStatement_Test 
{
	
	@Test
	public void Card_Statement()
	{
		
		System.out.println("CardStatement Api");
		System.out.println("------------------");
		RestAssured.baseURI="https://prepaid-gpr-dev-statement-service.azuremicroservices.io";
		
		ViewCardStatement c=new ViewCardStatement();
		c.setBranchId("00003495");
		c.setCardRefNumber("SPP000000541");
		c.setCount("10");
		c.setPeriod_Frdt("");
		c.setPeriod_todt("");
		c.setTxnType("");
	
		
		String res=	given().headers(Utilities.Headers()).
		body(c).
		when().
		post("/statement/getCardStatement").
		then().assertThat().extract().response().prettyPrint();
	
		
		
		
		
	}
	
	
	
}
