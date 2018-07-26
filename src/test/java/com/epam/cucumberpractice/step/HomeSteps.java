package com.epam.cucumberpractice.step;

import com.epam.cucumberpractice.component.Home;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class HomeSteps {

    @Autowired
    Home home;

    @Given("^I open pn\\.com\\.ua$")
    public void shouldOpenMainPage() throws Throwable {
        home.open();
    }

    @When("^I select category \"(.*?)\"$")
    public void shoulSelectCategory(String cat) throws Throwable {
        home.getCategoty(cat).click();
    }

}
