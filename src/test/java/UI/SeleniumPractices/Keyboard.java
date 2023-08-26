package UI.SeleniumPractices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

public class Keyboard {

	public static void main(String[] args) {
		// how do perform keyboard action by using selenium webdriver
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		WebElement element = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
	// By using Actions class
		/*Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();
		action.keyDown(Keys.SHIFT).sendKeys("k").keyUp(Keys.SHIFT).sendKeys("runal").perform();
*/
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='twotabsearchtextbox']")));
		// without action class
		element.click();
		element.sendKeys(Keys.SHIFT, "krunal");
		
		
	}

	

}
