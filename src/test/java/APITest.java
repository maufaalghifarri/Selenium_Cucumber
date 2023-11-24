import io.restassured.RestAssured;
import io.restassured.response.Response;
import netscape.javascript.JSObject;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class APITest {
    @Test
    public void testGetListUsers() {
        RestAssured.
                given().when()
                .get("https://reqres.in/api/users?page=2")
                .then().log().all()
                .assertThat().statusCode(200)
                .assertThat().body("per_page", Matchers.equalTo(6))
                .assertThat().body("page", Matchers.equalTo(2));

    }

    @Test
    public void testPostCreateUsers() {
        String valueName = "Aufa";
        String valueJob = "QA";

        JSONObject bodyObj = new JSONObject() ;

        bodyObj.put("name", valueName);
        bodyObj.put("job", valueJob);

        RestAssured.given()
                .header("Content-Type","application/json" )
                .header("Accept","application/json" )
                .body(bodyObj.toString())
                .when()
                .post("https://reqres.in/api/users")
                .then().log().all()
                .assertThat().statusCode(201)
                .assertThat().body("name", Matchers.equalTo(valueName));
//                .assertThat().body("job", Matchers.equalTo(valueJob));

    }
}
