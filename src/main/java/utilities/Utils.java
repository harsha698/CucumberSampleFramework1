package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utils {
	
	public static void sel_dropDown(WebElement element, String text){
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	
	

}
