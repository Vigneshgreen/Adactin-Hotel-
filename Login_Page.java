package org.adactin;

import java.io.IOException;

import org.ddemo.BaseClass;
import org.ddemo.Login;
import org.manage.PageManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Page extends BaseClass {

	public static void main(String[] args) throws IOException {
		String path= "C:\\Users\\vigne\\eclipse-workspace\\Letcode\\src\\test\\resources\\Testdata\\Untitled spreadsheet (1).xlsx";
		
		launchChromeBrowser();
		windowMax();
		passUrl("https://adactinhotelapp.com/");
		Implicit_Waits();
		
		PageManager page=new PageManager();
		Login login= new Login();
		
		//Login Page
		WebElement username = login.getUsername();
	    String excelData = excelData(path, "Sheet1", 0, 0);
		enterText(username, excelData);
		
		WebElement password=login.getPassword();
		String passdata = excelData(path, "sheet1", 0, 1);
		enterText(password, passdata);
		
		WebElement login_Button = login.getLogin_Button();
		elementClick(login_Button);
		
		//Select Loaction
		PageManager pages=new PageManager();
		Welcome_Page wel=new Welcome_Page();
		WebElement sydney2 = wel.getSydney();
	    elementClick(sydney2);
	    WebElement room = wel.getRoom();
	    elementClick(room);
	    WebElement webElement = wel.getSubmit();
		elementClick(webElement);
		
		//Select Hotel
		WebElement stelect_Hotel = wel.getStelect_Hotel();
		elementClick(stelect_Hotel);
		WebElement continue_Btn = wel.getContinue_Btn();
		elementClick(continue_Btn);
		
		//Enter Details
		WebElement name = wel.getName();
		String ename = excelData(path, "sheet1", 0, 2);
		enterText(name, ename);
		
		WebElement last_Name = wel.getLast_Name();
		String lname = excelData(path, "sheet1", 0, 3);
		enterText(last_Name, lname);
		
		WebElement address = wel.getAddress();
		String addr = excelData(path, "sheet1", 0, 4);
		enterText(address, addr);
		
		WebElement card_No = wel.getCard_No();
		String cardno = excelData(path, "sheet1", 0, 5);
		enterText(card_No, cardno);
		
		WebElement card_Type = wel.getCard_Type();
		elementClick(card_Type);
		
		WebElement select_Month = wel.getSelect_Month();
		elementClick(select_Month);
		
		WebElement select_Year = wel.getSelect_Year();
		elementClick(select_Year);
		
		WebElement enter_Cno = wel.getEnter_Cno();
		String cvv = excelData(path, "sheet1", 0, 6);
		enterText(enter_Cno, cvv);
		
		WebElement book_now = wel.getBook_Now();
		elementClick(book_now);
		
		
		System.out.println("Booking Successful");
		
		
		
		
		
		
		}

}
