package getting.started;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://bharathish-diggavi.github.io/Selenium-Practice/new-window-example.html");
		driver.findElement(By.id("submit-button")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
