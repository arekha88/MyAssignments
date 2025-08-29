package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver account = new ChromeDriver();
		account.get("http://leaftaps.com/opentaps/");
		account.manage().window().maximize();
		account.findElement(By.name("USERNAME")).sendKeys("demosalesmanager");
		account.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		account.findElement(By.className("decorativeSubmit")).click();
		account.findElement(By.partialLinkText("CRM")).click();
		Thread.sleep(6000);
		account.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		Thread.sleep(3000);
		// account.findElement(By.xpath("//a[contains(@id,'ext-gen594')]")).click();
		// account.findElement(By.xpath("//a[@id='ext-gen594']")).click();
		account.findElement(By.partialLinkText("Create Lead")).click();
		account.findElement(By.xpath("(//input[@class='inputBox'])[1]")).sendKeys("Wipro");
		account.findElement(By.id("createLeadForm_firstName")).sendKeys("Vithun");
		account.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Arun kumar");
		account.findElement(By.xpath("//input[@name='generalProfTitle']")).sendKeys("Simple");
		account.findElement(By.xpath("//input[@value='Create Lead']")).click();
		String Title = account.getTitle();
		System.out.println("Title value is " + Title);
		account.close();

	}

}
