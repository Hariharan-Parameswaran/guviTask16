package guviTask16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2 {


	public static void main(String[] args) {
		
		// Initialize the Chrome driver
		WebDriver driver = new ChromeDriver();
		
		// Open the website
		driver.get("https://www.demoblaze.com/");
		
		// Maximimize the browser window
		driver.manage().window().maximize();
		
		// Get the title of the page
		String titleName = driver.getTitle();
		System.out.println("title of the page : "+ titleName);
		
		 // Verify the title and print the result
		if(titleName.equals("STORE")) {
			System.out.println("Page landed on correct website");
		}else {
			System.out.println("Page not landed on correct website");
		}
		
	}

}

// Output :
// 	 title of the page : STORE
//	 Page landed on correct website

