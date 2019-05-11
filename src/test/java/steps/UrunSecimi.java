package steps;

import common.helpers.UrunKontrol;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import screenplay.view.HomePage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class UrunSecimi {

    @Then("^Rastgele bir butik seçer$")
    public void rastgeleBirButikSeçer() {
        theActorInTheSpotlight().attemptsTo(
                //WaitUntil.the(HomePage.SECILEN_BUTIK, isVisible()),
                Click.on(HomePage.SECILEN_BUTIK)
        );
    }

    @And("^Ürün görsellerini kontrol eder$")
    public void ürünGörselleriniKontrolEder(){
        UrunKontrol.kontrol();
    }

    @Then("^Herhangi bir ürünün detayına gider$")
    public void herhangiBirÜrününDetayınaGider() {
        theActorInTheSpotlight().attemptsTo(
                //WaitUntil.the(HomePage.SECILEN_URUN, isVisible()),
                Click.on(HomePage.SECILEN_URUN)
        );
    }

    @And("^Ürünü sepete ekler$")
    public void ürünüSepeteEkler() {
        theActorInTheSpotlight().attemptsTo(
                //WaitUntil.the(HomePage.SEPETE_EKLE, isVisible()),
                Click.on(HomePage.SEPETE_EKLE)
        );
    }
}
