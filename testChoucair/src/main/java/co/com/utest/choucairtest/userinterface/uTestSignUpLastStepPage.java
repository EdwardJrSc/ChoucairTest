package co.com.utest.choucairtest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class uTestSignUpLastStepPage extends PageObject {
    public static final Target PASSWORD_FIELD = Target.the("Where do we write the password")
            .located(By.id("password"));
    public static final Target CONFIRM_PASSWORD_FIELD = Target.the("Where do we to write the confirmed password")
            .located(By.id("confirmPassword"));
    public static final Target CHECK_BOX_STAY = Target.the("Where do we to select stay informed")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/input"));
    public static final Target CHECK_BOX_TERMS = Target.the("Where do we to select terms of use")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/input"));
    public static final Target CHECK_BOX_SECURE_POLICY = Target.the("Where do we to select secure policy")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/input"));
    public static final Target BUTTON_COMPLETE_SETUP = Target.the("Button complete set up")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));
}

