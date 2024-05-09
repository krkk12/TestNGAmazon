package org.test;

import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.page.LocatorPage;
import org.testng.annotations.Test;

public class TestScript extends BaseClass {

	public static BaseClass b = new BaseClass();
	public static LocatorPage l;

	@Test
	private void iphoneTitle() throws InterruptedException {

		b.getDriver("Chrome");
		b.getUrl("https://www.amazon.in/");
		b.maximize();
		b.findElement("id", "twotabsearchtextbox").sendKeys("iphone 15 max");
		b.findElement("xpath", "//div[@class='nav-search-submit nav-sprite']").click();

		while (true) {
			l = new LocatorPage();

			b.sleep(2000);
			
			for (WebElement productTitle : l.getProductList()) {
				System.out.println(productTitle.getText());
			}
			
			b.sleep(2000);

			if (l.getNextPage().isEnabled()) {
				l.getNextPage().click();
				List<WebElement> productsListt = b.findElementsByXpath("//span[@class='a-size-medium a-color-base a-text-normal']");
				for (WebElement productTitle : l.getProductList()) {
					System.out.println(productTitle.getText());
				}
			} else {

				break;
			}

		}

		driver.quit();

	}

}