package starter.mainsteps;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class Verify {

    public static Performable expectedText()  {
        return Task.where("{0} sees the summary",
                actor -> {
                    String expected = "Transferencia realizada correctamente";
                    WebElement element = BrowseTheWeb.as(actor).find(By.xpath("//*[@id=\"realizadoEnvioCuentaPropiaTerceros\"]/div[1]/div[2]/div[1]"));
                    String actual = element.getText();
                    assertTrue(actual.contains(expected));
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        );

    }
}
