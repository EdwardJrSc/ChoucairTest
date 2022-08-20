package co.com.utest.choucairtest.tasks;

import co.com.utest.choucairtest.userinterface.uTestSignUpAddressPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CompleteFormLocation implements Task {
    private uTestSignUpAddressPage uTestSignUpAddressPage;

    public static CompleteFormLocation onThePage() {
        return Tasks.instrumented(CompleteFormLocation.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Barranquilla").into(uTestSignUpAddressPage.CITY_FIELD),
                        Enter.theValue("080001").into(uTestSignUpAddressPage.ZIP_FIELD),
                        Click.on(uTestSignUpAddressPage.DIV_COUNTRY_FIELD),
                        Enter.theValue("Colombia").into(uTestSignUpAddressPage.COUNTRY_FIELD),
                        Click.on(uTestSignUpAddressPage.COUNTRY_SELECTED),
                        Click.on(uTestSignUpAddressPage.BUTTON_DEVICES));


    }
}
