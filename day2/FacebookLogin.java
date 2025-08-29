package week2.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver account = new ChromeDriver(options);
		account.get("https://en-gb.facebook.com/");
		account.manage().window().maximize();
		account.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		account.findElement(By.xpath("//a[text()='Create new account']")).click();
		account.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Rekha");
		account.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Anbazhagan");
		account.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("arekha88@gmail.com");
		account.findElement(By.xpath("//input[@type='password']")).sendKeys("Rekha1234$");
		WebElement Sel1 = account.findElement(By.name("birthday_day"));
		Select Selector = new Select(Sel1);
		Selector.selectByValue("3");
		WebElement Sel2 = account.findElement(By.name("birthday_month"));
		Select Selector1 = new Select(Sel2);
		Selector1.selectByIndex(7);
		WebElement Sel3 = account.findElement(By.name("birthday_year"));
		Select Selector3 = new Select(Sel3);
		Selector3.selectByVisibleText("2017");
		account.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
//		radioButton.sendKeys("Female");

	}

}
