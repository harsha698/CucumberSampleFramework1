package managers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import enums.DriverType;
import enums.EnvironmentType;

public class WebDriverManager {
	
	private static DriverType driverType;
	private static EnvironmentType envType;
	private WebDriver driver;
	
	public WebDriverManager(){
		driverType = FileReaderManager.getInstance().getConfigReader().getBrowser();
		envType = FileReaderManager.getInstance().getConfigReader().getEnvironment();
	}
	
	public WebDriver getDriver(){
		if(driver==null)
			driver = createDriver();
		return driver;
	}
	
	public WebDriver createDriver(){
		switch(envType){
		case REMOTE:
			createRemoteDriver();
			break;
		case LOCAL:
			createLocalDriver();
			break;
		} 
		return driver;
	}
	
	public void quitDriver(){
		driver.quit();
	}
	
	public void createRemoteDriver(){
		throw new RuntimeException("Remote Driver is not yet implemented");
	}
	
	public void createLocalDriver(){
		
		switch(driverType){
		case CHROME:
			System.setProperty("webdriver.chrome.driver", FileReaderManager.getInstance().getConfigReader().getDriverPath());
			driver = new ChromeDriver();
			break;
		case FIREFOX:
			System.setProperty("webdriver.firefox.marionette", FileReaderManager.getInstance().getConfigReader().getDriverPath());
			driver = new FirefoxDriver();
			break;
		
		case INTERNETEXPLORER:
			System.setProperty("webdriver.ie.driver", FileReaderManager.getInstance().getConfigReader().getDriverPath());
			driver = new InternetExplorerDriver();
			break;
		}//end of switch
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitWait(), TimeUnit.SECONDS);
			
		
	}

}
