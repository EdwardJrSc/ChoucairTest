package co.com.utest.choucairtest.tasks;

import co.com.utest.choucairtest.userinterface.uTestSignUpDevicesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CompleteFormDevices implements Task{
    private uTestSignUpDevicesPage uTestSignUpDevicesPage;

    public static CompleteFormDevices onThePage () {
        return Tasks.instrumented(CompleteFormDevices.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(uTestSignUpDevicesPage.DIV_MOBILE_DEVICE_FIELD),
                Enter.theValue("Samsung").into(uTestSignUpDevicesPage.INPUT_MOBILE_DEVICE_FIELD),
                Click.on(uTestSignUpDevicesPage.SELECTED_BRAND_DEVICE),
                Click.on(uTestSignUpDevicesPage.DIV_MODEL_DEVICE),
                Enter.theValue("Galaxy A30s").into(uTestSignUpDevicesPage.INPUT_MODEL_DEVICE),
                Click.on(uTestSignUpDevicesPage.SELECTED_MODEL_DEVICE),
                Click.on(uTestSignUpDevicesPage.DIV_OS_DEVICE),
                Enter.theValue("Android 11").into(uTestSignUpDevicesPage.INPUT_OS_DEVICE),
                Click.on(uTestSignUpDevicesPage.SELECTED_OS_DEVICE),
                Click.on(uTestSignUpDevicesPage.BUTTON_LAST_STEP));

    }
}
