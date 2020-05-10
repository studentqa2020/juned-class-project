package com.login.automation.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


class Testing {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcasting polymorphism
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		System.out.println(driver.getTitle());//Home page
	
		WebElement signBtn = driver.findElement(By.xpath("// *[@class='login']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver; // type casting polymorphism
		js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');", signBtn);
		
		signBtn.click();
		System.out.println(driver.getTitle());//Login page
	}
}
