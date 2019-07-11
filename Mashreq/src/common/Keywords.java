package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Author - Sahil Singla: sahil.9singla@gmail.com 
 * 10 July, 2019
 **/

public class Keywords {

	public WebDriver driver;

	public void Click(WebElement elem) {
		try {
			elem.click();
			Thread.sleep(200);
		} catch (InterruptedException e) {
			System.out.println("Error Click on -> " + elem.toString());

		}
	}

	public void enter(WebElement elem, String value) {
		try {

			elem.clear();
			Thread.sleep(100);
			elem.sendKeys(value);

		} catch (InterruptedException e) {
			System.out.println("Error entering data in -> " + elem.toString());

		}
	}

	public void select(WebElement elem, String value) {
		try {

			new Select(elem).selectByVisibleText(value);
			Thread.sleep(200);

		} catch (InterruptedException e) {
			System.out.println("Error Selecting data in ->  " + elem.toString());

		}
	}

}
