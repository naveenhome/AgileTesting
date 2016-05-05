package wellsfargo.com;

import junit.framework.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalculatorSteps extends TestCase{
	private WebDriver driver;
	private String baseUrl;
	  

	@Given("^user enter (\\d+) and (\\d+)$")
	public void user_enter_and(int Number1, int Number2) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		driver = new FirefoxDriver();
	    baseUrl = "http://ata123456789123456789.appspot.com/";
	    driver.get(baseUrl + "/");
	    driver.findElement(By.id("ID_nameField1")).clear();
	    driver.findElement(By.id("ID_nameField1")).sendKeys(Number1+"");
	    driver.findElement(By.id("ID_nameField2")).clear();
	    driver.findElement(By.id("ID_nameField2")).sendKeys(Number2+"");
	}

	@When("^select \"([^\"]*)\"$")
	public void select(String RadioButton) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		if(RadioButton.equals("Add"))
		{
			driver.findElement(By.id("gwt-uid-1")).click();
		}
		else if(RadioButton.equals("Mul"))
		{
			driver.findElement(By.id("gwt-uid-2")).click();
		}
	}
	@When("^click on calculate$")
	public void click_on_calculate() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		driver.findElement(By.id("ID_calculator")).click();
	}

	@Then("^Result should be (\\d+)$")
	public void Result_should_be(int ExpectedResult) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		String result = driver.findElement(By.id("ID_nameField3")).getAttribute("value");
		assertEquals(ExpectedResult+"", result);
		driver.close();
		
	}

}
