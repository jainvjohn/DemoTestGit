
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class DemoBrowserTest
 {

	static WebDriver driver;
	
	
	@BeforeMethod
	public void browserStartUp()
	{
	System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodrier.exe");
	 driver = new FirefoxDriver();
	driver.get("https://www.eclipse.org/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}
	
@Test
public void browserPageTitleTest() 
{
String pageTitle=driver.getTitle();
System.out.println("Title of the page : "+ pageTitle);
}

@AfterMethod()
public void browserTearDown()
{
	driver.close();
	}

	
}
