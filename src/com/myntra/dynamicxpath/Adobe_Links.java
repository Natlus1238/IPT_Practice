package com.myntra.dynamicxpath;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adobe_Links {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohammad\\eclipse-workspace\\IPT\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.findElement(by.)
//		driver.switchTo().frame(arg0)
		driver.get("https://sites.google.com/view/testurls/valid-urls?authuser=0");
		String parentid = driver.getWindowHandle();
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		for (int i = 0; i < alllinks.size(); i++) {
			String links = alllinks.get(i).getAttribute("href");
			driver.findElement(By.linkText(links)).click();
			System.out.println(driver.getTitle());
			Set<String> childID = driver.getWindowHandles();
//			if (parentid == childID) {
				
			}
			
		}

	}

}
