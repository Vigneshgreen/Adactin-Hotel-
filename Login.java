package org.ddemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClass {
	
 public Login() {
	 PageFactory.initElements( driver, this);
 }
 @FindBy(id="username")
 private WebElement username;
 
 @FindBy(id="password")
 private WebElement password;
 
 @FindBy(id="login")
 private WebElement login_Button;
 
 
public WebElement getUsername() {
	return username;
}
public WebElement getPassword() {
	return password;
}
public WebElement getLogin_Button() {
	return login_Button;
}
 
 
 
}
