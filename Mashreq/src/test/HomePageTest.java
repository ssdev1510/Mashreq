package test;

import java.HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Author - Sahil Singla: sahil.9singla@gmail.com
 * 10 July, 2019
 **/

public class HomePageTest {
	WebDriver driver;
	

	@BeforeTest(description="Opening and Launches the site")
	public void openUrl() {
		driver = new ChromeDriver();
		driver.get("https://www.mashreqbank.com/");
	}

	@Test(description="Menu Bar test case")
	public void testMenuBar() {
		HomePage HM = new HomePage();
		boolean result = HM.menuIconPresent();
		Assert.assertTrue(result, "Menu Bar test case fails");

	}

	@Test(description="News section test case")
	public void testNewsSection() {
		HomePage HM = new HomePage();
		boolean result = HM.newsSectionPresent();
		Assert.assertTrue(result, "News section test case fails");
	}

	@Test(description="Contact us test case")
	public void testContactUsLink() {
		HomePage HM = new HomePage();
		boolean result = HM.contactUsPage();
		Assert.assertTrue(result, "Contact us link not working, contact us test case fails");
	}

	@AfterMethod(description="Closing the browser")
	public void closeUrl() {
		driver.close();
	}
}
