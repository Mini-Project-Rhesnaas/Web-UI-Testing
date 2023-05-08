package starter.helpers;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateToAltaShop {
    public static Performable theAltaShopLoginPage(){
        return Task.where("{0} open alta shop home page",
                Open.browserOn().the(AltaShopPage.class));
    }
}
