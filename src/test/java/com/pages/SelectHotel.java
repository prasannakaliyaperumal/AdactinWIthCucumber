package com.pages;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends LibGlobal {
	
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	private WebElement sltBtn;

	@FindBy(id = "continue")
	private WebElement sltBTn;

	public WebElement getSltBtn() {
		return sltBtn;
	}

	public WebElement getSltBTn() {
		return sltBTn;
	}

	public void select() {
		click(sltBtn);
		click(sltBTn);
	}


}
