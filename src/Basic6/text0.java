package Basic6;

import org.openqa.selenium.chrome.ChromeDriver;

public class text0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.actitime.com/");
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
	    String actualurl = driver.getCurrentUrl();
	    System.out.println(actualurl);
	   String ele = driver.getWindowHandle();
	   System.out.println(ele);

	}

}
