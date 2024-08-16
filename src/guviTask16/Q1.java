package guviTask16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Q1 {

	public static void main(String[] args) throws InterruptedException{
		
		// Initialize the Firefox driver
		WebDriver driver = new FirefoxDriver();

		// Maximimize the browser window
		driver.manage().window().maximize();
		
		// Open the website
		driver.get("http://google.com/");
		
		// Print the URL of the current page
		System.out.println("Url of Current page : "+ driver.getCurrentUrl());
		
		// Reload the page
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		
		//Closes the browser
		driver.quit();

	}

}


//Output :
//	Url of Current page : https://www.google.com/?gws_rd=ssl