package UI.SeleniumPractices;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class BrowserNotification {

	public static void main(String[] args) {
		// how to handle browser notification
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(option);

		driver.get("https://www.amazon.in/");
	}

}
