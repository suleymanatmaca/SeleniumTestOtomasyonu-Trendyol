package common.helpers;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UrunKontrol {
    public static void kontrol() {
        WebElementFacade butikTable;
        List<WebElementFacade> rowButiks;

        butikTable = Target.the("butikTable").

                locatedBy("//*[@id='root']/div/ul").

                resolveAllFor(theActorInTheSpotlight()).

                get(0);

        rowButiks = butikTable.thenFindAll(By.xpath("//*[@class='product']//img[@lazy='error']"));//error

        String getAttributeSrc;
        ButikLogWriter.LogOpen();

        for (WebElementFacade rowButik : rowButiks) {
            getAttributeSrc = rowButik.getAttribute("src");
            ButikLogWriter.LogWrite("Yüklenmeyen ürün görseli - src : " + getAttributeSrc);
        }

        ButikLogWriter.LogClose();
    }
}

