package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContextSetup {

	public WebDriver driver;
	public String landingPageProd, OfferPageProd;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	public GenericUtils genericUtils; 
	public TestContextSetup() throws IOException
	{
		testBase=new TestBase();
		genericUtils=new GenericUtils(testBase.WebDriverManager());
		pageObjectManager=new PageObjectManager(testBase.WebDriverManager());
	}
}
