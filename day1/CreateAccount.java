package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver account = new ChromeDriver();
		account.get("http://leaftaps.com/opentaps/");
		account.manage().window().maximize();
		account.findElement(By.name("USERNAME")).sendKeys("demosalesmanager");
		account.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		account.findElement(By.className("decorativeSubmit")).click();
		account.findElement(By.partialLinkText("CRM")).click();
		Thread.sleep(6000);
		account.findElement(By.partialLinkText("Accounts")).click();
		account.findElement(By.partialLinkText("Create Account")).click();
		account.findElement(By.id("accountName")).sendKeys("Sasi12");
		account.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		account.findElement(By.id("numberEmployees")).sendKeys("5");		
		account.findElement(By.name("officeSiteName")).sendKeys("LeafTaps");
		account.findElement(By.className("smallSubmit")).click();
		String title = account.getTitle();
		Thread.sleep(5000);
		System.out.println("Title is " + title);
		account.close();

	}

}
