package org.test;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TwoDimensionalMap {
	static WebDriver driver;
	@Given("User should be in the home page and click the add customer")
	public void user_should_be_in_the_home_page_and_click_the_add_customer() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Greens-11\\Desktop\\Sabari\\Cucumber\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/index.html");
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}

	@When("user should enter the details and click submit button")
	public void user_should_enter_the_details_and_click_submit_button(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> twomap = dataTable.asMaps();
		driver.findElement(By.xpath("//label[text()='Done']")).click();
	    driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(twomap.get(1).get("firtname"));
	    driver.findElement(By.xpath("//input[@id='lname']")).sendKeys(twomap.get(1).get("lastname"));
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(twomap.get(1).get("Email"));
	    driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(twomap.get(1).get("address"));
	    driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys(twomap.get(1).get("mobileno"));
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("User should verifies  customer ID")
	public void user_should_verifies_customer_ID() {
		String s = driver.getCurrentUrl();
		if(s.contains("uid")) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
	}

}
