//Project was started on March 10, 2021
//It will show the views quantity of videos on Instagram

package core;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Linear {
	static Properties p = new Properties();
	static WebDriver driver;
	static Writer report;
    static String ls = System.getProperty("line.separator");
    
	
	//------------------------------------------------------------   Main_Method  -------------------------------------------------------- //
    

	public static void main(String[] args) throws Exception {
		
		//---------------------------------------------------------   Prerequisites  --------------------------------------------------- //
		
//		Warnings_OFF
		Logger.getLogger("").setLevel(Level.OFF);
		
//		Externalization
		p.load(new FileInputStream("./input.properties"));
		
//		Report into external file
		// to lowerCase
		// we have it set to "false" as we want ".csv" file to override
		report = new FileWriter("./reportFirefox_Linear.csv", false);
		
		String driverPath = "";
		
//		Running on Windows and Mac OS
		if (System.getProperty("os.name").toUpperCase().contains("MAC"))							driverPath = "/usr/local/bin/firefox";
		else if (System.getProperty("os.name").toUpperCase().contains("WINDOWS"))		driverPath = "c:\\windows\\geckodriver.exe";
		else throw new IllegalArgumentException("Unknown OS");
		
//		Driver_path/Warnings_OFF
		System.setProperty("webdriver.gecko.driver", driverPath);
		
//		Driver
		WebDriver driver = new FirefoxDriver();
		
//		implicidWaitTime
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
//		Window size
		driver.manage().window().setSize(new Dimension(1920, 1080));
		
//		ExplicidWaitTime
		//WebDriverWait wait = new WebDriverWait(driver, 15);
		
//		URI
		driver.get(p.getProperty("url"));
		
		//------------------------------------------------------------   Process  --------------------------------------------------- //
		
		/////////////////////////////  "instagram.com" Credentials ////////////////////////////////

		driver.findElement(By.xpath(p.getProperty("id_email"))).sendKeys(p.getProperty("email"));
		driver.findElement(By.xpath(p.getProperty("id_password"))).sendKeys(p.getProperty("password"));
		driver.findElement(By.xpath(p.getProperty("id_LogIn"))).click();
		
		/////////////////////////////  saveInfo ////////////////////////////////
		driver.findElement(By.xpath(p.getProperty("notNow"))).click();
		driver.findElement(By.xpath(p.getProperty("noti"))).click();
		
		/////////////////////////////  FeedPage to Home ////////////////////////////////
		driver.findElement(By.xpath(p.getProperty("avatar"))).click();
		driver.findElement(By.xpath(p.getProperty("profile"))).click();
		driver.findElement(By.xpath(p.getProperty("igtv"))).click();
		
		
		/////////////////////////////  Header ////////////////////////////////
		System.out.println("Instagram_Report:");
				   report.write(",Instagram_Report"); report.write(ls);
	               report.write("#, Name, Views"); report.write(ls);
	               
	    /////////////////////////////  Element #1 ////////////////////////////////
	    driver.findElement(By.xpath(p.getProperty("el_1"))).click();
	       	    System.out.println("01, " + driver.findElement(By.xpath(p.getProperty("name_1"))).getText() + " - " +   driver.findElement(By.xpath(p.getProperty("view_1"))).getText());
		 	               report.write("01, " + driver.findElement(By.xpath(p.getProperty("name_1"))).getText() + ", "  +   driver.findElement(By.xpath(p.getProperty("view_1"))).getText().replace(",", "_")); report.write(ls);
		driver.navigate().back();
		
	    /////////////////////////////  Element #2 ////////////////////////////////
		driver.findElement(By.xpath(p.getProperty("el_2"))).click();
		 	    System.out.println("02, " + driver.findElement(By.xpath(p.getProperty("name_2"))).getText() + " - " +   driver.findElement(By.xpath(p.getProperty("view_2"))).getText());
		 	               report.write("02, " + driver.findElement(By.xpath(p.getProperty("name_2"))).getText() + ", "  +   driver.findElement(By.xpath(p.getProperty("view_2"))).getText().replace(",", "_")); report.write(ls);
		driver.navigate().back();
		 	               
		 	               
		/////////////////////////////  Element #3 ////////////////////////////////
		 driver.findElement(By.xpath(p.getProperty("el_3"))).click();
		 	    System.out.println("03, " + driver.findElement(By.xpath(p.getProperty("name_3"))).getText() + " - " +   driver.findElement(By.xpath(p.getProperty("view_3"))).getText());
		 	               report.write("03, " + driver.findElement(By.xpath(p.getProperty("name_3"))).getText() + ", "  +   driver.findElement(By.xpath(p.getProperty("view_3"))).getText().replace(",", "_")); report.write(ls);
		 driver.navigate().back();
		 
			/////////////////////////////  Element #4 ////////////////////////////////
		 driver.findElement(By.xpath(p.getProperty("el_4"))).click();
		 	    System.out.println("04, " + driver.findElement(By.xpath(p.getProperty("name_4"))).getText() + " - " +   driver.findElement(By.xpath(p.getProperty("view_4"))).getText());
		 	               report.write("04, " + driver.findElement(By.xpath(p.getProperty("name_4"))).getText() + ", "  +   driver.findElement(By.xpath(p.getProperty("view_4"))).getText().replace(",", "_")); report.write(ls);
		 driver.navigate().back();
		 
			/////////////////////////////  Element #5 ////////////////////////////////
		 driver.findElement(By.xpath(p.getProperty("el_5"))).click();
		 	    System.out.println("05, " + driver.findElement(By.xpath(p.getProperty("name_5"))).getText() + " - " +   driver.findElement(By.xpath(p.getProperty("view_5"))).getText());
		 	               report.write("05, " + driver.findElement(By.xpath(p.getProperty("name_5"))).getText() + ", "  +   driver.findElement(By.xpath(p.getProperty("view_5"))).getText().replace(",", "_")); report.write(ls);
		 driver.navigate().back();
		 
			/////////////////////////////  Element #5 ////////////////////////////////
		 driver.findElement(By.xpath(p.getProperty("el_6"))).click();
		 	    System.out.println("06, " + driver.findElement(By.xpath(p.getProperty("name_6"))).getText() + " - " +   driver.findElement(By.xpath(p.getProperty("view_6"))).getText());
		 	               report.write("06, " + driver.findElement(By.xpath(p.getProperty("name_6"))).getText() + ", "  +   driver.findElement(By.xpath(p.getProperty("view_6"))).getText().replace(",", "_")); report.write(ls);
		 driver.navigate().back();
		 
			/////////////////////////////  Element #5 ////////////////////////////////
		 driver.findElement(By.xpath(p.getProperty("el_7"))).click();
		 	    System.out.println("07, " + driver.findElement(By.xpath(p.getProperty("name_7"))).getText() + " - " +   driver.findElement(By.xpath(p.getProperty("view_7"))).getText());
		 	               report.write("07, " + driver.findElement(By.xpath(p.getProperty("name_7"))).getText() + ", "  +   driver.findElement(By.xpath(p.getProperty("view_7"))).getText().replace(",", "_")); report.write(ls);
		 driver.navigate().back();
		 		 
			/////////////////////////////  Element #5 ////////////////////////////////
		 driver.findElement(By.xpath(p.getProperty("el_8"))).click();
		 	    System.out.println("08, " + driver.findElement(By.xpath(p.getProperty("name_8"))).getText() + " - " +   driver.findElement(By.xpath(p.getProperty("view_8"))).getText());
		 	               report.write("08, " + driver.findElement(By.xpath(p.getProperty("name_8"))).getText() + ", "  +   driver.findElement(By.xpath(p.getProperty("view_8"))).getText().replace(",", "_")); report.write(ls);
		 driver.navigate().back();
		 	 
			/////////////////////////////  Element #5 ////////////////////////////////
		 driver.findElement(By.xpath(p.getProperty("el_9"))).click();
		 	    System.out.println("09, " + driver.findElement(By.xpath(p.getProperty("name_9"))).getText() + " - " +   driver.findElement(By.xpath(p.getProperty("view_9"))).getText());
		 	               report.write("09, " + driver.findElement(By.xpath(p.getProperty("name_9"))).getText() + ", "  +   driver.findElement(By.xpath(p.getProperty("view_9"))).getText().replace(",", "_")); report.write(ls);
		 driver.navigate().back();
		  
			/////////////////////////////  Element #5 ////////////////////////////////
		 driver.findElement(By.xpath(p.getProperty("el_10"))).click();
		 	    System.out.println("10, " + driver.findElement(By.xpath(p.getProperty("name_10"))).getText() + " - " +   driver.findElement(By.xpath(p.getProperty("view_10"))).getText());
		 	               report.write("10, " + driver.findElement(By.xpath(p.getProperty("name_10"))).getText() + ", "  +   driver.findElement(By.xpath(p.getProperty("view_10"))).getText().replace(",", "_")); report.write(ls);
		 driver.navigate().back();
		 	 
			/////////////////////////////  Element #11 ////////////////////////////////
		 driver.findElement(By.xpath(p.getProperty("el_11"))).click();
		 	    System.out.println("11, " + driver.findElement(By.xpath(p.getProperty("name_11"))).getText() + " - " +   driver.findElement(By.xpath(p.getProperty("view_11"))).getText());
		 	               report.write("11, " + driver.findElement(By.xpath(p.getProperty("name_11"))).getText() + ", "  +   driver.findElement(By.xpath(p.getProperty("view_11"))).getText().replace(",", "_")); report.write(ls);
		 driver.navigate().back();
		 		 
			/////////////////////////////  Element #12 ////////////////////////////////
		 driver.findElement(By.xpath(p.getProperty("el_12"))).click();
		 	    System.out.println("12, " + driver.findElement(By.xpath(p.getProperty("name_12"))).getText() + " - " +   driver.findElement(By.xpath(p.getProperty("view_12"))).getText());
		 	               report.write("12, " + driver.findElement(By.xpath(p.getProperty("name_12"))).getText() + ", "  +   driver.findElement(By.xpath(p.getProperty("view_12"))).getText().replace(",", "_")); report.write(ls);
		 driver.navigate().back();
		  
		 ///////////////////////////// END ////////////////////////////
	
			report.flush();
			report.close();
			driver.quit();
	}
}
