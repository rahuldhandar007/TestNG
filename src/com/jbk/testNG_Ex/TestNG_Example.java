package com.jbk.testNG_Ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Example {
	@Test
	public void verify_log_inTitle() {
      System.setProperty("webdriver.chrome.driver", "//D:chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("file:///C:/adv%20java%20setup/Selenium%20Software/Offline%20Website/index.html");
	  driver.manage().window().maximize();
	  System.out.println(driver.getTitle());
	  String actualTitle = driver.getTitle();
	  String expectedTitle = "JavaByKiran | Log in";
	  Assert.assertEquals(actualTitle, expectedTitle);
	  }
	
	@Test
	public void Log_in_Test() {
	      System.setProperty("webdriver.chrome.driver", "//D:chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("file:///C:/adv%20java%20setup/Selenium%20Software/Offline%20Website/index.html");
		  driver.manage().window().maximize();
          driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	      driver.findElement(By.id("password")).sendKeys("123456");
	      driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
	      
	      String actualText = driver.findElement(By.tagName("small")).getText();
	      String expectedText = "Courses Offered";
	      Assert.assertEquals(actualText, expectedText);
	      }
	 
	@Test
	public void Verify_logo() {
	      System.setProperty("webdriver.chrome.driver", "//D:chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("file:///C:/adv%20java%20setup/Selenium%20Software/Offline%20Website/index.html");
		  driver.manage().window().maximize();
	      
		  WebElement logo = driver.findElement(By.tagName("img"));
		  boolean flag = logo.isDisplayed();
		  Assert.assertEquals(flag, true);
	}
}
