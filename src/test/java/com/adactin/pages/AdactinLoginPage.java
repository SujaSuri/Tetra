package com.adactin.pages;

import com.adactin.utils.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinLoginPage extends BaseClass {

    public AdactinLoginPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "username")
    private WebElement user;

    @FindBy(id = "password")
    private WebElement pass;

    @FindBy(id = "login")
    private WebElement login;

    @FindBy(linkText = "Forgot Password?")
    private WebElement forgot;

    @FindBy(linkText = "New User Register Here")
    private WebElement reg;

    public WebElement getUser() {
        return user;
    }

    public WebElement getPass() {
        return pass;
    }

    public WebElement getLogin() {
        return login;
    }

    public WebElement getForgot() {
        return forgot;
    }

    public WebElement getReg() {
        return reg;
    }

}

