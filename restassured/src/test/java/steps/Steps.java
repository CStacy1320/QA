package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;

public class Steps {
	
	@When("I make a post request")
	public void newPost() {
		List<Object> empty = new ArrayList<Object>();
		baseURI = "https://6143a99bc5b553001717d06a.mockapi.io/testapi/v1//Users";
		Map<String,Object> map = new HashMap<String,Object>();

		map.put( "createdAt"  , 1631825833);
		map.put("employee_firstname"  ,  "TestData12345");
		map.put("employee_lastname"  ,  "TestData12345");
		map.put("employee_phonenumbe"  ,  "264-783-9453" );
		map.put("ademployee_emaildress"  ,  "ademployee_emaildress 1");
		map.put(" citemployee_addressy", "citemployee_addressy 1");
		map.put("stateemployee_dev_level", "stateemployee_dev_level 1");
		map.put("employee_gender", "employee_gender 1");
		map.put("employee_hire_date", "2025-10-31T16:35:45.426Z");
		map.put("employee_onleave", "true");
		map.put("tech_stack", empty);
		map.put("project", empty);
		JSONObject json = new JSONObject(map);
		given().header("Content-Type","application/json").body(map).when().post().then().statusCode(200);
	}
	
	@Then("A new record should be created")
	public void checkRecord() {
		baseURI = "https://6143a99bc5b553001717d06a.mockapi.io/testapi/v1/Users";
		given().get().then().statusCode(200);
	}

}
