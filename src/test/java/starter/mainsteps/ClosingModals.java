package starter.mainsteps;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebElement;

public class ClosingModals {

    public static Performable Modals() {
        return Task.where("{0} clicks on popups X button",
                actor -> {
                    WebElement popupButton1 = BrowseTheWeb.as(actor).find(By.xpath("//*[@id=\"frm-popup-carrusel\"]/div/div/div[1]/button"));
                    WebElement popupButton2 = BrowseTheWeb.as(actor).find(By.xpath("/html/body/div[7]/div[2]/div/div[1]/button"));
                    popupButton1.click();
                    popupButton2.click();
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        );
    }

}
