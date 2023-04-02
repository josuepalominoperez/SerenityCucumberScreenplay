package starter.mainsteps;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebElement;

public class SelectAccount {

    public static Performable SolesAccount() {
        return Task.where("{0} selects a soles account",
                actor -> {
                    WebElement solesAccount = BrowseTheWeb.as(actor).find(By.xpath("//*[@id=\"print-section\"]/div[1]/table/tbody/tr[4]/td[1]/div[1]/span"));
                    solesAccount.click();
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        );
    }

}
