import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;

import org.testng.annotations.Test;

public class FirstRestAssuredProject {
    @Test
    public void getResponse() {
        Response res = RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println(res.asString());
        System.out.println(res.getBody().asString());
        System.out.println(res.getStatusCode());
        System.out.println(res.getStatusLine());
        System.out.println(res.getHeader("content-type"));
        System.out.println(res.getTime());
        int statusCode = res.statusCode();
        Assert.assertEquals(statusCode,200);
    }
}
