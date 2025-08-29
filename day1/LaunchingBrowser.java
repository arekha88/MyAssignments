package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		//driver.wait(1);
		String title=driver.getTitle();
		System.out.println("tile is " + title);
		driver.close();
		driver.quit();

	}

}
