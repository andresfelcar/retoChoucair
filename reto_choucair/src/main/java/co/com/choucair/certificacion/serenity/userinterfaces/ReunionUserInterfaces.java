package co.com.choucair.certificacion.serenity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ReunionUserInterfaces {

    public static final Target BTN_REUNION = Target.the("boton reunion")
            .located(By.xpath("//*[@id='nav_menu1_3']/li[2]/a"));
    public static final Target BTN_OPCION_REUNION = Target.the("boton para tipo reunion")
            .located(By.xpath("//*[@id='nav_menu1_3_2']/li[1]/a"));
    public static final Target BTN_CREAR_REUNION = Target.the("boton para crear reunion")
            .located(By.xpath("(//div[@class='button-outer'])[1]"));


    public static final Target CAMPO_MEETING_NAME = Target.the("campo para ingresar la informacion")
            .located(By.id("Serenity_Pro_Meeting_MeetingDialog10_MeetingName"));

    public static final Target CAMPO_MEETING_TYPE = Target.the("campo para ingresar la informacion")
            .located(By.id("s2id_Serenity_Pro_Meeting_MeetingDialog10_MeetingTypeId"));
    public static final Target CAMPO_MEETING_TYPE_OPCION = Target.the("campo para ingresar la informacion")
            .locatedBy("//ul[@id='select2-results-6']//li//div[contains(text(),'{0}')]");


    public static final Target CAMPO_MEETING_NUMBER = Target.the("campo para ingresar la informacion")
            .located(By.id("Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber"));

    public static final Target CAMPO_START_DATE = Target.the("campo para ingresar la informacion")
            .located(By.id("Serenity_Pro_Meeting_MeetingDialog10_StartDate"));

    public static final Target CAMPO_END_DATE = Target.the("campo para ingresar la informacion")
            .located(By.xpath("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_EndDate']"));

    public static final Target CAMPO_START_TIME = Target.the("campo para ingresar la informacion")
            .locatedBy("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid']/div/div/div[4]/select");

    public static final Target CAMPO_START_TIME_OPCION = Target.the("campo para ingresar la informacion")
            .locatedBy("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid']/div/div/div[4]/select/option[contains(text(),'{0}')]");

    public static final Target CAMPO_END_TIME = Target.the("campo para ingresar la informacion")
            .locatedBy("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid']/div/div/div[4]/select");


    public static final Target CAMPO_END_TIME_OPCION = Target.the("campo para ingresar la informacion")
            .locatedBy("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid']/div/div/div[5]/select/option[contains(text(),'{0}')]");

    public static final Target CAMPO_LOCATION = Target.the("campo para ingresar la informacion")
            .located(By.id("s2id_Serenity_Pro_Meeting_MeetingDialog10_LocationId"));
    public static final Target CAMPO_LOCATION_OPCION = Target.the("campo para ingresar la informacion")
            .locatedBy("//div[@id='select2-drop']//ul//li//div[contains(text(),'{0}')]");

    public static final Target CAMPO_UNIT = Target.the("campo para ingresar la informacion")
            .located(By.id("s2id_Serenity_Pro_Meeting_MeetingDialog10_UnitId"));
    public static final Target CAMPO_UNIT_OPCION = Target.the("campo para ingresar la informacion")
            .locatedBy("//div[@id='select2-drop']/ul//li/div[contains(text(),'{0}')]");

    public static final Target CAMPO_ORGANIZED = Target.the("campo para ingresar la informacion")
            .located(By.id("s2id_Serenity_Pro_Meeting_MeetingDialog10_OrganizerContactId"));

    public static final Target CAMPO_ORGANIZED_OPCION = Target.the("campo para ingresar la informacion")
            .locatedBy("//div[@id='select2-drop']//ul//li//div[contains(text(),'{0}')]");

    public static final Target CAMPO_REPORTER = Target.the("campo para ingresar la informacion")
            .located(By.id("s2id_Serenity_Pro_Meeting_MeetingDialog10_ReporterContactId"));
    public static final Target CAMPO_REPORTER_OPCION = Target.the("campo para ingresar la informacion")
            .locatedBy("//div[@id='select2-drop']/ul//li/div[contains(text(),'{0}')]");


    public static final Target CAMPO_ATTENDE_LIST = Target.the("campo para ingresar la informacion")
            .located(By.xpath("//*[@id='s2id_autogen11']/a"));
    public static final Target CAMPO_ATTENDE_LIST_OPCION = Target.the("campo para ingresar la informacion")
            .locatedBy("//div[@id='select2-drop']//ul/li/div[contains(text(),'{0}')]");


    public static final Target BTN_GUARDAR_REUNION = Target.the("boton para crear reunion")
            .located(By.xpath("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_Toolbar']/div/div/div/div[1]/div/span"));

    public static final Target CAMPO_CONSULTAR_REUNION = Target.the("campo para consultar")
            .located(By.xpath("//*[@id='GridDiv']/div[2]/div[1]/input"));

    public static final Target RESULTADOS_CONSULTA = Target.the("campo para consultar")
            .locatedBy("//*[@id='GridDiv']/div[3]/div[4]/div[3]//div/div//div[2]/a[contains(text(),'{0}')]");

    public static final Target RESULTADOS_CONSULTA_NUMBER = Target.the("campo para consultar")
            .locatedBy("//*[@id='GridDiv']/div[3]/div[4]/div[3]//div/div//div[3][contains(text(),'{0}')]");

    public static final Target RESULTADOS_CONSULTA_TIPO = Target.the("campo para consultar")
            .locatedBy("//*[@id='GridDiv']/div[3]/div[4]/div[3]//div/div//div[4][contains(text(),'{0}')]");






}
