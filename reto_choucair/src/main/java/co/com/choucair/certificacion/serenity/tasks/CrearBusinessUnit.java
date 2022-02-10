package co.com.choucair.certificacion.serenity.tasks;

import co.com.choucair.certificacion.serenity.models.BusinessUnitModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;

import java.util.List;

import static co.com.choucair.certificacion.serenity.userinterfaces.BusinessUnitsUserInterface.*;
import static co.com.choucair.certificacion.serenity.userinterfaces.PaginaPrincipalUserInterface.*;


public class CrearBusinessUnit implements Task {

    private String nombre;
    private String parentUnit;
    private List<BusinessUnitModel> datosBusiness;

    public CrearBusinessUnit(List<BusinessUnitModel> datosBusiness){
        this.datosBusiness=datosBusiness;
        this.nombre=datosBusiness.get(0).getNombre();
        this.parentUnit=datosBusiness.get(0).getParentUnit();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                WaitUntil.the(BTN_BUSINESS_ORGANIZATION, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_BUSINESS_ORGANIZATION),
                Click.on(BTN_BUSINESS_UNITS),
                WaitUntil.the(BTN_CREAR_BUSINESS_UNIT,WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_CREAR_BUSINESS_UNIT),
                Enter.theValue(nombre).into(CAMPO_NOMBRE),
                Click.on(PARENT_UNIT),
                Click.on(PARENT_UNIT_OPCION.of(parentUnit)),
                Click.on(BTN_GUARDAR),
                WaitUntil.the(TXT_BUSINESS.of("Reto_Choucair"),WebElementStateMatchers.isVisible()).forNoMoreThan(60).seconds()


                );

         if(TXT_BUSINESS.of(nombre).resolveFor(actor).isVisible()){
             actor.remember("businessUnit",true);
         }else{
             actor.remember("businessUnit",false);
         }

    }

    public static CrearBusinessUnit crearBusinessUnit(List<BusinessUnitModel> datosBusiness){
        return Tasks.instrumented(CrearBusinessUnit.class,datosBusiness);
    }

}
