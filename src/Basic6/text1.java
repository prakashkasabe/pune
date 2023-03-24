package Basic6;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class text1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
	    String actualurl = driver.getCurrentUrl();
	    System.out.println(actualurl);
	   String actualwindowhandle = driver.getWindowHandle();
	   System.out.println(actualwindowhandle);
	   
	   Set<String> allid = driver.getWindowHandles();
	   System.out.println(allid);
	   driver.quit();
       driver.manage().window().maximize();
       driver.manage().window().minimize();
       driver.manage().window().fullscreen();
	}

} 
