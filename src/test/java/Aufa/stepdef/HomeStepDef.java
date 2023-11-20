package Aufa.stepdef;

import Aufa.BaseTest;
import Aufa.page.HomePage;
import io.cucumber.java.en.Then;

public class HomeStepDef extends BaseTest {
    HomePage homePage;
    @Then("user will redirect to homepage")
    public void userWillRedirectToHomepage() {
        homePage = new HomePage(driver);
        homePage.validateOnHomePage();
    }
}
