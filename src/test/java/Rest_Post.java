import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class Rest_Post
{
    @Test
    public void TC_Post()
    {
        JSONObject request = new JSONObject();
        request.put("name","Tarun");
        request.put("job","QA");
        System.out.println(request.toJSONString());

        given().header("Content-Type","application/json").
                contentType(ContentType.JSON).accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                post("https://reqres.in/api/users").
                then().
                statusCode(201).log().all();

    }
}
