package steps;

import common.helpers.DataHelper;
import common.pojo.User;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import screenplay.questions.Application;
import screenplay.tasks.Login;
import screenplay.tasks.Logout;
import screenplay.view.HomePage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.ConsequenceMatchers.displays;
import static org.hamcrest.Matchers.equalTo;

public class SigninSignoutSteps {

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*), Trendyol anasayfasını açar$")
    public void kullanıcı_Trendyol_Anasayfasını_Açar(String actorName) throws Throwable {
        theActorCalled(actorName).wasAbleTo(screenplay.tasks.Start.withHomePage());
    }

    @When("^Kullanıcı, çıkış yapar$")
    public void kullanıcı_Çıkış_Yapar() throws Throwable {
        theActorInTheSpotlight().attemptsTo(
                Logout.logout()
        );
    }

    @When("^([^\\\"]*) ve ([^\\\"]*) ile sisteme giriş yapar$")
    public void kullanıcıadı_Ve_Şifre_Ile_Sisteme_Giriş_Yapar(String username, String password) throws Throwable {
        theActorInTheSpotlight().attemptsTo(
                Login.login(new User(username, password))
        );
    }

    @Then("^Kullanıcı, Trendyol ([^\\\"]*) ve ([^\\\"]*) bilgisini görür$")
    public void kullanıcı_Trendyol_Anasayfasını_Görür(String title, String signIn) throws Throwable {
        theActorInTheSpotlight().should(
                seeThat(Application.information(),
                        displays("title", equalTo(DataHelper.getDataParameter(title))),
                        displays("signIn", equalTo(DataHelper.getDataParameter(signIn)))
                )
        );
    }

    @And("^Giriş yap butonuna basar$")
    public void giriş_Yap_Butonuna_Basar() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(HomePage.SIGNIN_BUTTON)
        );
    }

    @Then("^Çıkan reklam kapatılır$")
    public void çıkan_Reklam_Kapatılır() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(HomePage.REKLAM_KAPAT)
        );
    }
}
