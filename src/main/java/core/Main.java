package core;

import java.time.LocalDateTime;

public class Main {
	static String browser;
	static String username;
	static String exp_2021_08_25 = "2021-08-25T14:52:26.098"; 
	static String user = "evgeniy";
	

	//------------------------------------------------------------   Main_Method  --------------------------------------------------- //
	public static void main(String[] args) throws Exception {
				
// EXPIRATION of code
		if (LocalDateTime.now().isAfter(LocalDateTime.parse(exp_2021_08_25))) {
			String msg = String.format("Today at [%s] this version has expired.", LocalDateTime.now());
			throw new RuntimeException(msg);}
		
		
// AUTHORIZATION to run the code 
		// We can create password and put it into a "bashrc" to authorize the running of the file
		// username = "alex";
		// -Dusername="evgeniy"
		username = System.getProperty("username"); 					
		if (!username.equalsIgnoreCase(user)) {
			String msg = String.format("Username [%s] is not authorized to run this program.", username);
			throw new RuntimeException(msg);}
			
		
// SUPPORTED_BROWSERS
		// browser = "firefox";
		// -Dbrowser="firefox" will run as Firefox      or ...      
		// -Dbrowser="chrome" will run as Chrome
		browser = System.getProperty("browser");     					 
		if(browser == null) {System.err.println("Please provide browser: -Dbrowser=\"firefox\""); System.exit(0);}
		else if( !browser.equalsIgnoreCase("chrome") &&
					!browser.equalsIgnoreCase("firefox") &&
					!browser.equalsIgnoreCase("safari") &&
					!browser.equalsIgnoreCase("edge")) 
				{System.err.println("Framework supports Only: Chrome, Firefox, Safari or Edge"); System.exit(0);}
	
		
// ORCHESTRATION_OF_PROCESS
		SignIn.open(browser);
		SignIn.credentials();
		ViewsCheck.report();
		Common.quit();
	}
}
