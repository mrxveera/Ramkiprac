package org.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Ram");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("M");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Tambaram");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ramki.m1994@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9840611837");
		driver.findElement(By.name("radiooptions")).click();
		List<WebElement> li = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (int i = 0; i < li.size(); i++) {
			li.get(i).click();
		}
		WebElement langs = driver.findElement(By.id("msdd"));
		langs.click();
		List<WebElement> li1 = driver.findElements(By.xpath("//a[@class='ui-corner-all']"));
		for (int i = 0; i < li1.size(); i++) {
			li1.get(i).click();
		}
		WebElement skills = driver.findElement(By.id("Skills"));
		//skills.click();
		Select s = new Select(skills);
		s.selectByIndex(4);
		driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")).click();
		driver.findElement(By.xpath("//li[text()='India']")).click();
		WebElement year = driver.findElement(By.id("yearbox"));
		Select s1 = new Select(year);
		s1.selectByValue("1994");
		WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select s2 = new Select(month);
		s2.selectByValue("March");
		WebElement day = driver.findElement(By.id("daybox"));
		Select s3 = new Select(day);
		s3.selectByValue("1");
		

	}

}
