package starter.credentials;


import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import starter.navigation.BXILoginPage;

public class EnterCredentials {
    public static Performable withUser(String user){
        return Task.where("{0} enters "+user+"",
               Enter.theValue("XXXXX")
                        .into(BXILoginPage.ITEM_USER_FIELD)
        );
    }

    public static Performable withPassword(String password){
        return Task.where("{0} enters "+password+"",
                Enter.theValue("XXXXX")
                        .into(BXILoginPage.ITEM_PASSWORD_FIELD)
                        .thenHit(Keys.ENTER)
        );
    }
}
