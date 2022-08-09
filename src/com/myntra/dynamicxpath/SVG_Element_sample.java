package com.myntra.dynamicxpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVG_Element_sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mohammad\\eclipse-workspace\\Myntra\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.heroku.com/");
		List<WebElement> svg_tag_test = driver.findElements(By.xpath("//div[@class='features-standard']//*[name() = 'svg']//following::li/h4"));
		
		for (int i = 0; i < svg_tag_test.size() ; i++) {
			String text = svg_tag_test.get(i).getText();
			System.out.println(text);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
