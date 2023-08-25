package com.selenium.Selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("http://watir.com/examples/shadow_dom.html");

		Thread.sleep(2000);
		WebElement shadowHost = driver.findElement(By.cssSelector("#shadow_host"));

		SearchContext shadowRoot = shadowHost.getShadowRoot();
		WebElement shadowContent = shadowRoot.findElement(By.cssSelector("a"));

		System.out.println(shadowContent.getText());
		
		
		/*
		
		JavascriptExecutor jsDriver = (JavascriptExecutor) driver;

		List<WebElement> children = (List<WebElement>) jsDriver.executeScript("return arguments[0].shadowRoot.children",
				shadowHost);
		System.out.println(children.size());

		WebElement shadowContent = null;
		for (WebElement element : children) {
			System.out.println(element.getTagName());

			if (element.getAttribute("type").equals("checkbox")) {
				shadowContent = element;
				System.out.println("Get elem");
				shadowContent.click();
				break;
			}
		}*/

	}

}
