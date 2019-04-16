package Acedemy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.LandingPage;
import PageObject.LoginPage;
import Recourses.BaseClass;

public class HomePage extends BaseClass
{
	private static Logger log =LogManager.getLogger(HomePage.class.getName());
	@BeforeTest
	public void intialize() throws IOException, InterruptedException
	{
		driver=intializebrowser();
		driver.get(prop.getProperty("url"));
		Thread.sleep(2000);
	}
	
	@Test//(dataProvider="getData")
	
	public void baseclassNavigation ()
	{
	
	LandingPage l=new LandingPage(driver);
	l.getLogin().click(); //driver.findElement(By.css()
//	LoginPage lp=new LoginPage(driver);
	log.info("login url");
	//lp.getEmail().sendKeys(Username);
	//lp.getPassword().sendKeys(Password);
	//Thread.sleep(5000);
	//log.info(text);
	//lp.getLogin().click();  String Username,String Password,String text)
	
	}
	
	/*@DataProvider
	public Object[][] getData() throws Throwable
	{
		Object[][] data=new Object[1][3];
		
		data[0][0]="restricteduser@gmail.com";
		data[0][1]="test123";
		data[0][2]="restricted user";
		Thread.sleep(5000);
		//data[1][0]="nonrestricteduser@gmail.com";
		//data[1][1]="test456";
		//data[1][2]="nonrestricted user";
		
		return data;
		
	}*/
	@AfterTest
	public void teatfown()
	{
		driver.close();
		driver=null;
	}
	
	
	
}
