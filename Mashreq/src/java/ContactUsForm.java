package java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.Keywords;

/**
 * Author - Sahil Singla: sahil.9singla@gmail.com
 * 11 July, 2019
 **/

public class ContactUsForm extends Keywords {

	WebDriver driver;
	WebElement submitButtonId = driver.findElement(By.id("btnSubmit"));
	WebElement mobileNumFieldId = driver.findElement(By.id("mobile"));
	WebElement mobileErrorMsgId = driver.findElement(By.xpath(".//span[@ng-show='form.mobile.$error.minlength || form.mobile.$error.maxlength']"));
	WebElement contactUsId = driver.findElement(By.xpath(".//div[@class='rightLinks']/ul/li[3]/a"));
	WebElement formErrorId = driver.findElement(By.xpath(".//div[@class='form-group col-lg-6 col-md-6 col-sm-6 col-xs-6 has-error has-feedback']"));
	

	//this method will go to contact us page and click on submit button without entering anything.
	public boolean clickSubmitBotton() {
		boolean result = false;
		Click(contactUsId);
		Click(submitButtonId);
		result = formErrorId.isDisplayed();
		return result;
	}
	
	//this method will check the mobile number error message display on 6 digit
	public boolean enterInvalidMobileNumber() {
		boolean result = false;
		Click(contactUsId);
		Click(submitButtonId);
		enter(mobileNumFieldId , "123456");
		result = mobileErrorMsgId.isDisplayed();
		return result;
				
	}
}
