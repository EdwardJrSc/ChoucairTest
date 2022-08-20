package co.com.utest.choucairtest.tasks;

import co.com.utest.choucairtest.userinterface.uTestSignUpLastStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CompleteFormLastStep implements Task {
    private CompleteFormLastStep completeFormLastStep;

    public static CompleteFormLastStep onThePage() {
        return Tasks.instrumented(CompleteFormLastStep.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Ch0Uc41r2022*").into(uTestSignUpLastStepPage.PASSWORD_FIELD),
                        Enter.theValue("Ch0Uc41r2022*").into(uTestSignUpLastStepPage.CONFIRM_PASSWORD_FIELD),
                        Click.on(uTestSignUpLastStepPage.CHECK_BOX_STAY),
                        Click.on(uTestSignUpLastStepPage.CHECK_BOX_TERMS),
                        Click.on(uTestSignUpLastStepPage.CHECK_BOX_SECURE_POLICY),
                        Click.on(uTestSignUpLastStepPage.BUTTON_COMPLETE_SETUP));
    }
}
