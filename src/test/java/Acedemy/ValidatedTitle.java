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
 

public class ValidatedTitle extends BaseClass
{
	private static Logger log =LogManager.getLogger(ValidatedTitle.class.getName());
	
	@BeforeTest
	public void intialize() throws IOException, InterruptedException
	{
		driver=intializebrowser();
		log.info("Driver is intialize");
		driver.get(prop.getProperty("url"));
		log.info("Navigate to HomePage");
		Thread.sleep(2000);
	}
	

	@Test
	// This is for Validate Title
	public void validateAppTitle() throws IOException, Throwable
	{
	LandingPage l=new LandingPage(driver);
	Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
	log.info("Successfully Validated Text Message");
	Thread.sleep(2000);
	}

	@AfterTest
	public void teatfown()
	{
		driver.close();
		driver=null;
	}
	
}
