package guviTask16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3 {

	public static void main(String[] args) {
		// Initialize the Chrome driver
		WebDriver driver = new ChromeDriver();

		// Open the website
		driver.get("https://www.wikipedia.org/");

		// Maximimize the browser window
		driver.manage().window().maximize();

		// Enter the search query "Artificial Intelligence" and submit
		driver.findElement(By.name("search")).sendKeys("Artificial Intelligence");

		driver.findElement(By.name("search")).submit();

		// Click on the "History" section link within the article
		driver.findElement(By.linkText("History")).click();

		 // Get the title of the "History" section and print it
		String titleSection = driver.findElement(By.id("History")).getText();
		System.out.println("Title of the Section : " + titleSection);
	}

}

// Output :
//	 Title of the Section : History
	