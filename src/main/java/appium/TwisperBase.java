package appium;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TwisperBase {

	public AndroidDriver<MobileElement> driver;
	public WebDriverWait wait;

	@Before
	public void setUp() throws IOException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Android Emulator");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "11");
		capabilities.setCapability("appPackage", "com.twisper.twisper.stag");
		capabilities.setCapability("appActivity", "com.twisper.twisper.MainActivity");
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@After
	public void close() {
		driver.quit();
	}
}