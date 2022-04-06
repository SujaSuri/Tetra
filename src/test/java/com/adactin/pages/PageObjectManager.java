package com.adactin.pages;

public class PageObjectManager {
    AdactinLoginPage loginPage;
    AdactinHomePage homePage;


   public AdactinLoginPage getloginPage()
    {
        return (loginPage == null) ? loginPage = new AdactinLoginPage() : loginPage;
    }
    public AdactinHomePage getHomePage()
    {
        return (homePage == null) ? homePage = new AdactinHomePage() : homePage;
    }
}

