package com.booking.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.booking.baseclass.TestBaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Mobile_StepDefinition extends TestBaseClass {
	
	@Given("user launch The mobile Application")
	public void user_launch_the_mobile_application() {
		
		launchurl("https://www.automationexercise.com/login");
	   
	}
	
	@When("user Enter The {string} in Username Filed")
	public void user_enter_the_in_username_filed(String Username) {
		
	driver.findElement(By.xpath("//*[@data-qa='login-email']")).sendKeys(Username);
	
	    
	}
	
	
	@Then("user Enter The {string} in Password Field")
	public void user_enter_the_in_password_field(String Password) {

		
	driver.findElement(By.xpath("//*[@data-qa='login-password']")).sendKeys(Password);
	    
	}
	
	@Then("user click the mobilelogin button")
	public void user_click_the_mobilelogin_button() {
		
		WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(20));
		
	driver.findElement(By.xpath("//*[@data-qa='login-button']")).click();
	
     String tittle= driver.getTitle();
     System.out.println(tittle);
	
	
	   
	}


}
