package co.com.utest.choucairtest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class uTestSignUpAddressPage extends PageObject{
    public static final Target CITY_FIELD = Target.the("Where do we write city")
            .located(By.id("city"));
    public static final Target ZIP_FIELD = Target.the("Where do we write zip code")
            .located(By.id("zip"));
    public static final Target DIV_COUNTRY_FIELD = Target.the("where do we select de country")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]"));
    public static final Target COUNTRY_FIELD = Target.the("where do we select de country")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target BUTTON_DEVICES = Target.the("Button Devices")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/div"));
    public static final Target COUNTRY_SELECTED = Target.the("Country selected")
            .located(By.className("ui-select-choices-row-inner"));

}
