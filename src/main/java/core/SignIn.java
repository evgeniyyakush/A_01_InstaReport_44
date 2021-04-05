package core;

import java.io.FileInputStream;
import java.io.Writer;
import java.util.Properties;
import org.openqa.selenium.By;

class SignIn {
	static Properties p = new Properties();
	static Writer report;

////////////////////////////////  -  Method  open  -  ///////////////////////          
// Runs_Browser
	static void open(String browser) throws Exception {
		p.load(new FileInputStream("./input.properties"));
		Common.open(browser, p.getProperty("url"));
	}

////////////////////////////////  -  Method  credentials -  ///////////////////////   
	static void credentials() throws Exception {
//		Input from external file
		//Every time we use the new method we need to load file in a new method again
		p.load(new FileInputStream("./input.properties"));
		

		//------------------------------------------------------------   Process  --------------------------------------------------- //
		
/////////////////////////////  "instagram.com" Credentials ////////////////////////////////
			
		// => Credentials 	//highlightingElement by "isElementPresent" method
	    Common.isElementPresent(By.xpath(p.getProperty("id_email")));
		Common.setValue(By.xpath(p.getProperty("id_email")), p.getProperty("email"));
		
		Common.isElementPresent(By.xpath(p.getProperty("id_password")));
		Common.setValue(By.xpath(p.getProperty("id_password")), p.getProperty("password"));
		
		Common.isElementPresent(By.xpath(p.getProperty("id_LogIn")));
		Common.click(By.xpath(p.getProperty("id_LogIn")));
		
		// => saveInfo/Notification 
		Common.isElementPresent(By.xpath(p.getProperty("notNow")));
		Common.click(By.xpath(p.getProperty("notNow")));
		
		Common.isElementPresent(By.xpath(p.getProperty("noti")));
		Common.click(By.xpath(p.getProperty("noti")));
		
		// => FeedPage to Home 
		Common.isElementPresent(By.xpath(p.getProperty("avatar")));
		Common.click(By.xpath(p.getProperty("avatar")));
		
		Common.isElementPresent(By.xpath(p.getProperty("profile")));
		Common.click(By.xpath(p.getProperty("profile")));
		
		Common.isElementPresent(By.xpath(p.getProperty("igtv")));
		Common.click(By.xpath(p.getProperty("igtv")));

	}
}