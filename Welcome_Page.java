package org.adactin;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.ddemo.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Welcome_Page extends BaseClass {
	
	public Welcome_Page() {
		 PageFactory.initElements(driver,this);
	}
	
	
	
	@FindBy(xpath="//option[text()='Sydney']")
	private WebElement sydney;
	
	@FindBy(xpath="//option[text()='Hotel Creek']")
	private WebElement hotel;
	
	@FindBy(xpath="//option[text()='Super Deluxe']")
	private WebElement room;
	
	@FindBy(id="radiobutton_4")
	private WebElement select_Hotel;
	
	@FindBy(id="continue")
	private WebElement continue_Btn;
	
	@FindBy(id="Submit")
	private WebElement submit;
	
	@FindBy(id="first_name")
	private WebElement first_Name;
	
	@FindBy(name="last_name")
	private WebElement last_Name;
	
	@FindBy(name="address")
	private WebElement address;
	
	@FindBy(name="cc_num")
	private WebElement card_No;
	
	@FindBy(xpath="//option[text()='VISA']")
	private WebElement card_Type;
	
	@FindBy(xpath="//option[text()='February']")
	private WebElement select_Month;
	
	@FindBy(xpath="//option[text()='2029']")
	private WebElement select_Year;
	
	@FindBy(name="cc_cvv")
	private WebElement enter_Cno;
	
	@FindBy(id="book_now")
	private WebElement book_Now;
	
	@FindBy(name="order_no")
	private WebElement order_Id;
	
	public WebElement getOrder_id() {
		return order_Id;
	}
	
	public WebElement getLast_Name() {
		return last_Name;
	}
	
	public WebElement getAddress() {
		return address;
	}
	
	public WebElement getCard_No() {
		return card_No;
	}
	
	public WebElement getCard_Type() {
		return card_Type;
	}
	
	public WebElement getSelect_Month() {
		return select_Month;
	}
	
	public WebElement getSelect_Year() {
		return select_Year;
	}
	
	public WebElement getEnter_Cno() {
		return enter_Cno;
	}
	
	public WebElement getBook_Now() {
		return book_Now;
	}
	
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getContinue_Btn() {
		return continue_Btn;
	}
	public WebElement getStelect_Hotel() {
		return select_Hotel;
	}
	
	
	public WebElement getRoom() {
		return room;
	}
	public WebElement getName() {
		return first_Name;
	}
	public WebElement getSubmit() {
		return submit;
	}
	public WebElement getSydney() {
		return sydney;

	}
	}

	
	




	
	

	
	
	


