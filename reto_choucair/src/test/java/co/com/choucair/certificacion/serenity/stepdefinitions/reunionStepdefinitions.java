package co.com.choucair.certificacion.serenity.stepdefinitions;

import co.com.choucair.certificacion.serenity.models.BusinessUnitModel;
import co.com.choucair.certificacion.serenity.models.LoginModel;
import co.com.choucair.certificacion.serenity.models.ReunionModels;
import co.com.choucair.certificacion.serenity.questions.ValidarCreacionReunion;
import co.com.choucair.certificacion.serenity.tasks.ConsultarReunion;
import co.com.choucair.certificacion.serenity.tasks.CrearBusinessUnit;
import co.com.choucair.certificacion.serenity.tasks.CrearReunion;
import co.com.choucair.certificacion.serenity.tasks.LoguearseConLosDatos;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class reunionStepdefinitions {

    @Managed
    WebDriver driver;

    @Before
    public void configuracion() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(driver)));
        OnStage.theActorCalled("Usuario");
    }

    @Given("^el usuario ingresa a la pagina$")
    public void elUsuarioIngresaALaPagina() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://serenity.is/demo/Account/Login/?ReturnUrl=%2Fdemo%2F"));
    }

    @When("^el usuario se loguea con los datos$")
    public void elUsuarioSeLogueaConLosDatos(List<LoginModel> datosLogin) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoguearseConLosDatos.loguearse(datosLogin)
        );
    }

    @And("^el usuario crea una business unit con los datos$")
    public void elUsuarioCreaUnaBusinessUnitConLosDatos(List<BusinessUnitModel> datosBusiness) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                CrearBusinessUnit.crearBusinessUnit(datosBusiness));
    }
    @And("^el usuario crea la reunion con los datos$")
    public void elUsuarioCreaLaReunionConLosDatos(List<ReunionModels> infoReunion) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                CrearReunion.crearReunion(infoReunion), ConsultarReunion.consultarReunion(infoReunion)
        );
    }
    @Then("^el usuario vera la reunion$")
    public void elUsuarioVeraLaReunion() {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                ValidarCreacionReunion.validarCreacionReunion(), Matchers.is(true)
        ));

    }
}
