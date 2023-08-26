package UI.SeleniumPractices;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
public class SSLError {

	public static void main(String[] args) {
		//how do you handle SSL certificate Error
		
		ChromeOptions option = new ChromeOptions();
		
		option.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(option);

		driver.get("https://www.amazon.in/");
		driver.quit();
	}

}
