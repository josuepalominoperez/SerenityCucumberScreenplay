package starter.mainsteps;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;


import java.util.Set;



public class Ubicate {

    public static Performable PosicionGlobal()  {
        return Task.where("{0} switches to Posicion Global",
                actor -> {
                    String mainWindow = BrowseTheWeb.as(actor).getDriver().getWindowHandle();
                    Set<String> allWindows = BrowseTheWeb.as(actor).getDriver().getWindowHandles();
                    for (String window : allWindows) {
                        if (!window.equals(mainWindow)) {
                            BrowseTheWeb.as(actor).getDriver().switchTo().window(window);
                            try {
                                Thread.sleep(20000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
        );





    }

}
