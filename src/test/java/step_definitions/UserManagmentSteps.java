package step_definitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import Pages.AmazonHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilites.DataReader;
import utilites.Driver;


public class UserManagmentSteps {
	
	AmazonHomePage amazon = new AmazonHomePage();
	Select select;
	@Given("I am on the Amazon home page")
	public void i_am_on_the_amazon_home_page() {
		 Driver.getDriver().get(DataReader.getProperty("appUrl")); 
	 
	}
	

    @When("I verify that I am on the Amazon home page")
    public void i_verify_that_i_am_on_the_amazon_home_page() {
        String expectedTitle = "Amazon.com";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    @And("the default dropdown value is {string}")
    public void the_default_dropdown_value_is(String dropdownValue) {
        WebElement dropdown = Driver.getDriver().findElement(By.id("searchDropdownBox"));
        select = new Select(dropdown);
        String selectedOption = select.getFirstSelectedOption().getText();
        Assert.assertEquals(dropdownValue, selectedOption);
    }

    @When("I select {string} department from the dropdown")
    public void i_select_department_from_the_dropdown(String department) {
        WebElement dropdown = Driver.getDriver().findElement(By.id("searchDropdownBox"));
       select = new Select(dropdown);
        select.selectByVisibleText(department);
    }

    @And("search for {string}")
    public void search_for(String search_term) {
        WebElement searchBox = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys(search_term);
        searchBox.submit();
    }

    @Then("I verify that I am on the coffee mug search results page")
    public void i_verify_that_i_am_on_the_coffee_mug_search_results_page() {
        String expectedTitle = "coffee mug";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    @And("verify that I am in the {string} department")
    public void verify_that_I_am_in_the_department(String department) {
        WebElement dropdown = Driver.getDriver().findElement(By.id("searchDropdownBox"));
       select = new Select(dropdown);
        String selectedOption = select.getFirstSelectedOption().getText();
        Assert.assertEquals(department, selectedOption);
    }

}
		 