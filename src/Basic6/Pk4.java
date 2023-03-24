package Basic6;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Pk4 {

	public static void main(String[] args) throws IOException {
		
		// Single Element ScreenShot 
		LocalDateTime ltd = LocalDateTime.now();
		//System.out.println(Lad);
		String timeStamp = ltd.toString().replace(':','-');
		System.setProperty("Webdriver.chrome.driver","./Drives/chromedriver.exe");
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.facebook.com/");
		WebElement button = driver.findElement(By.name("login"));
		File tempFile = button.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./singleimg/pune.png"+timeStamp+".png"); 
		//tempFile.renameTo(destFile);
		FileUtils.copyFile(tempFile, destFile);
	}
}
