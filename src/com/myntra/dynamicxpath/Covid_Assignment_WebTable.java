package com.myntra.dynamicxpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Covid_Assignment_WebTable {
	static int population_index;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mohammad\\eclipse-workspace\\Myntra\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.worldometers.info/coronavirus/");
		
//		List<WebElement> Country_List = driver.findElements(By.xpath("//table[1]/tbody[1]/tr/td[2]"));
//		for (int i = 0; i < Country_List.size(); i++) {
//			String Countrytext = Country_List.get(i).getText();
//			System.out.println(Countrytext);
//		}
//		List<WebElement> tablehead = driver.findElements(By.xpath("//table[1]/thead/tr/th"));
//		for (int i = 0; i < tablehead.size(); i++) {
//			String headertext = tablehead.get(i).getText();
//			if (headertext.equalsIgnoreCase("Population")) {
//				population_index =i;
//			}
//			
//		}
//		
//		List<WebElement> allrows = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[1]/tr"));
//		
//		for (int i = 0; i < allrows.size(); i++) {
//			List<WebElement> alldata = allrows.get(i).findElements(By.tagName("td"));
//			for (int j = 0; j < alldata.size(); j++) {
//				if (alldata.get(j).getText().equalsIgnoreCase("India")) {
//			System.out.println("The totl population: " + alldata.get(population_index).getText());
//			
//				
//				
//				}
//				}
//			}
		
		
		
		
		
//		List<WebElement> India_data = driver.findElements(By.xpath("//table[1]/tbody[1]/tr[7]/td"));
//		for (int i = 0; i < India_data.size(); i++) {
//			String india_text_data = India_data.get(i).getText();
//			System.out.println(india_text_data);
//		}
		
		
		
		
		List<WebElement> all_data = driver.findElements(By.xpath("//table[1]/tbody[1]/tr/td"));
		for (int i = 0; i < all_data.size(); i++) {
			String table_data = all_data.get(i).getText();
			System.out.println(table_data);
		}
		
		
		
	}

}
