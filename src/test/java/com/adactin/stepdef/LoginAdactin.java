package com.adactin.stepdef;

import com.adactin.pages.PageObjectManager;
import com.adactin.utils.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginAdactin extends BaseClass
{
    PageObjectManager pom=new PageObjectManager();

     @Given("open the Hotel adactin")
   public void open_the_hotel_adactin()

     {
        openUrl(readProperties("url"));
   }

    @When("enter the {string} and {string}")
    public void enter_the_and(String username, String password)
    {
        send(pom.getloginPage().getUser(),username);
        send(pom.getloginPage().getPass(),password);
    }
    @When("click the login button")
    public void click_the_login_button() {
        tap(pom.getloginPage().getLogin());

    }
    @Then("validate the outcomes")
    public void validate_the_outcomes() {
        System.out.println("validate");
    }

    @And("Select the Location {string}")
    public void selectTheLocation(String arg0) {
    }

    @And("select the hotel  {string}")
    public void selectTheHotel(String arg0) {
    }

    @And("select the Room {string}")
    public void selectTheRoom(String arg0) {
    }

    @And("select the number of rooms {string}")
    public void selectTheNumberOfRooms(String arg0) {
    }

    @And("Enter the CheckIn Date {string}")
    public void enterTheCheckInDate(String arg0) {
    }

    @And("Enter the checkout Date {string}")
    public void enterTheCheckoutDate(String arg0) {
    }

    @And("select the adult {string}")
    public void selectTheAdult(String arg0) {
    }

    @And("select the children room{string}")
    public void selectTheChildrenRoom(String arg0) {
    }

    @Then("Click the search button")
    public void clickTheSearchButton() {
    }
}
