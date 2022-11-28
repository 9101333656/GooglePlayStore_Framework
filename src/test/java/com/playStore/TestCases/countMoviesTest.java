package com.playStore.TestCases;
import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.googlePlayStore.pages.MoviesPage;
import com.playStore.Base.testBase;

public class countMoviesTest extends testBase {
	
	MoviesPage moviesPage;
	
	
	public countMoviesTest() {
		super();
	}
	
	@BeforeClass
	public void setUp() throws AWTException, InterruptedException {
		
		initialization();
		moviesPage = new MoviesPage();
		

}
	
	@Test(priority=1)
	public void moviesPageTitleTest() {
		String title = moviesPage.validateMoviesPageTitle();
		Assert.assertEquals(title, "Android Apps on Google Play");
	}
	
	@Test(priority=2)
	public void gamesPageLogoTest() {
		boolean logo = moviesPage.validateGamesPageLogo();
		Assert.assertTrue(logo);
	}
	
	@Test(priority = 3)
	public void VerifyCountMoviesPresent() throws InterruptedException {
		moviesPage.countMovies();
	}
	@AfterClass
	public void end() {
		driver.quit();
	}
}
