package org.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Swiggy {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@class='_381fS _1oTLG _3BIgv']")).sendKeys("Camproad");
List<WebElement> li= driver.findElements(By.xpath("//div[@class='_1oLDb']"));
for (int i = 0; i <li.size(); i++) {
	String text = li.get(i).getText();
	System.out.println(text);
}
	}

}
