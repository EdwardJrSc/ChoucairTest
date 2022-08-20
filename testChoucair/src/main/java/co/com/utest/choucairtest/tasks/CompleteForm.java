package co.com.utest.choucairtest.tasks;

import co.com.utest.choucairtest.userinterface.uTestSignUpPersonalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class CompleteForm implements Task {
    private uTestSignUpPersonalPage uTestSignUpPersonalPage;
    public static CompleteForm onThePage() {
        return Tasks.instrumented(CompleteForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Edward").into(uTestSignUpPersonalPage.FIRST_NAME_FIELD),
                        Enter.theValue("Sierra").into(uTestSignUpPersonalPage.LAST_NAME_FIELD),
                        Enter.theValue("testchoucair@outlook.com").into(uTestSignUpPersonalPage.EMAIL_FIELD),
                        SelectFromOptions.byVisibleText("October").from(uTestSignUpPersonalPage.MONTH_FIELD),
                        SelectFromOptions.byVisibleText("14").from(uTestSignUpPersonalPage.DAY_FIELD),
                        SelectFromOptions.byVisibleText("1995").from(uTestSignUpPersonalPage.YEAR_FIELD),
                        Click.on(uTestSignUpPersonalPage.BUTTON_LOCATION));
    }
}
