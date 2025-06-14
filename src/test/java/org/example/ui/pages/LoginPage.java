package org.example.ui.pages;

import com.microsoft.playwright.Page;

public class LoginPage {
    private final Page page;
    
    public LoginPage(Page page) {
        this.page = page;
    }
    
    public void login(String user, String pass) {
        page.fill("#username", user);
        page.fill("#password", pass);
        page.click("#login-btn");
        page.waitForLoadState(LoadState.NETWORKIDLE);
    }
}
