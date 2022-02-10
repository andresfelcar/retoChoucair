package co.com.choucair.certificacion.serenity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUserInterface {

    public static final Target CAMPO_USUARIO = Target.the("campo para ingresar el usuario")
            .located(By.id("StartSharp_Membership_LoginPanel0_Username"));
    public static final Target CAMPO_CONTRASENA = Target.the("campo para ingresar la contrasena")
            .located(By.id("StartSharp_Membership_LoginPanel0_Password"));
    public static final Target BTN_INGRESAR = Target.the("boton para loguearse")
            .located(By.id("StartSharp_Membership_LoginPanel0_LoginButton"));

}
