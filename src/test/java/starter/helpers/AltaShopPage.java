package starter.helpers;

import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@DefaultUrl("https://alta-shop.vercel.app/auth/login")
public class AltaShopPage extends PageObject {
    public static Target EMAIL_FIELD = Target.the("email field").located(By.xpath("(//input[@type=\"text\"])[1]"));
    public static Target PASSWORD_FIELD = Target.the("password field").located(By.xpath("(//input[@type=\"text\"])[2]"));
    public static Target LOGIN_BUTTON = Target.the("login button").located(By.xpath("//span[text()=\"Login\"]"));
    public static Target REGISTER = Target.the("resgister").located(By.xpath("//a[text()=\"Register\"]"));
    public static Target FULL_NAME_FIELD = Target.the("full name field").located(By.xpath("(//input[@type=\"text\"])[1]"));
    public static Target EMAIL_REGISTER = Target.the("email register field").located(By.xpath("(//input[@type=\"text\"])[2]"));
    public static Target PASSWORD_REGISTER = Target.the("password register field").located(By.xpath("(//input[@type=\"text\"])[3]"));
    public static Target REGISTER_BUTTON = Target.the("register button").located(By.xpath("(//span[@class=\"v-btn__content\"])[3]"));
    public static Target PROFILE_BUTTON = Target.the("profile button").located(By.xpath("(//button[@type=\"button\"])[2]"));
    public static Target CART_BUTTON = Target.the("cart button").located(By.xpath("(//span[@class=\"v-btn__content\"])[1]"));
    public static Target LOGOUT_BUTTON = Target.the("logout button").located(By.xpath("(//div[@role=\"menuitem\"])[2]"));
    public static Target DETAIL_BUTTON = Target.the("detail button").located(By.xpath("(//button[@type=\"button\"])[5]"));
    public static Target RATINGS = Target.the("ratings product").located(By.xpath("//button[@aria-label=\"Rating 5 of 5\"]"));
    public static Target BUY_BUTTON = Target.the("buy button").located(By.xpath("(//button[@type=\"button\"])[6]"));
    public static Target PAY_BUTTON = Target.the("pay button").located(By.xpath("(//span[@class=\"v-btn__content\"])[5]"));




}
