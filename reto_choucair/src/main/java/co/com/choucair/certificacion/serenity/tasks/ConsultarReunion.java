package co.com.choucair.certificacion.serenity.tasks;

import co.com.choucair.certificacion.serenity.models.ReunionModels;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.choucair.certificacion.serenity.userinterfaces.ReunionUserInterfaces.*;

public class ConsultarReunion implements Task {

    private String meetingName;
    private String meetingType;
    private String meetingNumber;

    private List<ReunionModels> infoReunion;

    public ConsultarReunion(List<ReunionModels> infoReunion) {
        this.infoReunion = infoReunion;
        this.meetingName = infoReunion.get(0).getMeetingName();
        this.meetingType = infoReunion.get(0).getMeetingType();
        this.meetingNumber = infoReunion.get(0).getMeetingNumber();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Enter.theValue(meetingName).into(CAMPO_CONSULTAR_REUNION),
                WaitUntil.the(RESULTADOS_CONSULTA.of(meetingName),
                        WebElementStateMatchers.isVisible()).forNoMoreThan(60).seconds()
        );

        if(RESULTADOS_CONSULTA_NUMBER.of(meetingNumber).resolveFor(actor).isVisible() &&
        RESULTADOS_CONSULTA_TIPO.of(meetingType).resolveFor(actor).isVisible() &&
        RESULTADOS_CONSULTA.of(meetingName).resolveFor(actor).isVisible()){

            actor.remember("creacionReunion",true);
        } else {
            actor.remember("creacionReunion", false);
        }





    }

    public static ConsultarReunion consultarReunion(List<ReunionModels> infoReunion) {
        return Tasks.instrumented(ConsultarReunion.class, infoReunion);
    }
}
