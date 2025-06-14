package org.example.ui;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.*;

public class OAuthTest extends TestBase {
    
    @Test
    void oauth2RedirectFlow() {
        page.navigate("https://oauth.example.com/login");
        page.fill("#username", "testuser");
        page.fill("#password", "testpass");
        page.click("#submit");
        
        // Handle OAuth redirect
        page.waitForNavigation(() -> {
            page.waitForSelector("#authorize", new Page.WaitForSelectorOptions().setTimeout(10000));
            page.click("#authorize");
        });
        
        assertTrue(page.url().contains("dashboard"));
    }
}
