import org.testng.annotations.Test;

import static io.restassured.RestAssured.when;

public class Rest_Del {
    @Test
    public void Test_Del() {
        when().
                delete("https://reqres.in/api/users/2").
                then().
                statusCode(204).log().all();
    }
}
