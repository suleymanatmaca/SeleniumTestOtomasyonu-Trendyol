package steps;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import common.helpers.ButikKontrol;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import screenplay.view.HomePage;

public class TabButikKontrol {
    @Then("^KADIN tabına basar$")
    public void kadin_Tabına_Basar() {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(HomePage.TAB_KADIN, isVisible()),
                Click.on(HomePage.TAB_KADIN)
        );
    }

    @And("^Butik imajları kontrol eder$")
    public void butik_Imajları_Kontrol_Eder() {
        ButikKontrol.kontrol();
    }

    @Then("^ERKEK tabına basar$")
    public void erkek_Tabına_Basar() {
        theActorInTheSpotlight().attemptsTo(
                //WaitUntil.the(HomePage.TAB_ERKEK, isVisible()),
                Click.on(HomePage.TAB_ERKEK)
        );
    }

    @Then("^ÇOCUK tabına basar$")
    public void çocukTabınaBasar() {
        theActorInTheSpotlight().attemptsTo(
                //WaitUntil.the(HomePage.TAB_COCUK, isVisible()),
                Click.on(HomePage.TAB_COCUK)
        );
    }

    @Then("^AYAKKABI & ÇANTA tabına basar$")
    public void ayakkabiÇANTATabınaBasar() {
        theActorInTheSpotlight().attemptsTo(
                //WaitUntil.the(HomePage.TAB_AYAKKABCANTA, isVisible()),
                Click.on(HomePage.TAB_AYAKKABCANTA)
        );
    }

    @Then("^SAAT & AKSESUAR tabına basar$")
    public void saatAKSESUARTabınaBasar() {
        theActorInTheSpotlight().attemptsTo(
                //WaitUntil.the(HomePage.TAB_SAAT_AKSESUAR, isVisible()),
                Click.on(HomePage.TAB_SAAT_AKSESUAR)
        );
    }

    @Then("^KOZMETİK tabına basar$")
    public void kozmeti̇kTabınaBasar() {
        theActorInTheSpotlight().attemptsTo(
                //WaitUntil.the(HomePage.TAB_KOZMETIK, isVisible()),
                Click.on(HomePage.TAB_KOZMETIK)
        );
    }

    @Then("^EV & YAŞAM tabına basar$")
    public void evYAŞAMTabınaBasar() {
        theActorInTheSpotlight().attemptsTo(
                //WaitUntil.the(HomePage.TAB_EV_YASAM, isVisible()),
                Click.on(HomePage.TAB_EV_YASAM)
        );
    }

    @Then("^ELEKTRONİK tabına basar$")
    public void elektroni̇kTabınaBasar() {
        theActorInTheSpotlight().attemptsTo(
                //WaitUntil.the(HomePage.TAB_ELEKTRONIK, isVisible()),
                Click.on(HomePage.TAB_ELEKTRONIK)
        );
    }

    @Then("^SÜPERMARKET tabına basar$")
    public void süpermarketTabınaBasar() {
        theActorInTheSpotlight().attemptsTo(
                //WaitUntil.the(HomePage.TAB_SUPERMARKET, isVisible()),
                Click.on(HomePage.TAB_SUPERMARKET)
        );
    }
}
