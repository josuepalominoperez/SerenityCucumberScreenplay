package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable BXILoginPage() {
        return Task.where("{0} abre la web del Login BXI",
                Open.browserOn().the(BXILoginPage.class));
    }
}
