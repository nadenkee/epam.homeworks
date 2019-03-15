package lessons.lesson6.steps;


import homeworks.hw6.pages.SelenideIndexPage;
import homeworks.enums.User;
import cucumber.api.java.en.When;

public class ActionSteps {

    @When("^I login as user '([^\"]*)' with password '([^\"]*)'$")
    public void iLoginAsUserWithPassword(String username, String password) {
        new SelenideIndexPage().login(username, password);
    }

    @When("^I login as user '([^\"]*)'$")
    public void iLoginAsUser(User user) {
        new SelenideIndexPage().login(user);
    }

}