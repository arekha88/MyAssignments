package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOnCreateAccount {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver accountdriver = new ChromeDriver();
		accountdriver.get("http://leaftaps.com/opentaps/");
		accountdriver.manage().window().maximize();
		accountdriver.findElement(By.name("USERNAME")).sendKeys("demosalesmanager");
		accountdriver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		accountdriver.findElement(By.className("decorativeSubmit")).click();
		accountdriver.findElement(By.partialLinkText("CRM")).click();
		Thread.sleep(6000);
		accountdriver.findElement(By.partialLinkText("Accounts")).click();
		accountdriver.findElement(By.partialLinkText("Create Account")).click();
		accountdriver.findElement(By.id("accountName")).sendKeys("Sasi13");
		accountdriver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		accountdriver.findElement(By.xpath("//select[@name='industryEnumId']")).sendKeys("IND_SOFTWARE");
		WebElement Sel1 = accountdriver.findElement(By.name("ownershipEnumId"));
		Select Selector1 = new Select(Sel1);
		Selector1.selectByVisibleText("S-Corporation");
		WebElement Sel2 = accountdriver.findElement(By.id("dataSourceId"));
		Select Selector2 = new Select(Sel2);
		Selector2.selectByValue("LEAD_EMPLOYEE");
		WebElement Sel3 = accountdriver.findElement(By.name("marketingCampaignId"));
		Select Selector3 = new Select(Sel3);
		Selector3.selectByIndex(6);
		WebElement Sel4 = accountdriver.findElement(By.name("generalStateProvinceGeoId"));
		Select Selector4 = new Select(Sel4);
		Selector4.selectByValue("TX");
		accountdriver.findElement(By.className("smallSubmit")).click();
	//	String AccountName = accountdriver.findElement(By.name("accountName"));
		

	}

}
