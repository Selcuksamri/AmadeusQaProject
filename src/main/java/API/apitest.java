package API;


import org.testng.annotations.Test;

import static java.util.Optional.empty;
import static org.slf4j.MDC.get;

public class apitest {

    @Test
    public void testGetRequest() {
        // API base URL
        RestAssured.baseURI = "https://flights-api.buraky.workers.dev/";

        // Test 1: HTTP status code kontrolü
        get("/").then().statusCode(200);

        // Test 2: Response içeriğini kontrol et
        get("/").then().body("data", not(empty()));

        // Test 3: Header kontrolü
        get("/").then().header("Content-Type", equalTo("application/json"));

        // Test 4: Response içeriğinin formatını kontrol et
        get("/").then().body("data", hasItems(
                hasEntry("id", 1),
                hasEntry("from", "IST"),
                hasEntry("to", "LAX"),
                hasEntry("date", "2022-12-13")
        ));
    }

}
