package screenplay.tasks;

import common.helpers.Util;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import screenplay.actions.Refresh;
import screenplay.view.ApplicationHomePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Start implements Task {
    private ApplicationHomePage applicationHomePage;

    public <T extends Actor> void performAs(T actor) {
        applicationHomePage.setDefaultBaseUrl(Util.getProperty("URL"));

        actor.attemptsTo(
                Open.browserOn().the(applicationHomePage),
                Refresh.theBrowserSession()
        );
    }

    public static Start withHomePage() {
        return instrumented(Start.class);
    }
}
