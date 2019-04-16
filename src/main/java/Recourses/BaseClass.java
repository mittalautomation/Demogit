package Recourses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass 

{
	public static WebDriver driver;
	public Properties prop;
	
	
	public WebDriver intializebrowser() throws IOException
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Bl@deRunner\\E2EProject\\src\\main\\java\\Recourses\\data.properties");
		prop.load(fis); 	
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\Study\\Testing\\Selenium\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
		}
		else if(browsername.equals("firfox"))
		{
			
		}
		else if(browsername.equals("ie"))
		{
			
		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
		
	}
	public void getScreenshits(String result) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\test\\"+result+"screenshot.png"));
	}
	
	
	



}
