package com.schedulemodu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Capminds_BaseClass {

	public static WebDriver driver;

	// Driver Invoke

	public static WebDriver getbrowser(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\driver\\chromedriver.exe");

			driver = new ChromeDriver();

		} else if (type.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					System.getProperty("user.dir") + "\\edgedriver\\msedgedriver.exe");

			driver = new EdgeDriver();

		}

		driver.manage().window().maximize();

		return driver;

	}

	public static void geturl(String url) {

		driver.get(url);

	}

	public static void sendkeys(WebElement elements, String Value) {

		elements.sendKeys(Value);

	}
	public static void sendkeys1(WebElement elements, Keys Value) {

		elements.sendKeys(Value);

	}

	public static void Clickonelement(WebElement element) {

		element.click();

	}

	public static void clear(WebElement elements1) {

		elements1.clear();

	}

	public static void alertdismiss(WebDriver driver) {

		driver.switchTo().alert().dismiss();

	}

	public static void selectone(WebElement ele, String val) {

		Select se = new Select(ele);

		se.selectByVisibleText(val);

	}

	public static void selecttwo(WebElement eleme, String valu) {

		Select se = new Select(eleme);

		se.selectByValue(valu);

	}

	public static void gettext(WebElement text) {

		String text1 = text.getText();

		System.out.println(text1);

	}

	public static void gettexts(List<WebElement> text) {

		for (WebElement data : text) {
			String text2 = data.getText();
			System.out.println(text2);
		}

	}

}
