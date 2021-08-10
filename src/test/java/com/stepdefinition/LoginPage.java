package com.stepdefinition;

import org.base.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pages.BookHotel;
import com.pages.Login;
import com.pages.SearchHotel;
import com.pages.SelectHotel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPage extends LibGlobal {

	public static WebDriver driver;
	public static LibGlobal global;

	@Given("User is on the adactin page")
	public void user_is_on_the_adactin_page() {

		global = new LibGlobal();
		driver = global.getdriver("chrome");
		global.maximize();
		global.loadUrl("https://adactinhotelapp.com/");

	}

	@When("User should enter the {string} and {string}")
	public void user_should_enter_the_and(String userName, String password) {

		Login login = new Login();
		login.login(userName, password);

	}

	
	@When("User should search hotel by {string}, {string},{string},{string},{string},{string}")
	public void user_should_search_hotel_by(String location, String hotels, String room, String roomNo, String adult,
			String child) {

		SearchHotel searchHotel = new SearchHotel();
		searchHotel.search(location, hotels, room, roomNo, adult, child);
		
	}

	
	@When("User should click select hotel")
	public void user_should_click_select_hotel() {
		SelectHotel selectHotel = new SelectHotel();
		selectHotel.select();
				
		
	}

	@When("User should book a hotel by {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
	public void user_should_book_a_hotel_by(String first, String last, String add, String cc, String name, String month,
			String year, String cvv) {
		BookHotel bookHotel = new BookHotel();
		bookHotel.book(first, last, add, cc, name, month, year, cvv);
	}

	

	@When("User should get OrderNo")
	public void user_should_get_OrderNo() {

		WebElement order = driver.findElement(By.id("order_no"));
		String name = global.getAttributeByValue(order);
		System.out.println(name);

	}

	@Then("User should verify success msg")
	public void user_should_verify_success_msg() {
		System.out.println("success");
		global.closeAllWindlows();
	}

}
