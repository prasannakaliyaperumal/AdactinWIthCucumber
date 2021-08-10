package com.stepdefinition;

import org.base.LibGlobal;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class Hooks extends LibGlobal {
	
	WebDriver driver;
	
	@After
    public void screenshot(Scenario sc) {
		if(sc.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
			sc.embed(screenshotAs, sc.getName()+"png");
		}
		
	}

}
