package stepdef;

import page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginStepDef extends BaseTest {
    LoginPage loginPage;


    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
        loginPage = new LoginPage(driver);
        loginPage.goToLoginPage();
    }

    @When("user input email text box with {string}")
    public void userInputEmailTextBoxWith(String username) {
        loginPage.inputUsername(username);

    }

    @And("user input password text box with {string}")
    public void userInputPasswordTextBoxWith(String password) {
        loginPage.inputPassword(password);
    }

    @And("user click login button")
    public void userClickLoginButton() {
        loginPage.clickLoginButton();
    }


//    @And("user able to see error")
//    public void userAbleToSeeError() {
//        loginPage.validateErrorAppear();
//    }
}
