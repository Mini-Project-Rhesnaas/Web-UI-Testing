package starter.stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import starter.helpers.DoActionAltaShop;
import starter.helpers.NavigateToAltaShop;

public class StepDefinitionAltaShop {

    Faker faker = new Faker();

    @Given("{actor} on login page")
    public void userOnLoginPage(Actor actor) {
        actor.wasAbleTo(NavigateToAltaShop.theAltaShopLoginPage());
    }

    @When("{actor} input valid email {string}")
    public void userInputValidEmail(Actor actor, String email) {
        actor.attemptsTo(DoActionAltaShop.fillEmail(email));
    }

    @And("{actor} input valid password {string}")
    public void userInputValidPassword(Actor actor, String password) {
        actor.attemptsTo(DoActionAltaShop.fillPassword(password));
    }

    @And("{actor} click login button")
    public void userClickLoginButton(Actor actor) {
        actor.attemptsTo(DoActionAltaShop.clickLoginButton());
    }

    @Then("{actor} on home page")
    public void userOnHomePage(Actor actor) {

    }

    @And("{actor} click profile icon")
    public void userClickProfileIcon(Actor actor) {
        actor.attemptsTo(DoActionAltaShop.clickProfileButton());
    }

    @Then("{actor} click logout button")
    public void userClickLogoutButton(Actor actor) {
        actor.attemptsTo(DoActionAltaShop.clickLogoutButton());
    }

    @When("{actor} click register menu")
    public void userClickRegisterMenu(Actor actor) {
        actor.attemptsTo(DoActionAltaShop.clickRegisterMenu());
    }

    @And("{actor} input full name")
    public void userInputFullName(Actor actor) {
        actor.attemptsTo(DoActionAltaShop.fillFullName(faker.gameOfThrones().character()));
    }

    @And("{actor} input email")
    public void userInputEmail(Actor actor) {
        actor.attemptsTo(DoActionAltaShop.fillEmailRegister(faker.internet().emailAddress()));
    }

    @And("{actor} input password {string}")
    public void userInputPassword(Actor actor, String passRegis) {
        actor.attemptsTo(DoActionAltaShop.fillPasswordRegister(passRegis));
    }

    @Then("{actor} click register button")
    public void userClickRegisterButton(Actor actor) {
        actor.attemptsTo(DoActionAltaShop.clickRegisterButton());
    }

    @Then("{actor} click detail button")
    public void userClickDetailButton(Actor actor) {
        actor.attemptsTo(DoActionAltaShop.clickDetailButton());
    }

    @And("{actor} click buy button")
    public void userClickBuyButton(Actor actor) {
        actor.attemptsTo(DoActionAltaShop.clickBuyButton());
    }

    @And("{actor} click cart icon")
    public void userClickCartIcon(Actor actor) {
        actor.attemptsTo(DoActionAltaShop.clickCartButton());
    }

    @Then("{actor} click pay button")
    public void userClickPayButton(Actor actor) {
        actor.attemptsTo(DoActionAltaShop.clickPayButton());
    }

    @Then("{actor} click rating")
    public void userClickRatingOf(Actor actor) {
        actor.attemptsTo(DoActionAltaShop.clickRatings());
    }

    @When("{actor} input invalid email {string}")
    public void userInputInvalidEmail(Actor actor, String email) {
        actor.attemptsTo(DoActionAltaShop.fillEmail(email));
    }

    @And("{actor} input invalid password {string}")
    public void userInputInvalidPassword(Actor actor, String password) {
        actor.attemptsTo(DoActionAltaShop.fillPassword(password));
    }

    @Then("{actor} cant login")
    public void userCantLogin(Actor actor) {

    }
}
