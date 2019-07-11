package test;

import java.ContactUsForm;
import java.HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Author - Sahil Singla: sahil.9singla@gmail.com 
 * 11 July, 2019
 **/

public class ContactUsFormTest {
	WebDriver driver;

	@BeforeTest(description = "Opening and Launches the site")
	public void openUrl() {
		driver = new ChromeDriver();
		driver.get("https://www.mashreqbank.com/");
	}

	@Test(description = "Sumbit form with error test case")
	public void testContactUsSubmitButton() {
		ContactUsForm CU = new ContactUsForm();
		boolean result = CU.clickSubmitBotton();
		Assert.assertTrue(result, "Error message not displayed");
	}

	@Test(description = "Mobile number error message test case")
	public void testEnterInvalidMobileNumber() {
		ContactUsForm CU = new ContactUsForm();
		boolean result = CU.enterInvalidMobileNumber();
		Assert.assertTrue(result, "Error message not displaying");
	}

	@AfterMethod(description = "Closing the browser")
	public void closeUrl() {
		driver.close();
	}
}
