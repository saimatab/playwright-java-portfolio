package org.example.ui;

import com.microsoft.playwright.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class CrossBrowserTest extends TestBase {

    @ParameterizedTest
    @ValueSource(strings = {"chromium", "firefox", "webkit"})
    void testLogin(String browserType) {
        Browser browser = TestConfig.createBrowser(playwright, browserType);
        Page page = browser.newPage();
        
        page.navigate(TestConfig.BASE_URL);
        new LoginPage(page).login("admin", "admin123");
        assertTrue(new DashboardPage(page).isLoaded());
    }
}
