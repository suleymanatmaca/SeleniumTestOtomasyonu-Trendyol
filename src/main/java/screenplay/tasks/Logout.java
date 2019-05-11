package screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hover;
import net.serenitybdd.screenplay.waits.WaitUntil;
import screenplay.view.HomePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class Logout implements Task {

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Hover.over(HomePage.MY_ACCOUNT),
                WaitUntil.the(HomePage.CIKIS_YAP, isPresent()),
                Click.on(HomePage.CIKIS_YAP)
        );
    }

    public static Logout logout() {
        return instrumented(Logout.class);
    }
}
