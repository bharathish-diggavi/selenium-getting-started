package getting.started;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println("******************************************");
		System.out.println("Current url is : " + title);
		System.out.println("******************************************");
		driver.close();
		driver.quit();
	}

}
