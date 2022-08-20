package co.com.utest.choucairtest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class uTestSignUpPersonalPage extends PageObject {
    public static final Target FIRST_NAME_FIELD = Target.the("Where do we write first name")
            .located(By.id("firstName"));
    public static final Target LAST_NAME_FIELD = Target.the("Where do we write last name")
            .located(By.id("lastName"));
    public static final Target EMAIL_FIELD = Target.the("Where do we write email address")
            .located(By.id("email"));
    public static final Target MONTH_FIELD = Target.the("Where do we write birth month")
            .located(By.id("birthMonth"));
    public static final Target DAY_FIELD = Target.the("Where do we write birth day")
            .located(By.id("birthDay"));
    public static final Target YEAR_FIELD = Target.the("Where do we write birth year")
            .located(By.id("birthYear"));
    public static final Target BUTTON_LOCATION = Target.the("Button Location")
            .located(By.xpath("//a[@class='btn btn-blue']"));

}
