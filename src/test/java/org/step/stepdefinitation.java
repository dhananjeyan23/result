package org.step;

import org.junit.validator.PublicClassValidator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefinitation {

WebDriver driver;
@Given("User Have To Launch The Facebook Application Through Chrome Browser")
public void user_Have_To_Launch_The_Facebook_Application_Through_Chrome_Browser() {
	 driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
}

@Given("User Have To Maximize The Window")
public void user_Have_To_Maximize_The_Window() {
	driver.manage().window().maximize();
}

@When("User Have To Enter Valid UserName and Invalid Password")
public void user_Have_To_Enter_Valid_UserName_and_Invalid_Password() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(By.id("email")).sendKeys("psdjeyan@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("1234567");
}

@When("User Have To Click The Login Button")
public void user_Have_To_Click_The_Login_Button() throws InterruptedException {
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[contains( text(),'Log in')]")).click();;
}

@Then("User Have To Close The Browser")
public void user_Have_To_Close_The_Browser() throws InterruptedException {
	//Thread.sleep(3000);
   // driver.quit();
}


}

