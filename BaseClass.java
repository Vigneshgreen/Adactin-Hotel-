package org.ddemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Interaction;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	
		public static FileInputStream fi;
		
		
		public static WebDriver driver;
		 
		 //1
		 public static void launchChromeBrowser() {
		driver=new ChromeDriver();

	}
	 

	 //2
	 public static void launchEdgeBrowser() {
		
         driver=new EdgeDriver();

	}
	 //3
	 public static void launchFirefoxBrowser() {
	
		 driver=new FirefoxDriver();
	 }
	 //4
	 public static void windowMax() {
		 driver.manage().window().maximize();
	 }
	 //5
	 public static void passUrl(String url) {
		driver.get(url);
		
	}
	 //6
	 public static void enterText(org.openqa.selenium.WebElement element,String value) {
		 element.sendKeys(value);
	 }
	 //7
	 public static void elementClick(WebElement element) {
		 element.click();
	 }
	 //8
	 public static String printTitle() {
		 String title = driver.getTitle();
		 return title;
	 }
	 //9
    public static String getPassedValue(WebElement element,String value) {
		String v = element.getAttribute(value);
	   return v;
    }
    //10
    public static void Implicit_Waits() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
    //11
   public static String currentUrl() { 
    String currentUrl = driver.getCurrentUrl();
   return currentUrl;
   }
    //12
   public static void screenShot(String name) {
	   TakesScreenshot ts=(TakesScreenshot)driver;
	   File screenSt = ts.getScreenshotAs(OutputType.FILE);
	   File des=new File("C:\\Users\\vigne\\eclipse-workspace\\Demo\\snapst"+name);
	   try {
		FileUtils.copyFile(screenSt, des);
	} catch (IOException e) {
		e.printStackTrace();
	}
   }
   //13
   public static void close() {
	   driver.close();
   }
   //14
   public static void moveToElement(WebElement element) {
	   org.openqa.selenium.interactions.Actions a=new Actions(driver);
	   a.moveToElement(element).perform();
	  
   }
   //15
   public static void alertCancel() {
	   driver.switchTo().alert().dismiss();
   }
   //16
   public static void alertOkBtn() {
	   driver.switchTo().alert().accept();
   }
   //17
   public static void alertGetText() {
	   driver.switchTo().alert().getText();
   }
   //18
   public static void pageSource() {
	   driver.getPageSource();
   }
   //19
   public static void quit() {
	driver.quit();
}
   //20
   public static void refresh() {
	driver.navigate().refresh();
}
    //21
   public static void back() {
	driver.navigate().back();
}
   //22
   public static void forward() {
	driver.navigate().forward();
}
   //23
   public static void navigateTo(String url) {
	driver.navigate().to(url);
}
   //24
   public static void isdisplayed(WebElement element) {
	element.isDisplayed();
}
   //25
   public static void isEnabled(WebElement element) {
	element.isEnabled();
}
   //26
   public static void isSelected(WebElement element) {
	element.isSelected();
}
   //27
   public static void submit(WebElement element) {
	element.submit();
}
   //28
   public static void tagName(WebElement element) {
	element.getTagName();
}
   //29
   public static void cssValue(WebElement element,String value) {
	element.getCssValue(value);
}
   //30
   public static void size(WebElement element) {
	element.getSize();
}
   //31
  public static void actionClick() {
	Actions a=new Actions(driver);
	a.click().perform();
}
  //32
  public static void doubleClick() {
	Actions a=new Actions(driver);
	a.doubleClick().perform();
}
  //33
  public static void contextClick() {
	Actions a=new Actions(driver);
	a.contextClick().perform();
}
  //34
  public static void build() {
	Actions a=new Actions(driver);
	a.build().perform();
}
  //35
  public static void clickAndHold() {
	Actions a=new Actions(driver);
	a.clickAndHold().perform();
}
   //36
  public static void tick(Interaction value) {
	  Actions a=new Actions(driver);
	  a.tick(value).perform();
}
  //37
  public static void release() {
	Actions a=new Actions(driver);
	a.release().perform();
}
  //38
  public static void driverWait() {
	try {
		driver.wait();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
  //39
  public static void driverNotifyAll() {
	driver.notifyAll();
}
  //40
  public static void driverNotify() {
	driver.notify();
}
  //41
  public static void jsGetClass() {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.getClass();
}
  //42
  public static void jsExecuteScr(String value, Object value1) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript(value, value1);

}
  //43
  public static void javaScriptWait() {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	try {
		js.wait();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
  //44
  public static void pause() {
	Actions a=new Actions(driver);
	a.pause(10);
}
  //45
  public static void hashcode() {
	  driver.hashCode();
  }
  //46
  public static void getLocation(WebElement element) {
	element.getLocation();
}
  //47
  public static void notify(WebElement element) {
	element.notify();
}
  //48
  public static void notifyall(WebElement element) {
	element.notifyAll();
}
  //49
  public static void deselectAll(WebElement element) {
      Select s=new Select(element);
      s.deselectAll();
  }
  //50
  public static void getOptions(WebElement element) {
	Select s=new Select(element);
	s.getOptions();
}
  //51
  public static void getAllSelectedOption(WebElement element) {
	Select s=new Select(element);
	s.getAllSelectedOptions();
}
  //52 
  public static void eqauls(WebElement element, Object obj) {
	Select s=new Select(element);
	s.equals(obj);
}
  //53
  public static void getWrappedEelemnt(WebElement element) {
	Select s=new Select(element);
	s.getWrappedElement();

}
  //54
  public static void selectByVisibleText(WebElement element,String arg) {
	  Select s=new Select(element);
	s.selectByVisibleText(arg);
}
  //55
  public static void selectByIndex(WebElement element,Integer index) {
	  Select s=new Select(element);
	  s.selectByIndex(index);
}
  //56
  public static void electByValue(WebElement element, String value) {
	  Select s=new Select(element);
	  s.selectByValue(value);
}
  //57
  public static void getFirstSelectedOption(WebElement element) {
	  Select s=new Select(element);
	  s.getFirstSelectedOption();
}
  //58
  public static void getAllSelectedOptions(WebElement element) {
	  Select s=new Select(element);
	  s.getAllSelectedOptions();
}
  //59
  public static void getAutoDelay() {
	Robot r;
	try {
		r = new Robot();
		r.getAutoDelay();
	} catch (AWTException e) {
		
		e.printStackTrace();
	}
}
  //60
  public static void mousePress(int buttons) {
	try {
		Robot r=new Robot();
		r.mousePress(buttons);
	} catch (AWTException e) {
		e.printStackTrace();
	}
}
  public static String passDataFromExcel(String name, int rowNo, int cellNo) {
	  
	  File f = new File("\"C:\\\\Users\\\\vigne\\\\eclipse-workspace\\\\Letcode\\\\src\\\\test\\\\resources\\\\Testdata\\\\Untitled spreadsheet (1).xlsx\"");
	  
	  try {
		 fi =new FileInputStream(f);
	} catch (FileNotFoundException e) {}
	 return name;
	  
    }
  
public static String excelData (String path, String sheetName, int rownum, int cellnum)throws IOException {
      File f=new File(path);
      FileInputStream fi=new FileInputStream(f);
      Workbook wb=new XSSFWorkbook(fi);
      Sheet sheet=wb.getSheet(sheetName);
      Row row=sheet.getRow(rownum);
      Cell cell=row.getCell(cellnum);
      String data=null;
      switch (cell.getCellType()) {
	case STRING:
		String scv=cell.getStringCellValue();
		data=scv;
		break;

	case NUMERIC:
	if (DateUtil.isCellDateFormatted(cell)) {
		java.util.Date dcv=cell.getDateCellValue();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		String format=sdf.format(dcv);
		data=format;
		}
	else {
		double d=cell.getNumericCellValue();
		long l=(long)d;
		if (d==1) {
			String string=Long.toString(l);
			data=string;
		} 
		else {
			String string=Double.toString(d);
			data=string;

		}

	}
	}
      

	return data;
	
	
		
	
	
	

	
}

  
  
  
  
  
 }

