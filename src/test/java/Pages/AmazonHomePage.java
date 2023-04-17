package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilites.Driver;

public class AmazonHomePage {
       
	   
	public AmazonHomePage() {
		
		PageFactory.initElements(Driver.getDriver(),this);
	}
		
	    @FindBy (xpath = "\"//title[contains(text(),'Amazon.com : coffee mug')]\"")
	    public WebElement PAGE_TITLE;
	    
	    @FindBy(id = "nav-search-dropdown-card")
	    public WebElement EARCH_BUTTON;

	    @FindBy(id = "searchDropdownBox")
	    public WebElement SEARCH_DROPDOWN_BOX;

	    @FindBy(id = "twotabsearchtextbox")
	    public WebElement SEARCH_BOX;

	    @FindBy(css = "[value='Go']")
	    public WebElement searchButton;
}



