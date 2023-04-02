package starter.navigation;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://xyz.com")
public class BXILoginPage extends PageObject {
    public static Target ITEM_USER_FIELD = Target.the("item user field").locatedBy("//*[@id=\"txteai_user\"]");

    public static Target ITEM_PASSWORD_FIELD = Target.the(" item password field").locatedBy("//*[@id=\"txteai_password\"]");
}
