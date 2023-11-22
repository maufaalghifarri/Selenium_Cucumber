package Aufa.stepdef;

import Aufa.BaseTest;
import Aufa.page.CartPage;
import Aufa.page.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CartStepDef extends BaseTest {

    CartPage cartPage;

    @And("user is on the cart page")
    public void userIsOnTheCartPage() {
        cartPage = new CartPage(driver);
        cartPage.validateOnCartPage();

    }

    @Then("user sees the Sauce Labs Backpack on the cart page")
    public void userSeesTheSauceLabsBackpackOnTheCartPage() {
        cartPage = new CartPage(driver);
        cartPage.seeSauceLabsBackPackOnCartPage();

    }

    @And("user click remove on the Sauce Labs Backpack product")
    public void userClickRemoveOnTheSauceLabsBackpackProduct() {
        cartPage.removeSauceLabsBackpackButton();
    }
}
