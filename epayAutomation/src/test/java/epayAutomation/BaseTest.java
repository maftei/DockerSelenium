package epayAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	protected WebDriver driver;
	@BeforeTest
	public void setUpDrive() {
		System.setProperty("webdirver.chrome.driver", "C:\\Users\\razva\\Downloads\\chromedriver_win32.zip");
		DesiredCapabilities dc=null;
		driver=new ChromeDriver();
		
	}
	
	@AfterTest
	public void quitDriver() {
		this.driver.quit();
	}
	
}
