package org.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hdfc {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://netbanking.hdfcbank.com/");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@class='form-control text-muted']")).sendKeys("123456");
		driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
driver.findElement(By.id("fldPasswordDispId")).sendKeys("0023");
driver.findElement(By.id("chksecmod")).click();
String text = driver.findElement(By.className("hdfcwelcmetxt")).getText();
System.out.println(text);
	}

}
