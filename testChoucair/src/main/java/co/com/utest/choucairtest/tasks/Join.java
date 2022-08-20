package co.com.utest.choucairtest.tasks;


import co.com.utest.choucairtest.userinterface.uTestLoginTodayPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Join implements Task{
    public static Join onThePage() {
        return Tasks.instrumented(Join.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(uTestLoginTodayPage.LOGIN_TODAY_BUTTON));
    }
}
