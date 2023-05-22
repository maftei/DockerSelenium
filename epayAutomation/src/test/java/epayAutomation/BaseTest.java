package epayAutomation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	

	protected WebDriver driver;
	@BeforeTest
	public void setUpDrive() throws MalformedURLException {
		String host ="54.211.55.31"; //here provide the ip adress of the server
		//System.setProperty("webdirver.chrome.driver", "C:\\Users\\razva\\Downloads\\chromedriver_win32.zip");
		DesiredCapabilities dc=null;
		dc=DesiredCapabilities.chrome();
		//driver=new ChromeDriver();
		
		
		if (System.getProperty("BROWSER") !=null && 
		System.getProperty("BROWSER").equalsIgnoreCase("edge")){
			dc=DesiredCapabilities.edge();
		}
		
		if (System.getProperty("HUB_HOST") !=null){
			host=System.getProperty("HUB_HOST");
		}		
		String completeURL="http://" + host + ":4444/wd/hub";
		//http://localhost:4444/ui#
		this.driver = new RemoteWebDriver(new URL(completeURL),dc);
		
	}
	
	@AfterTest
	public void quitDriver() {
		this.driver.quit();
	}
	
}
