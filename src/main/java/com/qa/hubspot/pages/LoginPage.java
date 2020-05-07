package com.qa.hubspot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.hubspot.base.BasePage;
import com.qa.hubspot.utils.Constants;
import com.qa.hubspot.utils.ElementUtil;

//import io.qameta.allure.Step;

public class LoginPage extends BasePage {
	
	WebDriver driver;
	ElementUtil elementUtil;

	//1. declare all By Locators:
	By username = By.id("username");
	By password = By.id("password");
	By loginButton = By.id("loginBtn");
	By SignUpLink = By.linkText("Sign up123");

	
	//2. constructor of the page class:
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
	}

	
	//3. Page actions/methods:
	//@Step is for pages and @Descrption is for test cases. @Step and @Description comes from allure
//	@Step("get login page title...")
	public String getLoginPageTitle() {
		 return elementUtil.waitForTitleToBePresent(Constants.LOGIN_PAGE_TITLE, 10);
	}
	
//	@Step("check sign up link on login page...")
	public boolean checkSignUpLink() {
		return elementUtil.doIsDisplayed(SignUpLink);
	}
	
//	@Step("login with - username : {0} and password : {1}")
	public HomePage doLogin(String un, String pwd) {
		elementUtil.doSendKeys(username, un);
		elementUtil.doSendKeys(password, pwd);
		elementUtil.doClick(loginButton);
		
		//whenever we clicking on the login button, we are landing on the home page and According to POM, whenever we are clicking on the button or link and landing on some other page, that method should return landing page object
		return new HomePage(driver);
	}
	
	
	
}
