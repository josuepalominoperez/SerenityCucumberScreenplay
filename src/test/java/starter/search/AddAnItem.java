package starter.search;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import starter.navigation.ToDoListHomePage;

public class AddAnItem {
    public static Performable withName(String itemName){
        return Task.where("{0} agrega "+itemName+" a su lista",
                Enter.theValue(itemName)
                        .into(ToDoListHomePage.ITEM_NAME_FIELD)
                        .thenHit(Keys.ENTER)
        );
    }
}
