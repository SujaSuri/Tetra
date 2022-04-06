package com.adactin.pages;

import com.adactin.utils.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinHomePage extends BaseClass
{
    public AdactinHomePage() {PageFactory.initElements(driver, this);
    }

        @FindBy(id="location")
                private WebElement location;
        @FindBy(id="hotels")
                private WebElement hotels;

        @FindBy(id="room_type")
                private WebElement roomType;

        @FindBy(id="room_nos")
                private WebElement roomNos;

        @FindBy(id="datepick_in")
                private WebElement datepickIn;

        @FindBy(id="datepick_out")
                private WebElement datepickOut;

        @FindBy(id="adult_room")
                private WebElement adultRoom;

    @FindBy (id="child_room")
    private WebElement childRoom;

    @FindBy(id="Submit")
    private WebElement Submit;

    @FindBy(id="Reset")
    private WebElement Reset;


    public WebElement getLocation()
        {
            return location;
        }

        public WebElement getHotels()
        {
            return hotels;
        }

        public  WebElement getRoomType()
        {
            return  roomType;
        }

        public WebElement getRoomNos()
        { return roomNos;}
    public  WebElement getDatepickIn()
    { return datepickIn;}

    public WebElement getDatepickOut()
    { return datepickOut;}
    public WebElement getAdultRoom()
    { return adultRoom;}

    public WebElement getChildRoom()
    { return childRoom;}
    public WebElement getSubmit()
    { return Submit;}
    public WebElement getReset()
    { return Reset; }





}
