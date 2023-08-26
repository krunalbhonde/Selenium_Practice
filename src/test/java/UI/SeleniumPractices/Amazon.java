package UI.SeleniumPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		// to perform mouse on sign and click it
		/*
		 * WebElement element =
		 * driver.findElement(By.xpath("//*[@id='nav-link-accountList']")); Actions
		 * action = new Actions(driver);
		 * action.moveToElement(element).click().perform();
		 */

		// to convert english mode to marathi mode
		
		  WebElement language = driver.findElement(By.xpath("//*[@id='icp-nav-flyout']"));
		
		  Actions action = new Actions(driver);
		  action.moveToElement(language).click().perform(); // by using window handle
		  String mainPage = driver.getWindowHandle();
		  driver.switchTo().window(mainPage);
		  driver.findElement(By.xpath("//*[@id='icp-language-settings']/div[9]/div")).click();
		  driver.findElement(By.xpath("//*[@class='a-button-input']")).click();
		

		

	}

}
