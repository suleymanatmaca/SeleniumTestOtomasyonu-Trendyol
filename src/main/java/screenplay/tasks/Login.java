package screenplay.tasks;

import common.helpers.DataHelper;
import common.pojo.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import screenplay.view.HomePage;
import screenplay.view.LoginPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class Login implements Task {
    private final User user;

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(DataHelper.getDataParameter(user.getUserName())).into(LoginPage.USERNAME),
                Enter.theValue(DataHelper.getDataParameter(user.getPassword())).into(LoginPage.PASSWORD),
                WaitUntil.the(LoginPage.LOGIN_BUTTON,isEnabled()),
                Click.on(LoginPage.LOGIN_BUTTON),
                WaitUntil.the(LoginPage.FANCY,isNotVisible())
        );
    }

    public static Login login(User user) {
        return instrumented(Login.class, user);
    }

    public Login(User user) {
        this.user = user;
    }
}
