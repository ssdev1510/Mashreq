package java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import common.Keywords;

/**
 * Author - Sahil Singla: sahil.9singla@gmail.com
 * 10 July, 2019
 **/

public class HomePage extends Keywords {
	WebDriver driver;
	List<WebElement> list = driver.findElements(By.xpath(".//div[@class='leftLinks']/ul/li/a"));
	WebElement newsSectionId = driver.findElement(By.xpath(".//div[@class='newsBox']/h3"));
	WebElement contactUsId = driver.findElement(By.xpath(".//div[@class='rightLinks']/ul/li[3]/a"));

	/**
	 * this method will check the count of menu options and the verify all the menu
	 * options
	 **/
	public boolean menuIconPresent() {

		boolean result = false;

		String arr[] = { "Corporate", "Business", "International", "Private Banking", "Al Islami", "Gold",
				"Mashreq Securities", "Mashreq Capital", "Mashreq Global Services", "" };

		int count = 0;
		for (WebElement cat : list) {
			System.out.println(cat.getText());
			for (int i = 0; i < arr.length; i++) {
				if (cat.getText().equals(arr[i])) {
					count = count + 1;
					break;
				}
			}
		}
		if (count == 9) {
			result = true;
		}
		System.out.println(result);
		return result;

	}

	/** this method will check the news section on home page **/
	public boolean newsSectionPresent() {
		boolean result = false;
		result = newsSectionId.getText().equalsIgnoreCase("Mashreq News");
		return result;
	}

	/**
	 * this method will click on contact us link on home page and check whether user
	 * successfully moved to contact us page by checking its id.
	 **/
	public boolean contactUsPage() {
		boolean result = false;
		Click(contactUsId);
		String title = driver.getTitle();
		result = title.equalsIgnoreCase("Contact us | Personal Banking | Mashreq Bank");
		return result;
	}

	/*
	 * public static void main(String[] arg) { HomePage hm = new HomePage();
	 * 
	 * }
	 */
}
