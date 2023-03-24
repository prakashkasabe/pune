package Basic6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Prakash6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","./Drives/chromedriver.exe");
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.oracle.com/in/java/technologies/javase/javase8-archive-downloads.html");
		driver.findElement(By.partialLinkText("jdk-8u202-linux-arm32-vfp-hflt.tar.gz")).click();
		Thread.sleep(2000);
	    boolean ele = driver.findElement(By.linkText("Download jdk-8u202-linux-arm32-vfp-hflt.tar.gz")).isEnabled();
		System.out.println(ele);
	}

}

