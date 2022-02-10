package co.com.choucair.certificacion.serenity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BusinessUnitsUserInterface {

    public static final Target BTN_CREAR_BUSINESS_UNIT = Target.the("boton para crear una business unit")
            .locatedBy("//div[@id='GridDiv']/div[2]/div[2]/div/div/div[1]/div");

    public static final Target CAMPO_NOMBRE = Target.the("campo para ingresar el nombre del business")
            .located(By.id("Serenity_Pro_Organization_BusinessUnitDialog3_Name"));

    public static final Target PARENT_UNIT = Target.the("campo para ingresar el parent unit")
            .located(By.xpath("//*[@id='s2id_Serenity_Pro_Organization_BusinessUnitDialog3_ParentUnitId']/a"));

    public static final Target PARENT_UNIT_OPCION = Target.the("campo para ingresar el parent unit")
            .locatedBy("//*[@id='select2-results-1']//li//div[contains(text(),'{0}')]");

    public static final Target BTN_GUARDAR = Target.the("boton para guardar la business unit")
            .located(By.xpath("//*[@id='Serenity_Pro_Organization_BusinessUnitDialog3_Toolbar']/div/div/div/div[1]/div"));

    public static final Target TXT_BUSINESS = Target.the("texto del business creado")
            .locatedBy("//*[@id='GridDiv']/div[3]/div[4]/div[3]/div/div/div[2]/a[contains(text(),'{0}')]");
}
