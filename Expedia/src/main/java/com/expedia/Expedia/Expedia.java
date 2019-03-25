package com.expedia.Expedia;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;



public class Expedia {
	
	WebDriver driver;
	@Test
	public void Expediafirst() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/kavyathandra/Workspace/Libs/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String baseurl = "https://nationwide.co.uk/";
		driver.get(baseurl);
		System.out.println("Nationwide homepage is launched");
	}

}
