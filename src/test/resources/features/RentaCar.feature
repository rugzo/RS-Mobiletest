Feature: Rent a car booking

  Scenario: SignIn with Google, Search, Filter and Check Price
    Given Start Application
    When Skip the welcome screens
    When Login with Google
    When Go to Cars Page
    When Search "Istanbul" and Select "Istanbul - Sabiha Gokcen Airport"
    When Select Pickup Date "04-03-2022" and Select Return Date "05-03-2022"
    When Select Driver Age Range "30 - 69"
    When Search for Cars
    When Open Filters
    When Set Price Low "80" and Set Price High "120"
    When Show Filtered Cars
    When Select Car "1" From List
    Then Check the Car Details and Basket prices are the same



