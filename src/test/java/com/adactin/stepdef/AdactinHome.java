package com.adactin.stepdef;

import com.adactin.pages.PageObjectManager;
import com.adactin.utils.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinHome extends BaseClass {
    PageObjectManager pom = new PageObjectManager();


    @When("Select the Location {String}")
    public void select_the_location(String string) {
        dropDownByText(pom.getHomePage().getLocation(), string);
    }
    @When("select the hotel  {String}")
    public void select_the_hotel(String string) {
        dropDownByText(pom.getHomePage().getHotels(), string);
    }
    @When("select the Room {String}")
    public void select_the_room(String string) {
        dropDownByText(pom.getHomePage().getRoomType(), string);
    }
    @When("select the number of rooms {String}")
    public void select_the_number_of_rooms(String string) {
        dropDownByText(pom.getHomePage().getRoomNos(), string);
    }
    @When("Enter the CheckIn Date {String}")
    public void enter_the_checkIn_date(String string) {
        send(pom.getHomePage().getDatepickIn(), string);
    }
    @When("Enter the checkout Date {String}")
    public void enter_the_checkout_date(String string) {
        send(pom.getHomePage().getDatepickOut(), string);
    }
    @When("select the adult {String}")
    public void select_the_adult(String string) {
        dropDownByText(pom.getHomePage().getAdultRoom(), string);

    }
    @When("select the children room{String}")
    public void select_the_children_room(String string) {
        dropDownByText(pom.getHomePage().getChildRoom(), string);
    }
        @Then("click the search button")
                public void click_the_search_button()
        {tap(pom.getHomePage().getSubmit());
    }
}
