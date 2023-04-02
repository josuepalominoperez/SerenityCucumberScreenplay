package starter.mainsteps;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebElement;


import java.util.Set;
public class Operaciones {

    public static Performable botonOperaciones()  {
        return Task.where("{0} clicks on Operaciones button",
                actor -> {
                    WebElement botonOperaciones = BrowseTheWeb.as(actor).find(By.xpath("//*[@id=\"tab-operaciones-link\"]"));
                    botonOperaciones.click();

                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        );
    }
}
