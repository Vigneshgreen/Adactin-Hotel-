package org.manage;

import org.adactin.Welcome_Page;
import org.ddemo.Login;

public class PageManager {
	
	private Login log;

	public Login getLog() {
		if (log==null) {
			log=new Login();
		}
		
		return log;
	}
	
	private Welcome_Page welcome;

	public Welcome_Page getWelcome_Page() {
		if (welcome==null) {
			welcome=new Welcome_Page();
		}
		
		return welcome;
	}

	
	

}
