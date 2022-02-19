package steps;

import Utilities.Variables;
import Utilities.MobileBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;

import java.net.MalformedURLException;

public class Edream extends MobileBase {
    @Given("Start Application")
    public void start_application() throws MalformedURLException {
        setDriver(Variables.Running_Platform);
        System.out.println("Start Application");
        System.out.println(driver.getPlatformName());
    }

    @When("Skip the welcome screens")
    public void skip_the_welcome_screens() {
        SplashNavigator sn = new SplashNavigator();
        sn.skipWelcomeScreens();
    }

    @When("Login with Google")
    public void login_with_google() {
        SplashNavigator sn = new SplashNavigator();
        sn.signInWithGoogle();
    }

    @When("Go to Cars Page")
    public void go_to_cars_page() {
        Home home = new Home();
        home.goToCarsPage();
    }

    @When("Search {string} and Select {string}")
    public void search_and_select(String searchKeyword, String selectKeyword) {
        CarRental cr = new CarRental();
        cr.searchAndSelectLocation(searchKeyword,selectKeyword);
    }

    @When("Select Pickup Date {string} and Select Return Date {string}")
    public void select_pickup_date_and_select_return_date(String pickDate, String returnDate) {
        CarRental cr = new CarRental();
        cr.selectPickReturnDate(pickDate,returnDate);
    }

    @When("Select Driver Age Range {string}")
    public void selectDriverAgeRange(String range) {
        CarRental cr = new CarRental();
        cr.selectDriverAgeRange(range);
    }

    @When("Search for Cars")
    public void search_for_cars() {
        CarRental cr = new CarRental();
        cr.searchCars();
    }

    @When("Open Filters")
    public void open_filters() {
        SearchResults sr = new SearchResults();
        sr.openFilter();
    }

    @When("Set Price Low {string} and Set Price High {string}")
    public void set_price_low_and_set_price_high(String low, String high) {
        SearchResults sr = new SearchResults();
        sr.setPriceRange(low,high);
    }

    @When("Show Filtered Cars")
    public void show_filtered_cars() {
        SearchResults sr = new SearchResults();
        sr.applyFilter();
    }

    @When("Select Car {string} From List")
    public void select_car_from_list(String index) {
        SearchResults sr = new SearchResults();
        sr.selectCar(index);
    }

    @Then("Check the Car Details and Basket prices are the same")
    public void check_the_car_details_and_basket_prices_are_the_same() {
        CarDetail cd = new CarDetail();
        cd.carDetailandBasketPriceCheck();
    }
}
