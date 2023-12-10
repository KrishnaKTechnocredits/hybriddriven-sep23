package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ControlActions;

public class DashboardPage extends ControlActions{

	@FindBy(css = "")
	WebElement searchElement;
	
	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}
}
