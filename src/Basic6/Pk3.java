package Basic6;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Pk3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//Take Screen Shot
		LocalDateTime ltd = LocalDateTime.now();
		//System.out.println(ltd);
		String timeStamp = ltd.toString().replace(':','-');
		System.setProperty("Webdriver.chrome.driver","./Drives/chromedriver.exe");
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.facebook.com/");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File tempFile = ts.getScreenshotAs(OutputType.FILE);
//		System.out.println(tempFile.getAbsolutePath());
//		Thread.sleep(90000);
 		File destFile = new File("./image/pune2.png"+timeStamp+".png"); 
		//tempFile.renameTo(destFile);
		FileUtils.copyFile(tempFile, destFile);
		
		
		

	}
}

