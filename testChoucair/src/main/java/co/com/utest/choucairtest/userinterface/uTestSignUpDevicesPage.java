package co.com.utest.choucairtest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class uTestSignUpDevicesPage extends PageObject {
    public static final Target DIV_MOBILE_DEVICE_FIELD = Target.the("Where we do click on mobile devices")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/div[1]"));
    public static final Target INPUT_MOBILE_DEVICE_FIELD = Target.the("Where we do write the smartphone brand")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/input[1]"));
    public static final Target SELECTED_BRAND_DEVICE = Target.the("Where we do click the smartphone brand")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/ul/li/div[3]/span"));
    public static final Target DIV_MODEL_DEVICE = Target.the("Where we do click the smartphone model")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/div[1]/span"));
    public static final Target INPUT_MODEL_DEVICE = Target.the("Where we do write the smartphone model")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/input[1]"));
    public static final Target SELECTED_MODEL_DEVICE = Target.the("Where we do click on selected the smartphone brand")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/ul/li/div[3]/span"));
    public static final Target DIV_OS_DEVICE = Target.the("Where we do click the smartphone OS")
            .located(By.xpath("//html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[1]"));
    public static final Target INPUT_OS_DEVICE = Target.the("Where we do write the smartphone OS")
            .located(By.xpath("//html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/input[1]"));
    public static final Target SELECTED_OS_DEVICE = Target.the("Where we do click the smartphone OS")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/ul/li/div[3]/span"));
    public static final Target BUTTON_LAST_STEP = Target.the("Button Last Step")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[2]/div/a"));
}
