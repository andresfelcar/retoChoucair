package co.com.choucair.certificacion.serenity.tasks;

import co.com.choucair.certificacion.serenity.models.LoginModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import java.util.List;

import static co.com.choucair.certificacion.serenity.userinterfaces.LoginUserInterface.*;

public class LoguearseConLosDatos implements Task {

    private String usuario;
    private String contrasena;
    private List<LoginModel> datosLogin;

    public LoguearseConLosDatos(List<LoginModel> datosLogin){
        this.datosLogin=datosLogin;
        this.usuario=datosLogin.get(0).getUsuario();
        this.contrasena=datosLogin.get(0).getContrasena();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(usuario).into(CAMPO_USUARIO),
                Enter.theValue(contrasena).into(CAMPO_CONTRASENA),
                Click.on(BTN_INGRESAR)
        );

    }

    public static LoguearseConLosDatos loguearse(List<LoginModel> datosLogin){
        return Tasks.instrumented(LoguearseConLosDatos.class,datosLogin);
    }

}
