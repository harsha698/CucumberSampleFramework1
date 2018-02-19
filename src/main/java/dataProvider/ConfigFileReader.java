package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import enums.DriverType;
import enums.EnvironmentType;

public class ConfigFileReader {
	
	private String configFilePath = "E:\\Selenium_WebDriver\\CucumberSampleFramework1\\config\\Configuration.properties";
	public File file;
	public FileInputStream fip;
	public Properties prop;
	
	public ConfigFileReader(){
		file = new File(configFilePath);
			try {
				fip = new FileInputStream(file); //new BufferedReader(new FileReader(propertyFilePath));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				throw new RuntimeException("File not found at filepath: "+configFilePath);
			} 
			
			try {
				prop = new Properties();
				prop.load(fip);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	public String getDriverPath(){
		String path = prop.getProperty("driverPath");
		if(path!=null) return path;
		else
			throw new RuntimeException("driverpath is missing from properties file");
	}
	
	public long getImplicitWait(){
		String implicitlyWait = prop.getProperty("implicitPageTime");
		if(implicitlyWait != null) {
			try{
				return Long.parseLong(implicitlyWait);
			}catch(NumberFormatException e) {
				throw new RuntimeException("Not able to parse value : " + implicitlyWait + " in to Long");
			}
		}
		return 30;
	}
	
	public String getApplicationUrl(){
		String url = prop.getProperty("url");
		if(url!=null) return url;
		else
			throw new RuntimeException("app url is missing from properties file");
	}
	
	public DriverType getBrowser() {
		
		String browserName = prop.getProperty("browser");
		if(browserName==null || browserName.equalsIgnoreCase("firefox")) return DriverType.FIREFOX;
		else if(browserName.equalsIgnoreCase("chrome")) return DriverType.CHROME;
		else if(browserName.equalsIgnoreCase("ie")) return DriverType.INTERNETEXPLORER;
		else
			throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched : " + browserName);
		
	}
 
	public EnvironmentType getEnvironment() {
		String envName = prop.getProperty("environment");
		if(envName==null || envName.equalsIgnoreCase("local")) return EnvironmentType.LOCAL;
		else if(envName.equalsIgnoreCase("remote")) return EnvironmentType.REMOTE;
		else throw new RuntimeException("Environment Type Key value in Configuration.properties is not matched : " + envName);
	}
	
	public String getReportConfigPath(){
		String configpath =  prop.getProperty("reportConfigPath");
		if(configpath!=null) return configpath;
		else
			throw new RuntimeException("report config path is missing from properties file");
	}
	
	public String getTestDataResourcePath(){
		String testDataResPath = prop.getProperty("testDataResourcePath");
		if(testDataResPath!=null) return testDataResPath;
		else
			throw new RuntimeException("Test Data Resource Path not specified in the Configuration.properties file for the Key:testDataResourcePath");
	}

}
