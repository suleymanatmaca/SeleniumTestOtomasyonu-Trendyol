package screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Text;
import screenplay.model.ApplicationInformation;
import screenplay.view.HomePage;

import static net.serenitybdd.screenplay.questions.ValueOf.the;

public class Application implements Question<ApplicationInformation> {

    @Override
    public ApplicationInformation answeredBy(Actor actor) {
        String title = BrowseTheWeb.as(actor).getTitle();
        String signIn = the(Text.of(HomePage.SIGNIN_BUTTON).viewedBy(actor));

        return new ApplicationInformation(title, signIn);
    }

    public static Application information() {
        return new Application();
    }
}