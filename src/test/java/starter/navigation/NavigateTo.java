package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theToDoListHomePage() {
        return Task.where("{0} abre la web del TODO List",
                Open.browserOn().the(ToDoListHomePage.class));
    }
}
