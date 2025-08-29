package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {

		ChromeDriver drivervalue = new ChromeDriver();
		drivervalue.get("https://www.facebook.com/");
		drivervalue.manage().window().maximize();
		drivervalue.findElement(By.xpath("//input[@type='text']")).sendKeys("testleaf.2023@gmail.com");
		//drivervalue.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		drivervalue.findElement(By.xpath("//input[@type='password']")).sendKeys("Tuna@321");
		//drivervalue.findElement(By.name("pass")).sendKeys("Tuna@321");
		//drivervalue.findElement(By.name("login")).click();
		drivervalue.findElements(By.xpath("//button[contains(@type,'submit')]"));
		String titlevalue = drivervalue.getTitle();
		System.out.println("Browser title value is " + titlevalue);
		drivervalue.close();

	}

}
