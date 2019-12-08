package com.ejercicio.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.ejercicio.appfacelite.MyDriverFaceLite;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BasePage {

	private AndroidDriver<AndroidElement> driver;

	private final WebDriverWait wait;

	public BasePage(MyDriverFaceLite driver) {
		this.wait = new WebDriverWait(driver.getDriver(), 05);
		this.driver = driver.getDriver();
	}

	public AndroidDriver<AndroidElement> getDriver() {
		return driver;
	}

	public WebDriverWait getWait() {
		return wait;
	}
	
	public void waitVisibility(By locator) {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}catch(TimeoutException e){
			e.printStackTrace();
		}
	}
	
	public void continuar(AndroidElement elemento) {
		elemento.click();
	}
	
	public void escribe(AndroidElement nombre,AndroidElement nombredos)  {
		nombre.setValue("Sandra");
		nombredos.setValue("Sarahi");
	}
	
	public void remplaza(AndroidElement tel) {
		tel.replaceValue("+15556253200");
	}
	
	public void correo(AndroidElement email) {
		email.setValue("sandra-bravo-10@hotmail.com");
	}
	
	public void password(AndroidElement pass) {
		pass.setValue("17Amore90@");
	}

}
