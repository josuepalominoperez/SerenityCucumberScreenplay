package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import starter.mainsteps.*;
import starter.navigation.NavigateTo;
import starter.credentials.EnterCredentials;

public class SearchStepDefinitions {

    @Given("{actor} esta mirando BXI LoginPage")
    public void actor_esta_mirando_BXI_LoginPage(Actor actor) {
        actor.wasAbleTo(NavigateTo.BXILoginPage());
    }
    @When("{actor} enters {string}")
    public void he_enters_user(Actor actor, String user) {
        actor.attemptsTo(EnterCredentials.withUser(user));
    }
    @And("{actor} types {string}")
    public void he_types_password(Actor actor, String password) {
        actor.attemptsTo(EnterCredentials.withPassword(password));
    }
    @And("{actor} switches to Posicion Global")
    public void he_switches_to_Posicion_global(Actor actor){
        actor.attemptsTo(Ubicate.PosicionGlobal());
    }

    @And("{actor} closes the modals")
    public void he_closes_the_modals(Actor actor){
        actor.attemptsTo(ClosingModals.Modals());
    }

    @And("{actor} clicks on soles account")
    public void he_clicks_on_soles_account(Actor actor){
        actor.attemptsTo(SelectAccount.SolesAccount());
    }

    @And("{actor} clicks on Operaciones")
    public void he_clicks_on_Operaciones(Actor actor){
        actor.attemptsTo(Operaciones.botonOperaciones());
    }

    @And("{actor} clicks on Realizar Transferencia")
    public void he_clicks_on_Realizar_Transferencia(Actor actor){
        actor.attemptsTo(RealizarTransferencia.botonOperaciones());
    }

    @And("{actor} clicks on Next")
    public void he_clicks_on_Next(Actor actor){
        actor.attemptsTo(Siguiente.botonSiguiente1());
    }

    @And("{actor} sends one sol")
    public void he_sends_one_sol(Actor actor){
        actor.attemptsTo(Siguiente.botonSiguiente2());
    }

    @And("{actor} confirms the operation")
    public void he_confirms_the_operation(Actor actor){
        actor.attemptsTo(Siguiente.botonSiguiente3());
    }

    @And("{actor} sees the summary")
    public void he_sees_the_summary(Actor actor){
        actor.attemptsTo(Verify.expectedText());
    }
}


