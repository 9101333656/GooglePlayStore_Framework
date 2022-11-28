package com.googlePlayStore.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.playStore.Base.testBase;

public class BookMoviePage extends testBase{

	@FindBy(xpath ="(//span[@class='VfPpkd-YVzG2b'])[3]")
	WebElement moviesButton;
	
	@FindBy(xpath = "//div[text()='Beast (2022)']")
	WebElement beastMovie;

	@FindBy(xpath = "(//span[@class='VfPpkd-vQzf8d'])[1]")
	WebElement buyButton;

	@FindBy(xpath = "(//button[@jsaction='HCZRw'])[4]")
	WebElement sdPriceButton;
	
	@FindBy(xpath ="//img[@class='VfPpkd-kBDsod WrEZCd']")
	WebElement profileTag;
	
	@FindBy(xpath ="//span[text()='Sign in with Google']")
	WebElement signInTag;
	
	@FindBy(xpath ="//input[@id='identifierId']")
	WebElement emailField;
	
	@FindBy(xpath ="//span[text()='Next']")
	WebElement nextButton;
	
	@FindBy(xpath ="//input[@aria-label='Enter your password']")
	WebElement passwordField;
	
	@FindBy(xpath ="//span[text()='Redeem code']")
	WebElement redeemCode;
	
	
	
	
	@FindBy(xpath="(//button[text()='Cancel'])[2]")
	WebElement cancelButton;
	
	@FindBy(xpath="//iframe[@scrolling='yes']")
	WebElement iFrame;
	
	
	@FindBy(xpath="//input[@aria-label='Enter gift card or promo code']")
	WebElement promoCodeField;
	
	public BookMoviePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void logIn() throws AWTException, InterruptedException {
		profileTag.click();
		signInTag.click();
		emailField.sendKeys("ridipmalakar8272@gmail.com");
		nextButton.click();
		passwordField.sendKeys("9954660509");
		Robot rbt = new Robot();
		Thread.sleep(1000);
		rbt.keyPress(KeyEvent.VK_ENTER);
	}
	
	public void buyAMovie() throws InterruptedException, AWTException  {
		moviesButton.click();
		beastMovie.click();
		Thread.sleep(1000);
		buyButton.click();
		
		driver.switchTo().frame(iFrame);
		Thread.sleep(1000);
			
			Actions action = new Actions(driver);
			action.moveByOffset(893, 367).click().perform();
			Thread.sleep(1000);
			redeemCode.click();
			promoCodeField.click();
			promoCodeField.sendKeys("12345678");
			

			
			
		
			
			cancelButton.click();
		
	}
	
}

