package com.pages;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends LibGlobal {
	
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement sltLocation;

	@FindBy(id = "hotels")
	private WebElement sltHotels;

	@FindBy(id = "room_type")
	private WebElement sltRoomType;

	@FindBy(id = "room_nos")
	private WebElement sltRoomNo;

	@FindBy(id = "adult_room")
	private WebElement sltAdults;

	@FindBy(id = "child_room")
	private WebElement sltChild;

	@FindBy(id = "Submit")
	private WebElement btnClick;

	public WebElement getSltLocation() {
		return sltLocation;
	}

	public WebElement getSltHotels() {
		return sltHotels;
	}

	public WebElement getSltRoomType() {
		return sltRoomType;
	}

	public WebElement getSltRoomNo() {
		return sltRoomNo;
	}

	public WebElement getSltAdults() {
		return sltAdults;
	}

	public WebElement getSltChild() {
		return sltChild;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}

	public void search(String location, String hotels, String roomtype, String roomNo, String adult, String child) {
		selectByVisibleText(sltLocation, location);
		selectByVisibleText(sltHotels, hotels);
		selectByVisibleText(sltRoomType, roomtype);
		selectByVisibleText(sltRoomNo, roomNo);
		selectByVisibleText(sltAdults, adult);
		selectByVisibleText(sltChild, child);
		click(btnClick);

	}


}
