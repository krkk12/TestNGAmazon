package org.page;

import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocatorPage extends BaseClass {

	
	public LocatorPage() {
			
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindAll({@FindBy(xpath="//a[@class='s-pagination-item s-pagination-next s-pagination-button s-pagination-button-accessibility s-pagination-separator']"),@FindBy(xpath = "//a[@class='s-pagination-item s-pagination-next s-pagination-button s-pagination-separator']")})
	private WebElement nextPage;


	public WebElement getNextPage() {
		return nextPage;
	}
	
	@FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal']")
	private List<WebElement> productList;


	public List<WebElement> getProductList() {
		return productList;
	}
	
	
	
	
}
