package co.com.utest.choucairtest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class uTestLoginTodayPage extends PageObject {
    public static final Target LOGIN_TODAY_BUTTON = Target.the("button login today")
            .located(By.className("unauthenticated-nav-bar__sign-up"));
}
