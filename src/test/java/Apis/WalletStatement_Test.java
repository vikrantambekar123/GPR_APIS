package Apis;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import Pojos.WalletStatementDetails;
import Resources.Utilities;
import io.restassured.RestAssured;

public class WalletStatement_Test 
{

	@Test
	public void Wallet_Statement()
	{
		System.out.println("I am in Wallet Statement Api");
		RestAssured.baseURI="https://prepaid-gpr-dev-statement-service.azuremicroservices.io";
		
		WalletStatementDetails ws=new WalletStatementDetails();
		ws.setCardRefNumber("SPP0007");
		ws.setCount("1");
		ws.setOutletId("00003495");
		ws.setPeriod_Frdt("");
		ws.setPeriod_todt("");
		ws.setTxnType("");
		ws.setWalletKeyIdentifier("TRANSIT");
		

		given().headers(Utilities.Headers()).
		body(ws).log().all().
		when().
		post("statement/getWalletStatement").
		then().assertThat().extract().response().prettyPeek();
		
		
		

		
	}
	
	
	
	
}
