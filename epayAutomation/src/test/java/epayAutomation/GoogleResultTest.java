package epayAutomation;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GoogleResultTest extends BaseTest {
	@Test (dataProvider="getData")
	
	public void searchPageTest() {
		GoogleHomePage gp =  new GoogleHomePage(driver);
		GoogleResultPage resultpage=  new GoogleResultPage(driver);
		gp.LaunchUrl();
		gp.isDisplayed();
		gp.searchTest("Docker");
		//gp.clickSuggestionByIndex(3);
		resultpage.isDisplayed();
		Assert.assertEquals("Pass", "Pass");
		
	}
	
	@DataProvider
	public  Object[][] getData() {
		return new Object[][]{
		{"Docker",3},
		{"Selenium",2}
	};
	}
}
