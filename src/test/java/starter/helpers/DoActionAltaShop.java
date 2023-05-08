package starter.helpers;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
public class DoActionAltaShop {
    public static Performable fillEmail(String email){
        return Task.where("{0} fill email field"+ email,
                Enter.theValue(email).into(AltaShopPage.EMAIL_FIELD));
    }
    public static Performable fillPassword(String password){
        return Task.where("{0} fill password field"+ password,
                Enter.theValue(password).into(AltaShopPage.PASSWORD_FIELD));
    }
    public static Performable clickLoginButton(){
        return Task.where("{0} click login button",
                Click.on(AltaShopPage.LOGIN_BUTTON));
    }
    public static Performable clickRegisterMenu(){
        return Task.where("{0} click register menu",
                Click.on(AltaShopPage.REGISTER));
    }
    public static Performable fillFullName(String fullName){
        return Task.where("{0} fill full name field"+ fullName,
                Enter.theValue(fullName).into(AltaShopPage.FULL_NAME_FIELD));
    }
    public static Performable fillEmailRegister(String emailRegister){
        return Task.where("{0} fill email register field"+ emailRegister,
                Enter.theValue(emailRegister).into(AltaShopPage.EMAIL_REGISTER));
    }
    public static Performable fillPasswordRegister(String passwordRegister){
        return Task.where("{0} fill password register field"+ passwordRegister,
                Enter.theValue(passwordRegister).into(AltaShopPage.PASSWORD_REGISTER));
    }
    public static Performable clickRegisterButton(){
        return Task.where("{0} click register button",
                Click.on(AltaShopPage.REGISTER_BUTTON));
    }
    public static Performable clickProfileButton(){
        return Task.where("{0} click profile button",
                Click.on(AltaShopPage.PROFILE_BUTTON));
    }
    public static Performable clickCartButton(){
        return Task.where("{0} click cart button",
                Click.on(AltaShopPage.CART_BUTTON));
    }
    public static Performable clickLogoutButton(){
        return Task.where("{0} click logout button",
                Click.on(AltaShopPage.LOGOUT_BUTTON));
    }
    public static Performable clickDetailButton(){
        return Task.where("{0} click detail button",
                Click.on(AltaShopPage.DETAIL_BUTTON));
    }
    public static Performable clickBuyButton(){
        return Task.where("{0} click buy button",
                Click.on(AltaShopPage.BUY_BUTTON));
    }
    public static Performable clickPayButton(){
        return Task.where("{0} click pay button",
                Click.on(AltaShopPage.PAY_BUTTON));
    }

    public static Performable clickRatings(){
        return Task.where("{0} click ratings",
                Click.on(AltaShopPage.RATINGS));
    }



}
