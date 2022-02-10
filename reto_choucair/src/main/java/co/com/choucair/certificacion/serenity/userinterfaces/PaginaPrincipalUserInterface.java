package co.com.choucair.certificacion.serenity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaPrincipalUserInterface {

    public static final Target BTN_BUSINESS_UNITS = Target.the("boton business units")
            .locatedBy("//*[@id='nav_menu1_3_1']/li[1]/a");
    public static final Target BTN_BUSINESS_ORGANIZATION = Target.the("boton organization")
            .locatedBy("//ul[@id='nav_menu1_3']/li[1]/a");

}
