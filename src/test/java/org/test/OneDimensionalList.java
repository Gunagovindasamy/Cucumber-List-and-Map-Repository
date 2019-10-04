package org.test;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class OneDimensionalList {
	static WebDriver driver;
	@Given("User in home page and click the add customer button")
	public void user_in_home_page_and_click_the_add_customer_button() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Greens-11\\Desktop\\Sabari\\Cucumber\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/index.html");
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	   
	}

	@When("user enters the details and click the submit button")
	public void user_enters_the_details_and_click_the_submit_button(io.cucumber.datatable.DataTable dataTable) {
		List<String> list = dataTable.asList(String.class);
	    driver.findElement(By.xpath("//label[text()='Done']")).click();
	    driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(list.get(0));
	    driver.findElement(By.xpath("//input[@id='lname']")).sendKeys(list.get(1));
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(list.get(2));
	    driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(list.get(3));
	    driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys(list.get(4));
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	}

	@Then("User verify the customer ID")
	public void user_verify_the_customer_ID() {
		String s = driver.getCurrentUrl();
		if(s.contains("uid")) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		}
	}




