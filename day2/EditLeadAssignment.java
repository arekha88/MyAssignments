package week2.day2;

import java.nio.channels.Selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLeadAssignment {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver account = new ChromeDriver(options);
		account.get("http://leaftaps.com/opentaps/");
		account.manage().window().maximize();
		account.findElement(By.name("USERNAME")).sendKeys("demosalesmanager");
		account.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		account.findElement(By.className("decorativeSubmit")).click();
		account.findElement(By.partialLinkText("CRM")).click();
		Thread.sleep(6000);
		account.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		Thread.sleep(3000);
		account.findElement(By.partialLinkText("Create Lead")).click();
		account.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Wipro");
		account.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Rekha");
		account.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Anbazhagan");
		account.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("Sasi");
		account.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Sales");
		account.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("For reference");
		account.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("arekha88@gmail.com");
		WebElement Selector = account.findElement(By.name("generalStateProvinceGeoId"));
		Select Sel = new Select(Selector);
		Sel.selectByVisibleText("New York");
		account.findElement(By.xpath("//input[@name='submitButton']")).click();
		account.findElement(By.partialLinkText("Edit")).click();
		account.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		account.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Important");
		account.findElement(By.xpath("//input[@value='Update']")).click();
		String Title = account.getTitle();
		System.out.println("Title is " + Title);
		account.close();

	}

}


//EDIT LEAD XPATH