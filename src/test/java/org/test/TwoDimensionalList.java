package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TwoDimensionalList {
	static WebDriver driver;
	@Given("User should b in home page and click the add customer")
	public void user_should_b_in_home_page_and_click_the_add_customer() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Greens-11\\Desktop\\Sabari\\Cucumber\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/index.html");
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	   
	}

	@When("user should enters the details and click submit")
	public void user_should_enters_the_details_and_click_submit(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> twolist = dataTable.asLists(String.class);
	    driver.findElement(By.xpath("//label[text()='Done']")).click();
	    driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(twolist.get(1).get(0));
	    driver.findElement(By.xpath("//input[@id='lname']")).sendKeys(twolist.get(1).get(1));
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(twolist.get(1).get(2));
	    driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(twolist.get(1).get(3));
	    driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys(twolist.get(1).get(4));
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	}

	@Then("User verify  customer ID")
	public void user_verify_customer_ID() {
		String s = driver.getCurrentUrl();
		if(s.contains("uid")) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		}
	}




