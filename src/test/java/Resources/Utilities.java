package Resources;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Random;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class Utilities 
{

	public static String get_sessionid()
	{
		Random rand= new Random();
		int int3 = rand.nextInt(100);
		RestAssured.baseURI="http://172.16.122.20:8084";
		String response=given().queryParam("channelId", "SMB0000001").header("Content-Type","application/json").
		body("{\r\n"
				+ "\"header\":{\r\n"
				+ "\"srvcName\":\"AUTHENTICATEUSER\",\r\n"
				+ "\"channelId\":\"SMB0000001\",\r\n"
				+ "\"tgtAppId\":\"PCMS\",\r\n"
				+ "\"orgId\":\"SM0001\",\r\n"
				+ "\"versionNo\":\"V2\",\r\n"
				+ "\"test\":\"SimbaUser\"\r\n"
				+ "},\r\n"
				+ "\"request\":{    \r\n"
				+ "\"srcReqId\":\""+int3+"\",\r\n"
				+ "\"branchId\":\"00003495\",\r\n"
				+ "\"userId\":\"SimbaUser\",\r\n"
				+ "\"password\":\"73d0b1f1e7a818c826a4e81a580f824c\"\r\n"
				+ "}\r\n"
				+ "}\r\n"
				+ "").
		when().post("/simba_ws/outletPortalWithoutEnc/authenticateCustomer").then().
		extract().response().asString();
		
		JsonPath json=new JsonPath(response);
		String SessionId=json.getString("response.sessionId");
		return SessionId;
	
	}
	
	
	public static HashMap<String, String> Headers()
	{
		HashMap<String, String>h=new HashMap<String,String>();
		h.put("srcReqId","asdasdasd");
		h.put("Content-Type","application/json");
		h.put("channelId","SMB0000001");
		return h;	
	}
	
	
}
