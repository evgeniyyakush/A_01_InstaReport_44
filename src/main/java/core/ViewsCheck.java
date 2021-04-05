

package core;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Properties;
import org.openqa.selenium.By;

public class ViewsCheck {
	static Writer report;
	static Properties p = new Properties();
	
	public static void report() throws Exception {
//		Input from external file
		p.load(new FileInputStream("./input.properties"));
		
//		Report into external file
		// to lowerCase
		// we have it set to "false" as we want .csv file to be override
		report = new FileWriter("./reportPOM_" + Common.getBrowser().toString().toLowerCase() +".csv", false);
		
		
/////////////////////////////  Report ////////////////////////////////
		/// => Header
		Common.writeReportHeader(report);
		        


		/////////////////////////////  Element #1 ////////////////////////////////
		Common.isElementPresent(By.xpath(p.getProperty("el_1")));
		Common.click(By.xpath(p.getProperty("el_1")));
				
		Common.isElementPresent(By.xpath(p.getProperty("name_1")));
		Common.isElementPresent(By.xpath(p.getProperty("view_1")));
		Common.writeReportLine("01", By.xpath(p.getProperty("name_1")),By.xpath(p.getProperty("view_1")), report);
		Common.back();

				
				

		
	    /////////////////////////////  Element #2 ////////////////////////////////
		Common.isElementPresent(By.xpath(p.getProperty("el_2")));
		Common.click(By.xpath(p.getProperty("el_2")));
		
		Common.isElementPresent(By.xpath(p.getProperty("name_2")));
		Common.isElementPresent(By.xpath(p.getProperty("view_2")));
		Common.writeReportLine("02", By.xpath(p.getProperty("name_2")),By.xpath(p.getProperty("view_2")), report);
		Common.back();
		 	               
		 	               
		/////////////////////////////  Element #3 ////////////////////////////////
		Common.isElementPresent(By.xpath(p.getProperty("el_3")));
		Common.click(By.xpath(p.getProperty("el_3")));
		
		Common.isElementPresent(By.xpath(p.getProperty("name_3")));
		Common.isElementPresent(By.xpath(p.getProperty("view_3")));
		Common.writeReportLine("03", By.xpath(p.getProperty("name_3")),By.xpath(p.getProperty("view_3")), report);
		 	              Common.back();
		 
			/////////////////////////////  Element #4 ////////////////////////////////
		 	             Common.isElementPresent(By.xpath(p.getProperty("el_4")));
		 Common.click(By.xpath(p.getProperty("el_4")));
		 
		 Common.isElementPresent(By.xpath(p.getProperty("name_4")));
		 Common.isElementPresent(By.xpath(p.getProperty("view_4")));
		 Common.writeReportLine("04", By.xpath(p.getProperty("name_4")),By.xpath(p.getProperty("view_4")), report);
		 	              Common.back();
		 
			/////////////////////////////  Element #5 ////////////////////////////////
		 	             Common.isElementPresent(By.xpath(p.getProperty("el_5")));
		 Common.click(By.xpath(p.getProperty("el_5")));
		 
		 Common.isElementPresent(By.xpath(p.getProperty("name_5")));
		 Common.isElementPresent(By.xpath(p.getProperty("view_5")));
		 Common.writeReportLine("05", By.xpath(p.getProperty("name_5")),By.xpath(p.getProperty("view_5")), report);
		 Common.back();
		 
			/////////////////////////////  Element #5 ////////////////////////////////
		 Common.isElementPresent(By.xpath(p.getProperty("el_6")));
		 Common.click(By.xpath(p.getProperty("el_6")));
		 
		 Common.isElementPresent(By.xpath(p.getProperty("name_6")));
		 Common.isElementPresent(By.xpath(p.getProperty("view_6")));
		 Common.writeReportLine("06", By.xpath(p.getProperty("name_6")),By.xpath(p.getProperty("view_6")), report);
		 Common.back();
		 
			/////////////////////////////  Element #5 ////////////////////////////////
		 Common.isElementPresent(By.xpath(p.getProperty("el_7")));
		 Common.click(By.xpath(p.getProperty("el_7")));
		 
		 Common.isElementPresent(By.xpath(p.getProperty("name_7")));
		 Common.isElementPresent(By.xpath(p.getProperty("view_7")));
		 Common.writeReportLine("07", By.xpath(p.getProperty("name_7")),By.xpath(p.getProperty("view_7")), report);
		 Common.back();
		 		 
			/////////////////////////////  Element #5 ////////////////////////////////
		 Common.isElementPresent(By.xpath(p.getProperty("el_8")));
		 Common.click(By.xpath(p.getProperty("el_8")));
		 
		 Common.isElementPresent(By.xpath(p.getProperty("name_8")));
		 Common.isElementPresent(By.xpath(p.getProperty("view_8")));
		 Common.writeReportLine("08", By.xpath(p.getProperty("name_8")),By.xpath(p.getProperty("view_8")), report);
		 Common.back();
		 	 
			/////////////////////////////  Element #5 ////////////////////////////////
		 Common.isElementPresent(By.xpath(p.getProperty("el_9")));
		 Common.click(By.xpath(p.getProperty("el_9")));
		 
		 Common.isElementPresent(By.xpath(p.getProperty("name_9")));
		 Common.isElementPresent(By.xpath(p.getProperty("view_9")));
		 Common.writeReportLine("09", By.xpath(p.getProperty("name_9")),By.xpath(p.getProperty("view_9")), report);
		 Common.back();
		  
			/////////////////////////////  Element #5 ////////////////////////////////
		 Common.isElementPresent(By.xpath(p.getProperty("el_10")));
		 Common.click(By.xpath(p.getProperty("el_10")));
		 
		 Common.isElementPresent(By.xpath(p.getProperty("name_10")));
		 Common.isElementPresent(By.xpath(p.getProperty("view_10")));
		 Common.writeReportLine("10", By.xpath(p.getProperty("name_10")),By.xpath(p.getProperty("view_10")), report);
		 Common.back();
		 	 
			/////////////////////////////  Element #11 ////////////////////////////////
		 Common.isElementPresent(By.xpath(p.getProperty("el_11")));
		 Common.click(By.xpath(p.getProperty("el_11")));
		 
		 Common.isElementPresent(By.xpath(p.getProperty("name_11")));
		 Common.isElementPresent(By.xpath(p.getProperty("view_11")));
		 Common.writeReportLine("11", By.xpath(p.getProperty("name_11")),By.xpath(p.getProperty("view_11")), report);
		Common.back();
		 		 
			/////////////////////////////  Element #12 ////////////////////////////////
		Common.isElementPresent(By.xpath(p.getProperty("el_12")));
		 Common.click(By.xpath(p.getProperty("el_12")));
		 
		 Common.isElementPresent(By.xpath(p.getProperty("name_12")));
		 Common.isElementPresent(By.xpath(p.getProperty("view_12")));
		 Common.writeReportLine("12", By.xpath(p.getProperty("name_12")),By.xpath(p.getProperty("view_12")), report);
		Common.back();
		  
		 ///////////////////////////// END ////////////////////////////
	
			report.flush();
			report.close();
	}
}