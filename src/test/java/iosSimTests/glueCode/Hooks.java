package iosSimTests.glueCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Hooks 
{
	public static AppiumDriver<MobileElement> driver;
	private DesiredCapabilities dc ;
	private AppiumDriverLocalService service;
	
	@Before
	public void setUp()
	{
		dc = new DesiredCapabilities();
		service = AppiumDriverLocalService.buildDefaultService();
		service.start();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
		dc.setCapability(MobileCapabilityType.FULL_RESET, "true");
		dc.setCapability(MobileCapabilityType.APP, "/Users/ishan/Eclipse Workspace/AppTestBase/UICatalog.app");
		driver = new IOSDriver<MobileElement>(service.getUrl(),dc);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
		service.stop();
	}

}
