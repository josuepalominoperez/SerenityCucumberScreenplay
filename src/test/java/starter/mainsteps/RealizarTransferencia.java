package starter.mainsteps;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebElement;

public class RealizarTransferencia {

    public static Performable botonOperaciones()  {
        return Task.where("{0} clicks on Realizar Transferencia button",
                actor -> {
                    WebElement botonRealizarTransferencias = BrowseTheWeb.as(actor).find(By.xpath("//*[@id=\"operaciones-list-container\"]/div[3]/div/ul/li[1]/a/strong"));
                    botonRealizarTransferencias.click();

                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        );
    }
}
