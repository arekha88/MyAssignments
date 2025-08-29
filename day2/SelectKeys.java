package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectKeys {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver accounts = new ChromeDriver();
		accounts.get("http://leaftaps.com/opentaps/");
		accounts.manage().window().maximize();
		accounts.findElement(By.name("USERNAME")).sendKeys("demosalesmanager");
		accounts.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		accounts.findElement(By.className("decorativeSubmit")).click();
		accounts.findElement(By.partialLinkText("CRM")).click();
		Thread.sleep(6000);
		accounts.findElement(By.linkText("Leads")).click();
		accounts.findElement(By.linkText("Create Lead")).click();
		accounts.findElement(By.id("createLeadForm_companyName")).sendKeys("COLES");
		accounts.findElement(By.id("createLeadForm_firstName")).sendKeys("Sasirekha");
		accounts.findElement(By.id("createLeadForm_lastName")).sendKeys("A");
		WebElement selector = accounts.findElement(By.id("createLeadForm_dataSourceId"));
		Select sel = new Select(selector);
		sel.selectByIndex(4);
		WebElement selector1 = accounts.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sel1 = new Select(selector1);
		sel1.selectByVisibleText("Automobile");	
		WebElement selector2 = accounts.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select sel2 = new Select(selector2);
		sel2.selectByValue("OWN_SCORP");
		accounts.findElement(By.name("submitButton")).click();
		String pagetitle = accounts.getTitle();
		System.out.println("Page title is" + pagetitle);
		accounts.close();
			
	}

}
