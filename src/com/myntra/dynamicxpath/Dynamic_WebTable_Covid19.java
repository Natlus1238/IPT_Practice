package com.myntra.dynamicxpath;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_WebTable_Covid19 {
	static int IndexofTotal, indexofdeaths, indexofrecovered,indexofcountry; 
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mohammad\\eclipse-workspace\\Myntra\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.worldometers.info/coronavirus/");
		List<WebElement> tablehead = driver.findElements(By.xpath("//table[1]/thead/tr/th"));
		for (int i = 0; i < tablehead.size(); i++) {
			String headerrows = tablehead.get(i).getText().replaceAll("\n", "");
			
			System.out.println(headerrows);
			
			if (headerrows.equalsIgnoreCase("TotalCases")) {
				IndexofTotal = i;
				System.out.println("Total Cases: " + IndexofTotal);
			}
			else if (headerrows.equalsIgnoreCase("TotalDeaths")) {
				indexofdeaths = i;
				System.out.println("Totaldeaths: " + indexofdeaths);
			}
			else if (headerrows.equalsIgnoreCase("Totalrecovered")) {
				indexofrecovered =i;
				System.out.println("Total Recovered:" + indexofrecovered);

			}
		}
			
			
			List<WebElement> allrows = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[1]/tr"));
			
			for (int i = 0; i < allrows.size(); i++) {
				List<WebElement> alldata = allrows.get(i).findElements(By.tagName("td"));
				for (int j = 0; j < alldata.size(); j++) {
					if (alldata.get(j).getText().equalsIgnoreCase("Brazil")) {
				System.out.println("The total cases: " + alldata.get(IndexofTotal).getText());
				System.out.println("The total deaths: " + alldata.get(indexofdeaths).getText());
				System.out.println("The total recovered: " + alldata.get(indexofrecovered).getText());
	

				}
				}
				
				
			}
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
	}

