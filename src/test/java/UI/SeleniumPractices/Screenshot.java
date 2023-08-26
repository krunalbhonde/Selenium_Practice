package UI.SeleniumPractices;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
public class Screenshot {

	public static void main(String[] args) throws IOException {
		//
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("src\\test\\java\\UI\\SeleniumPractices3.jpg");
		FileUtils.copyFile(sourceFile,  destinationFile);
		driver.quit();

	}
}
