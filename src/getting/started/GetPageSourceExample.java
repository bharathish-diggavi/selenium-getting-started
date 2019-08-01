package getting.started;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String source = driver.getPageSource();
		System.out.println("******************************************");
		System.out.println("Current url is : " + source);
		System.out.println("******************************************");
		driver.close();
		driver.quit();
	}

}
