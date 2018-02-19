package testContext;

import managers.PageObjectManager;
import managers.WebDriverManager;

public class TestContext {
	
	public WebDriverManager webDrivermanager;
	public PageObjectManager pageObjectManager;
	
	public TestContext(){
		webDrivermanager = new WebDriverManager();
		pageObjectManager = new PageObjectManager(webDrivermanager.getDriver());
		
	}
	
	public WebDriverManager getWebDriverManager(){
		return webDrivermanager;
	}
	
	public PageObjectManager getPageObjectManager(){
		return pageObjectManager;
	}

}
