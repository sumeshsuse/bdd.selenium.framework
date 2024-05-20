package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import manager.Testcontext;
import pageobject.LoginPageObject;

public class LoginStepDefinition {

    public Testcontext tx;
    public LoginPageObject loginStepDefinition;

    public LoginStepDefinition(Testcontext testcontext){
       tx = testcontext;
       loginStepDefinition = tx.getPagemanager().getLoginPageObject();
    }

    @Given("Launch the wiki page")
    public void launch_the_wiki_page() {
        System.out.println("Test!!!!");
       loginStepDefinition.launchURL();
    }
    @Given("click on the login button")
    public void click_on_the_login_button() {

    }
    @Then("enter the username and passowrd of the login page and click on submit")
    public void enter_the_username_and_passowrd_of_the_login_page_and_click_on_submit() {

    }
    @Then("validate the login page")
    public void validate_the_login_page() {

    }
}
