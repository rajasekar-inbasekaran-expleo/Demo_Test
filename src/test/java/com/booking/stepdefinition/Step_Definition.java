package com.booking.stepdefinition;

import org.openqa.selenium.WebDriver;


import com.booking.baseclass.TestBaseClass;
import com.booking.pom.Login_Page;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition extends TestBaseClass {
	
	public static WebDriver driver = com.booking.runner.Test_Runner.driver;
	
	public Login_Page login = new Login_Page(driver);
	
	@Given("user launch The Application")
	public void user_launch_the_application() {
		
		launchurl("https://adactinhotelapp.com/");
	   
	}
	@When("user Enter The Username In Username Filed")
	public void user_enter_the_username_in_username_filed() {
		
		inputValue(login.getUser_name(), "rajasekari");
	   
	}
	@When(": User Enter The Password In Password Field")
	public void user_enter_the_password_in_password_field() {
		
		inputValue(login.getPassword(), "Raje@123");
	
	}
	@Then(": User Click On The Login Button And It Navigates To Search Hotel Page")
	public void user_click_on_the_login_button_and_it_navigates_to_search_hotel_page() {
		clickonElement(login.getSubmit());
	   
	}
	
	


}
