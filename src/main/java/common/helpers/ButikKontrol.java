package common.helpers;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ButikKontrol {
    public static void kontrol() {
        WebElementFacade butikTable;
        List<WebElementFacade> rowButiks;

        butikTable = Target.the("butikTable").

                locatedBy("//*[@id=\"container\"]").

                resolveAllFor(theActorInTheSpotlight()).

                get(0);

        rowButiks = butikTable.thenFindAll(By.xpath("//*[img[contains(@class, 'error')]]"));//error

        String getAttributeTitle;
        ButikLogWriter.LogOpen();

        for (WebElementFacade rowButik : rowButiks) {
            getAttributeTitle = rowButik.getAttribute("title");
            ButikLogWriter.LogWrite("Yüklenmeyen butik - title : " + getAttributeTitle);
        }

        ButikLogWriter.LogClose();
    }
}

