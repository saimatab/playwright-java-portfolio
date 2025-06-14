package org.example.api;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class MockApiTest {
    BrowserContext context;
    Page page;

    @Test
    void mockExternalApi() {
        page.route("**/api/users", route -> {
            route.fulfill(new Route.FulfillOptions()
                .setContentType("application/json")
                .setBody("[{\"name\":\"Mock User\",\"email\":\"mock@test.com\"}]"));
        });
        
        page.navigate("https://reqres.in/");
        assertTrue(page.content().contains("Mock User"));
    }
}
