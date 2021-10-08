package com.automation.uipages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account")
public class RegisterPage extends PageObject {

    public void doAuthentication(){
        $("#email_create").sendKeys("myemailaccount87@hotmail.com");
        $("#SubmitCreate").click();
    }

    public void doRegister(){
        $("#uniform-id_gender1").selectByIndex(1);
        $("#customer_firstname").sendKeys("Carolina");
        $("#customer_lastname").sendKeys("Amaya");
        $("#email").sendKeys("mytestemail@hotmail.com");
        $("#passwd").sendKeys("myPassword@2021");
        $("#days").selectByValue("3");
        $("#months").selectByValue("4");
        $("#years").selectByValue("1990");
        $("#firstname").sendKeys("Carolina");
        $("#lastname").sendKeys("Amaya");
        $("#address1").sendKeys("Calle Carrera");
        $("#city").sendKeys("Miami");
        $("#id_state").selectByValue("1");
        $("#postcode").sendKeys("110011");
        $("#id_country").selectByValue("21");
        $("#phone_mobile").sendKeys("3186276570");
        $("#alias").sendKeys("myaddress");
        $("#submitAccount").click();
    }

    public String validateAccount() {
        return $("div#noSlide h1").getText();
    }

    public String validateRegistry() {
        return $("div#center_column h1").getText();
    }
}
