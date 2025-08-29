package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLeadAssignment {

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
		account.findElement(By.partialLinkText("Find Leads")).click();
		account.findElement(By.partialLinkText("Phone")).click();
		Thread.sleep(1000);
		account.findElement(By.name("phoneNumber")).sendKeys("667788");
		account.findElement(By.partialLinkText("Find Leads")).click();
		Thread.sleep(2000);
		// WebElement num = account.findElement(By.xpath("//a[@id='ext-gen942']"));
		String num = account.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"))
				.getText();
		System.out.println("First ID is " + num);
		account.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
		account.findElement(By.partialLinkText("Delete")).click();
		Thread.sleep(2000);
		account.findElement(By.partialLinkText("Find Leads")).click();
		account.findElement(By.xpath("//input[@name='id']")).sendKeys(num);
		System.out.println(num);
		Thread.sleep(1000);
		account.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String texting = account.findElement(By.xpath("//div[contains(text(),'display')]")).getText();
		System.out.println("text is" +texting);
		String text1 = "No records to display";
		if (texting.contains(text1))
			System.out.println("Deleted successfully");

		account.close();

	}

}
