package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.CVSHomePage;
import pages.CVSShopPage;
import utils.utils.Driver;

public class CvsSteps {
    WebDriver driver;
    CVSHomePage cvsHomePage;
    CVSShopPage cvsShopPage;

    @Before
    public void setup() {
        driver = Driver.getDriver();
        cvsHomePage=new CVSHomePage();
        cvsShopPage=new CVSShopPage();
    }
    @When("user clicks on {string} menu item")
    public void user_clicks_on_menu_item(String shopLinkText) {
        cvsHomePage.shopLink.click();

    }

    @Then("user should see {string}")
    public void user_should_see(String SearchBox) {
        Assert.assertTrue(cvsShopPage.searchBox.isDisplayed());
    }

    @When("user search for {string} on cvs")
    public void user_search_for_on_cvs(String string) {

    }

    @Then("user should see {string} items")
    public void user_should_see_items(String string) {

    }

    @When("user enter {string} on cvs")
    public void userEnterOnCvs(String arg0) {
    }
}
