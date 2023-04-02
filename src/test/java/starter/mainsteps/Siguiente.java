package starter.mainsteps;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebElement;

public class Siguiente {


    public static Performable botonSiguiente1()  {
        return Task.where("{0} clicks on boton Siguiente 1",
                actor -> {
                    WebElement botonSiguiente1 = BrowseTheWeb.as(actor).find(By.xpath("//*[@id=\"wizardNext\"]"));
                    botonSiguiente1.click();

                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        );
    }

    public static Performable botonSiguiente2()  {
        return Task.where("{0} sends one sol",
                actor -> {
                    WebElement inputImporte = BrowseTheWeb.as(actor).find(By.xpath("//*[@id=\"montoEnSolesEnvioTransferencia\"]"));
                    WebElement botonSiguiente2 = BrowseTheWeb.as(actor).find(By.xpath("//*[@id=\"wizardNext\"]"));
                    inputImporte.sendKeys("1");
                    botonSiguiente2.click();

                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        );
    }


    public static Performable botonSiguiente3()  {
        return Task.where("{0} confirms the operation",
                actor -> {
                    WebElement botonSiguiente3 = BrowseTheWeb.as(actor).find(By.xpath("//*[@id=\"wizardNext\"]"));
                    botonSiguiente3.click();

                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        );
    }
}
