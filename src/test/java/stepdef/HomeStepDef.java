package stepdef;

import page.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class HomeStepDef extends BaseTest {
    HomePage homePage;
    @Then("user is on the home page")
    public void userWillRedirectToHomepage() {
        homePage = new HomePage(driver);
        homePage.validateOnHomePage();
    }

    @And("user sees the Sauce Labs Backpack on the home page")
    public void userSeesTheSauceLabsBackpackOnTheHomePage() {
        homePage = new HomePage(driver);
        homePage.validateOnHomePage();

    }

    @And("user click add to cart button on Sauce Labs Backpack")
    public void userClickAddToCartButtonOnSauceLabsBackpack() {
        homePage.addChartSauceLabsBackpack();
    }

    @And("user click cart symbol")
    public void userClickCartButton() {
        homePage.clickCartSymbol();
    }
}
