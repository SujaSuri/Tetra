Feature: Validate the search Functionality of Hotel Adactin

  Background:
    Given open the Hotel adactin

    @Search

    Scenario Outline: Validate the Search Functionality of Hotel Adactin
      When enter the "Sujasuri" and "Suja@suri"
      And click the login button
      And Select the Location "<Location>"
      And select the hotel  "<hotel>"
      And select the Room "<Room>"
      And select the number of rooms "<NoRoom>"
      And Enter the CheckIn Date "<InDate>"
      And Enter the checkout Date "<OutDate>"
      And select the adult "<adult>"
      And select the children room"<child>"
      Then Click the search button

      Examples:
      |Location|hotel|Room|NoRoom|InDate|OutDate|adult|child|
      |Melbourne|Hotel Sunshine|Double|4 - Four|24/03/2022|25/03/2022|3 - Three|2 - Two|
      |Sydney   |Hotel Cornice |Double|4 - Four|24/03/2022|25/03/2022|3 - Three|2 - Two|
      |London   |Hotel Hervey  |Double|4 - Four|24/03/2022|25/03/2022|3 - Three|2 - Two|
