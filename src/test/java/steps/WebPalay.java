package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.WebPlaygroundHomePage;
import webdriverpool.Webdriverinitializer;

public class WebPalay {

    WebPlaygroundHomePage homePage = new WebPlaygroundHomePage(Webdriverinitializer.driver);

    @Given("User open atlas web playground page")
    public void userOpenAtlasWebPlaygroundPage() {
        homePage.openPage();
    }

    @When("User input quote {string}")
    public void userInputQuote(String quote) {
        homePage.inputQuote(quote);
    }

    @And("User select color {string}")
    public void userSelectColor(String color) {
        homePage.selectColor(color);
    }

    @And("User click button add quote")
    public void userClickButtonAddQuote() {
        homePage.clickButtonAddQuote();
    }
}
