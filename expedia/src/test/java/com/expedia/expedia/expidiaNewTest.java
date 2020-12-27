package com.expedia.expedia;

import org.testng.annotations.Test;

import expediapages.Expidia_home_page;
import expediapages.booking_page;
import expediapages.checkout_page;
import expediapages.departureSearch_page;
import expediapages.returningSearch_page;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class expidiaNewTest  extends browsers_codes{
	
	
	
  @Test
  public void f1() throws InterruptedException {
	 
	  Expidia_home_page Ehp=new Expidia_home_page(driver);
	  	Ehp.filght_Button();
	  	Ehp.aroundTrip_Button();
	   
	  	Ehp.departure();
	    Ehp.departure_sen();
	    Ehp.departure_link();
	   
	
	    Ehp.destination();
	    Ehp.destination_sen();
	    Ehp.destination_link();
	    Ehp.search_Button();
	    
	    departureSearch_page dsp=new departureSearch_page(driver);
	    dsp.departure_price();
	    dsp.continueButton();
	    
	    returningSearch_page rsp =new returningSearch_page(driver);
	    rsp.retuning_price();
	    rsp.continueButton2();
	    
	    checkout_page cp=new checkout_page(driver);
	    
	    		cp.checkout();
	  
	  		booking_page bp =new booking_page(driver);
	    		bp.booking();
	  
	  
  }
 
}
	
