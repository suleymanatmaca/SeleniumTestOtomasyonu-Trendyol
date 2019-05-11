package screenplay.view;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public final static Target USERNAME =
            Target.the("USERNAME").locatedBy("//*[@id=\"email\"]");
    public final static Target PASSWORD =
            Target.the("PASSWORD").locatedBy("//*[@id=\"password\"]");
    public final static Target LOGIN_BUTTON =
            Target.the("LOGIN_BUTTON").locatedBy("//*[@id=\"loginSubmit\"]");
    public final static Target FANCY =
            Target.the("FANCY").locatedBy("//*[@class=\"fancybox-overlay fancybox-overlay-fixed\"]");
}