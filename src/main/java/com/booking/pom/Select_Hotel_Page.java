package com.booking.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel_Page {
	
	public static WebDriver driver;

	@FindBy(xpath = "//*[@id=\"radiobutton_0\"]")

	private WebElement SelectRadioButton;

	@FindBy(xpath = "//*[@id=\"continue\"]")
	
	private WebElement ContinueButton;
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public WebElement getradiobutton() {
		return SelectRadioButton;
	}
	
	public WebElement getcontinuebutton() {
		return ContinueButton;
	}
	
	

	public  Select_Hotel_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


}
