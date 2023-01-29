package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.navigation.NavigateTo;
import starter.navigation.ToDoListHomePage;
import starter.search.AddAnItem;

public class SearchStepDefinitions {

    @Given("{actor} está mirando el TODO list")
    public void actor_está_mirando_el_todo_list(Actor actor) {
        actor.wasAbleTo(NavigateTo.theToDoListHomePage());
    }
    @When("{actor} agrega {string} a su lista")
    public void he_agrega_a_su_lista(Actor actor, String itemName) {
        actor.attemptsTo(AddAnItem.withName(itemName));
    }
    @Then("{actor} observa {string} como un elemento en su TODO list")
    public void he_observa_como_un_elemento_en_su_todo_list(Actor actor, String expectedItemName) {
        actor.attemptsTo(Ensure.that(ToDoListHomePage.ITEMS_LIST).hasText(expectedItemName));
    }
}
