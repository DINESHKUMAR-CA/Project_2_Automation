package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.TestCasesPage;

public class TestCases {
	
	WebDriver driver;
	TestCasesPage testCasesPage;
	Hooks hooks;
	
	public TestCases() {
		hooks = new Hooks();
		testCasesPage = new TestCasesPage(Hooks.driver);
	}
	
	@And("The user clicks on Test cases in the homepage")
    public void user_clicks_on_test_cases_in_homepage() {
		testCasesPage.clcikOnTestCasesOption();
    }

    @Then("The title of the page should be {string}")
    public void verify_page_title(String expectedTitle) {
        String actualTitle = testCasesPage.getTitleOfThePage();
        Assert.assertEquals(expectedTitle, actualTitle);
        System.out.println("The Title that we found after clicking on Test Cases is: "+ actualTitle);
    }
}
