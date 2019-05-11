package screenplay.view;

import net.serenitybdd.screenplay.targets.Target;
import org.apache.tools.ant.taskdefs.Tar;

public class HomePage {
    public final static Target SIGNIN_BUTTON =
            Target.the("SIGNIN_BUTTON").locatedBy("//*[@class=\"login-container\"]");
   public final static Target REKLAM_KAPAT =
            Target.the("REKLAM_KAPAT").locatedBy("//*[@class=\"fancybox-item fancybox-close\"]");

    public final static Target TAB_KADIN =
            Target.the("TAB_KADIN").locatedBy("//div/ul/li[@name=\"KADIN\"]");
    public final static Target TAB_ERKEK =
            Target.the("TAB_ERKEK").locatedBy("//div/ul/li[@name=\"ERKEK\"]");
    public final static Target TAB_COCUK =
            Target.the("TAB_COCUK").locatedBy("//div/ul/li[@name=\"ÇOCUK\"]");
    public final static Target TAB_AYAKKABCANTA =
            Target.the("TAB_AYAKKABI_CANTA").locatedBy("//div/ul/li[@name=\"AYAKKABI & ÇANTA\"]");
    public final static Target TAB_SAAT_AKSESUAR =
            Target.the("TAB_SAAT_AKSESUAR").locatedBy("//div/ul/li[@name=\"SAAT & AKSESUAR\"]");
    public final static Target TAB_KOZMETIK =
            Target.the("TAB_KOZMETIK").locatedBy("//div/ul/li[@name=\"KOZMETİK\"]");
    public final static Target TAB_EV_YASAM =
            Target.the("TAB_EV_YASAM").locatedBy("//div/ul/li[@name=\"EV & YAŞAM\"]");
    public final static Target TAB_ELEKTRONIK =
            Target.the("TAB_ELEKTRONIK").locatedBy("//div/ul/li[@name=\"ELEKTRONİK\"]");
    public final static Target TAB_SUPERMARKET =
            Target.the("TAB_SUPERMARKET").locatedBy("//div/ul/li[@name=\"SÜPERMARKET\"]");
    public final static Target SECILEN_BUTIK =
            Target.the("SECILEN_BUTIK").locatedBy("(//*[@class=\"butik-large-image\"])[3]");
 public final static Target SECILEN_URUN =
         Target.the("SECILEN_URUN").locatedBy("(//*[@class='product'])[2]");
 public final static Target SEPETE_EKLE =
         Target.the("SEPETE_EKLE").locatedBy("//*[@class='pr-in-btn add-to-bs']");
public final static Target CIKIS_YAP =
        Target.the("CIKIS_YAP").locatedBy("//*[@id=\"logged-in-container\"]/div/div[5]/a");
 public final static Target MY_ACCOUNT =
        Target.the("MY_ACCOUNT").locatedBy("//*[@class='icon-container']");
}
