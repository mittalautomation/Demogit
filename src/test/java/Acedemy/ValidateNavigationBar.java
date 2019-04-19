package Acedemy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.LandingPage;
import Recourses.BaseClass;

public class ValidateNavigationBar extends BaseClass
{ // This is Navaigation validate page
	private static Logger log =LogManager.getLogger(ValidateNavigationBar.class.getName());
	@BeforeTest
	public void intialize() throws IOException, InterruptedException
	{
		driver=intializebrowser();
		driver.get(prop.getProperty("url"));
		Thread.sleep(2000);
	}
	
	@Test
	
	public void validateAppBar() throws IOException, Throwable
	{
	LandingPage l=new LandingPage(driver);
	Assert.assertTrue(l.getNavigationbar().isDisplayed());
	log.info("Navigatation bar is display ");
	Thread.sleep(2000);
	
	}

	@AfterTest
	public void teatfown()
	{
		driver.close();
		driver=null;
	}
	
}
