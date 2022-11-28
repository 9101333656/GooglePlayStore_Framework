package com.playStore.TestCases;

import java.awt.AWTException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.googlePlayStore.pages.BookMoviePage;
import com.googlePlayStore.pages.MoviesPage;
import com.playStore.Base.testBase;

public class bookMovieTest extends testBase {
	
	MoviesPage moviesPage;
	BookMoviePage bookMovie;
	
	public bookMovieTest() {
		super();
	}
	
	@BeforeClass
	public void setUp() throws AWTException, InterruptedException {
		initialization();
		//moviesPage = new MoviesPage(); 
		bookMovie = new BookMoviePage();
		bookMovie.logIn();
		
	}
	
	@Test
	public void verifyBuyAMovieTest() throws InterruptedException, AWTException {
		bookMovie.buyAMovie();
	}
	
	@AfterClass
	public void end() {
		driver.quit();
	}

}
