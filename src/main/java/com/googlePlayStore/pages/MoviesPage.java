package com.googlePlayStore.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.playStore.Base.testBase;

public class MoviesPage extends testBase {

	@FindBy(xpath = "(//span[@class='VfPpkd-YVzG2b'])[3]")
	WebElement moviesButton;

	@FindBy(css = "svg.kOqhQd")
	WebElement googlePlayLogo;


	@FindBy(xpath = "(//span[text()='Top movies'])[2]")
	WebElement scrollElement;
	
	@FindBy(xpath="(//i[contains(@aria-hidden,'true')][normalize-space()='chevron_right'])[3]")
	WebElement rightArrowButton;
	
	@FindBy(xpath = "//span[@class='DdYX5']")
	WebElement topGumMovie;
	

	@FindBy(css = ".T75of.ECOsRb")
	List<WebElement> moviesClass;

	public MoviesPage() {// Constructor
		PageFactory.initElements(driver, this);

	}

	public String validateMoviesPageTitle() {
		return driver.getTitle();
	}

	public Boolean validateGamesPageLogo() {
		return googlePlayLogo.isDisplayed();
	}

	public BookMoviePage countMovies() throws InterruptedException {

		moviesButton.click();
		driver.navigate().refresh();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500);");
		
	//	WebElement element1 = driver.findElement(By.xpath("//span[@class='DdYX5']"));
		/*Actions action = new Actions(driver);
		action.moveToElement(topGumMovie,150, 0).perform();
		Thread.sleep(1000);
		rightArrowButton.click();*/

		System.out.println("Total movies present is : " + moviesClass.size());

		return new BookMoviePage();
	}
}
