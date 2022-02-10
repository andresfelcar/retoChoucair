package co.com.choucair.certificacion.serenity.tasks;

import co.com.choucair.certificacion.serenity.models.ReunionModels;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.certificacion.serenity.userinterfaces.ReunionUserInterfaces.*;

public class CrearReunion implements Task {

    private String meetingName;
    private String meetingType;
    private String meetingNumber;
    private String startDate;
    private String endDate;
    private String startTime;
    private String endTime;
    private String location;
    private String unit;
    private String organizedBy;
    private String reporter;
    private String attendeeList;
    private List<ReunionModels> infoReunion;

    public CrearReunion(List<ReunionModels> infoReunion) {
        this.infoReunion = infoReunion;
        this.meetingName = infoReunion.get(0).getMeetingName();
        this.meetingType = infoReunion.get(0).getMeetingType();
        this.meetingNumber = infoReunion.get(0).getMeetingNumber();
        this.startDate = infoReunion.get(0).getStartDate();
        this.endDate = infoReunion.get(0).getEndDate();
        this.startTime = infoReunion.get(0).getStartTime();
        this.endTime = infoReunion.get(0).getEndTime();
        this.location = infoReunion.get(0).getLocation();
        this.unit = infoReunion.get(0).getUnit();
        this.organizedBy = infoReunion.get(0).getOrganizedBy();
        this.reporter = infoReunion.get(0).getReporter();
        this.attendeeList = infoReunion.get(0).getAttendeeList();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTN_REUNION),
                Click.on(BTN_OPCION_REUNION),
                Click.on(BTN_CREAR_REUNION),
                Enter.theValue(meetingName).into(CAMPO_MEETING_NAME),
                Click.on(CAMPO_MEETING_TYPE),
                Click.on(CAMPO_MEETING_TYPE_OPCION.of(meetingType)),
                Enter.theValue(meetingNumber).into(CAMPO_MEETING_NUMBER),
                Enter.theValue(startDate).into(CAMPO_START_DATE),

                Click.on(CAMPO_START_TIME),
                Click.on(CAMPO_START_TIME_OPCION.of(startTime)),

                Enter.theValue(endDate).into(CAMPO_END_DATE),

                Click.on(CAMPO_END_TIME),
                Click.on(CAMPO_END_TIME_OPCION.of(endTime)),
                Click.on(CAMPO_LOCATION),
                Click.on(CAMPO_LOCATION_OPCION.of(location)),
                Click.on(CAMPO_UNIT),
                Click.on(CAMPO_UNIT_OPCION.of(unit)),

                Click.on(CAMPO_ORGANIZED),
                Click.on(CAMPO_ORGANIZED_OPCION.of(organizedBy)),
                Click.on(CAMPO_REPORTER),
                Click.on(CAMPO_REPORTER_OPCION.of(reporter)),
                Click.on(CAMPO_ATTENDE_LIST),
                Click.on(CAMPO_ATTENDE_LIST_OPCION.of(attendeeList)),
                Click.on(BTN_GUARDAR_REUNION)
        );


    }

    public static CrearReunion crearReunion(List<ReunionModels> infoReunion) {
        return Tasks.instrumented(CrearReunion.class, infoReunion);
    }

}
