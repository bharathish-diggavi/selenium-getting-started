package getting.started;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String currentUrl = driver.getCurrentUrl();
		System.out.println("******************************************");
		System.out.println("Current url is : " + currentUrl);
		System.out.println("******************************************");
		driver.close();
		driver.quit();
	}

}
