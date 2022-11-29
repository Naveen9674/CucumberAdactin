package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.Runner_Adactin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition_Adactin {
	
	 public static WebDriver driver = Runner_Adactin.driver;

	
	@Given("^user Launch The Adactin Application$")
	public void user_Launch_The_Adactin_Application() throws Throwable {
	    driver.get("https://adactinhotelapp.com/");

	}

	@When("^user Enter the Username In Username Field$")
	public void user_Enter_the_Username_In_Username_Field() throws Throwable {
		WebElement userid = driver.findElement(By.xpath("//input[@type='text']"));
	    userid.sendKeys("thalapathyhari");
	}

	@When("^user Enter the Password In Password Field$")
	public void user_Enter_the_Password_In_Password_Field() throws Throwable {
		 WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		    password.sendKeys("123456789");
	}

	@Then("^user Click The Login Button And It Navigates To Search Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {
	    driver.findElement(By.xpath("//input[@type='Submit']")).click();
	}

	@When("^user Select The Location$")
	public void user_Select_The_Location() throws Throwable {
       WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		
		Select sel =new Select(location);
		
		sel.selectByIndex(2);	}

	@Given("^user Select The Hotels$")
	public void user_Select_The_Hotels() throws Throwable {
       WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
		
		Select s1 = new Select(hotel);
		
		s1.selectByValue("Hotel Creek");
	}

	@When("^user Select The Room Type$")
	public void user_Select_The_Room_Type() throws Throwable {
        WebElement roomtype = driver.findElement(By.xpath("//select[@name='room_type']"));
		
		Select s2 = new Select(roomtype);
		
		s2.selectByIndex(3);	
		}

	@When("^user Select The Number Of Rooms$")
	public void user_Select_The_Number_Of_Rooms() throws Throwable {
		WebElement norooms = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select s3 = new Select(norooms);
		s3.selectByIndex(4);
	}

	@When("^user Select The Check In Date$")
	public void user_Select_The_Check_In_Date() throws Throwable {
		WebElement checkin = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		checkin.clear();
		checkin.sendKeys("27/11/2022");
	}

	@When("^user Select The Check Out Date$")
	public void user_Select_The_Check_Out_Date() throws Throwable {
		WebElement checkout = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		checkout.clear();
		checkout.sendKeys("29/11/2022");


	}

	@When("^user Select The Adult Per Room$")
	public void user_Select_The_Adult_Per_Room() throws Throwable {
		WebElement adultroom = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select s4 = new Select(adultroom);
		s4.selectByIndex(3);
	}

	@When("^user Select The Children Per Room$")
	public void user_Select_The_Children_Per_Room() throws Throwable {
		WebElement childroom = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select s5 = new Select(childroom);
		s5.selectByIndex(3);

	}

	@Then("^user Click The Search Button And It Navigate To Select Hotel Page$")
	public void user_Click_The_Search_Button_And_It_Navigate_To_Select_Hotel_Page() throws Throwable {
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

	@When("^user Select The Hotel$")
	public void user_Select_The_Hotel() throws Throwable {
		driver.findElement(By.id("radiobutton_0")).click();

	}

	@When("^user Click The Continue Button And Navigate To Book Hotel Page$")
	public void user_Click_The_Continue_Button_And_Navigate_To_Book_Hotel_Page() throws Throwable {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	}

	@When("^user Enter The First Name$")
	public void user_Enter_The_First_Name() throws Throwable {
		WebElement fname = driver.findElement(By.xpath("//input[@name='first_name']"));
        fname.sendKeys("Naveen");
	}

	@When("^user Enter The Last Name$")
	public void user_Enter_The_Last_Name() throws Throwable {
		 WebElement lname = driver.findElement(By.xpath("//input[@name='last_name']"));
	        lname.sendKeys("Kumar");
	}

	@When("^user Enter The Billing Address$")
	public void user_Enter_The_Billing_Address() throws Throwable {
		 WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
	        address.sendKeys("chennai");
	}

	@When("^user Enter The Credit Card Number$")
	public void user_Enter_The_Credit_Card_Number() throws Throwable {
		WebElement ccno = driver.findElement(By.xpath("//input[@name='cc_num']"));
        ccno.sendKeys("1234567891234567");
  
	}

	@When("^user Enter The Credit Card Type$")
	public void user_Enter_The_Credit_Card_Type() throws Throwable {
		  WebElement cctype = driver.findElement(By.xpath("//select[@name='cc_type']"));
	        Select type1= new Select(cctype);
	        type1.selectByIndex(1);
	}

	@When("^user Enter The Expiry Date$")
	public void user_Enter_The_Expiry_Date() throws Throwable {
		 WebElement xmdate = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
	        Select type2 = new Select(xmdate);
	        type2.selectByValue("11");
	        
	        WebElement xydate = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
	        Select type3 = new Select(xydate);
	        type3.selectByValue("2022");
	}

	@When("^user Enter The CVV Number$")
	public void user_Enter_The_CVV_Number() throws Throwable {
        WebElement cvvnum = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
        cvvnum.sendKeys("354");

	}

	@Then("^user Click The Book Now Button And Navigate To Booking Confirmation Page$")
	public void user_Click_The_Book_Now_Button_And_Navigate_To_Booking_Confirmation_Page() throws Throwable {
        driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();

	}

	@Then("^user Click The Logout Buttom$")
	public void user_Click_The_Logout_Buttom() throws Throwable {
		JavascriptExecutor yt =(JavascriptExecutor) driver;
        Thread.sleep(10000);
        
       WebElement myt = driver.findElement(By.xpath("//input[@value='My Itinerary']"));
       yt.executeScript("arguments[0].scrollIntoView();", myt);
       
       myt.click();
       
       driver.findElement(By.xpath("//input[@name='logout']")).click();


	}



}
