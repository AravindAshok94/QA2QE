package qa2qe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class DriverSetup {
	public static WebDriver driver;
	@Parameters({"driverName","URL"})
	@BeforeClass
	public WebDriver driverSetup(String driverName,String URL) {
		try {
		//if(driverName=="chrome") {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(URL);
		return driver;
		//}
		//else if(driverName=="firefox") {
			//System.setProperty("webdriver.chrome.driver", "./Drivers/geckodriver.exe");
			//driver=new FirefoxDriver();
			//driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//driver.get(URL);
		//}
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

}
