package org.example;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class PlaywrightExampleTest {

    static Playwright playwright;
    static Browser browser;
    Page page;

    @BeforeAll
    static void setupClass() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(true));
    }

    @AfterAll
    static void tearDownClass() {
        browser.close();
        playwright.close();
    }

    @BeforeEach
    void setup() {
        page = browser.newPage();
    }

    @AfterEach
    void cleanup() {
        page.close();
    }

    @Test
    void testPlaywrightHomepageTitle() {
        page.navigate("https://playwright.dev/");
        assertEquals("Fast and reliable end-to-end testing for modern web apps | Playwright", page.title());
    }

    @Test
    void testSearchFunctionality() {
        page.navigate("https://playwright.dev/");
        page.locator("[placeholder='Search']").click();
        page.locator("[placeholder='Search']").fill("Java");
        page.keyboard().press("Enter");
        assertTrue(page.content().contains("Getting started with Playwright for Java"));
    }
}
