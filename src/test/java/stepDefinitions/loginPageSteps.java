package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homePage;
import pages.loginPage;

public class loginPageSteps {

    homePage homeP;
    loginPage loginP;

    @Given("Enes is on Home page")
    public void enesIsOnHomePage() {
        homeP.checkHomePage();
    }

    @When("click {string} card in the top rigt")
    public void clickCardInTheTopRigt(String arg0) {
        homeP.clickLogin();
    }

    @Then("should see Login Page")
    public void shouldSeeLoginPage() {
        loginP.checkLoginPage();
    }

    @Given("Enes is on Login Page")
    public void enesIsOnLoginPage() {
        loginP.checkLoginPage();
    }

    @When("click {string} radio button")
    public void clickRadioButton(String arg0) {
        loginP.clickEmailRadioButton();
    }

    @Then("should see {string} title")
    public void shouldSeeTitle(String arg0) {
        loginP.checkLoginPage();
    }

    @Then("should see {string} radio button")
    public void shouldSeeRadioButton(String arg0) {
        loginP.checkLoginPageEmail();
    }

    @Then("should see {string} text on Email")
    public void shouldSeeTextOnEmail(String arg0) {
        loginP.checkemailPlaceholder();
    }

    @Then("should see {string} text on Password")
    public void shouldSeeTextOnPassword(String arg0) {
        loginP.checkpasswordPlaceholder();
    }

    @Then("should see Show Password Icon")
    public void shouldSeeShowPasswordIcon() {
        loginP.checkPasswordIcon();
    }

    @Then("should see {string} remember me")
    public void shouldSeeRememberMe(String arg0) {
        loginP.checkCheckboxRememberMe();
    }

    @Then("should see {string} forgot password")
    public void shouldSeeForgotPassword(String arg0) {
        loginP.checkForgotPassword();
    }

    @Then("should see {string} login button")
    public void shouldSeeLoginButton(String arg0) {
        loginP.checkLoginButton();
    }

    @Then("should see Phone Text Box")
    public void shouldSeePhoneTextBox() {
        loginP.checkPhonePlace();
    }

    @When("click login button")
    public void clickLoginButton() {
        loginP.clickLoginButton();
    }

    @Then("should see {string} Email Empty message")
    public void shouldSeeEmailEmptyMessage(String arg0) {
        loginP.checkError();
    }

    @Then("should see {string} Password Empty message")
    public void shouldSeePasswordEmptyMessage(String arg0) {
        loginP.checkError();

    }

    @When("type Email {string}")
    public void typeEmail(String arg0) {
        loginP.writeEmail(arg0);
    }

    @Then("should not see Email Empty message")
    public void shouldNotSeeEmailEmptyMessage() {
        loginP.emailErrorCheck();
    }

    @When("type Password {string}")
    public void typePassword(String arg0) {
        loginP.writePassword(arg0);
    }

    @Then("should not see Password Empty message")
    public void shouldNotSeePasswordEmptyMessage() {
        loginP.emailErrorCheck();
    }

    @When("type Email {string} and click login")
    public void typeEmailAndClickLogin(String arg0) {
        loginP.writeEmail(arg0);
        loginP.clickLoginButton();
    }

    @Then("should see {string} Email False message")
    public void shouldSeeEmailFalseMessage(String arg0) {
        loginP.checkError();
    }

    @When("type Email {string}, Password {string} and click login")
    public void typeEmailPasswordAndClickLogin(String arg0, String arg1) {
        loginP.writeEmail(arg0);
        loginP.writePassword(arg1);
        loginP.clickLoginButton();
    }

    @Then("should see {string} Login Error message")
    public void shouldSeeLoginErrorMessage(String arg0) {
        loginP.checkError();
    }

    @When("click Telefon radio button")
    public void clickTelefonRadioButton() {
        loginP.clickPhoneRadioButton();
    }
}
