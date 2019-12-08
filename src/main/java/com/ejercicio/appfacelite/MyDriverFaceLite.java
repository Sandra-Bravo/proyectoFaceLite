package com.ejercicio.appfacelite;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.log4j.Logger;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class MyDriverFaceLite {

	Logger log=Logger.getLogger(MyDriverFaceLite.class);

	protected AndroidDriver<AndroidElement> driver;
	protected WebDriverWait wait;

	public void setUpAppiumDriver() throws MalformedURLException{
		
		final File classpathRoot = new File (System.getProperty("user.dir"));
		final File appDir = new File(classpathRoot, "src/test/resources/apps/");
		final File app = new File(appDir, "com.facebook.lite.apk");
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("deviceName", "emulator-5554");
		caps.setCapability("platformName","Android");
		caps.setCapability("platformVersion","9");
		caps.setCapability("appPackage", "com.facebook.lite");
		caps.setCapability("appActivity","com.facebook.lite.MainActivity");
		caps.setCapability("autoGrantPermissions", true);
		caps.setCapability("clearSystemFiles", true);
		caps.setCapability("app",app.getAbsolutePath());
		
		try {
			System.out.println("ejecuta");
			driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),caps);
			wait = new WebDriverWait(driver,05);
			
		}catch(MalformedURLException e) {
		 
			log.error("error ", e);
		}
		}

	public void closeApp() {
		if (driver != null) {
			driver.quit();
		}

	}
	
	public AndroidDriver <AndroidElement> getDriver(){
		return this.driver;
	}
	

}


