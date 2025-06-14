package org.example.api;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.*;

public class AuthApiTest {
    APIRequestContext request;

    @Test
    void testBearerAuth() {
        APIResponse response = request.get("/secure", 
            RequestOptions.create()
                .setHeader("Authorization", "Bearer test-token"));
        
        assertEquals(200, response.status());
    }
}
