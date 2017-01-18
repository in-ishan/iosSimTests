package iosSimTests.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import iosSimTests.glueCode.Hooks;

public class HomePage 
{
	@iOSFindBy(id="Controls")
	private MobileElement controlsMobileElement;
	
	public HomePage()
	{
		PageFactory.initElements(new AppiumFieldDecorator(Hooks.driver, 30, TimeUnit.SECONDS), this);
	}
	
	public void ClickOnControlsLabel()
	{
		controlsMobileElement.click();
	}

}
