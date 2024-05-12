package com.checkradio;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkradio {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thasleem\\Downloads\\chromedriverwin\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='Checkboxradio']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//fieldset[1]/label"));
		driver.findElement(By.xpath("//label[normalize-space()='Paris']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//fieldset[2]"));
		driver.findElement(By.xpath("//label[normalize-space()='4 Star']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//fieldset[3]"));
		driver.findElement(By.xpath("//label[normalize-space()='2 Queen']")).click();
		Thread.sleep(3000);

	}

}
