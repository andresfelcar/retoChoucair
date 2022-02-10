package co.com.choucair.certificacion.serenity.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarCreacionReunion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return actor.recall("creacionReunion");
    }

    public static ValidarCreacionReunion validarCreacionReunion(){
        return new ValidarCreacionReunion();
    }
}
