package com.automation.steps;

import com.automation.uipages.RegisterPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class RegisterPageSteps {
    private RegisterPage registerPage;

    @Step
    public void isOnRegistryPage(){
        registerPage.open();
    }

    @Step
    public void validationEmail(){
        registerPage.doAuthentication();
    }

    @Step
    public void emailIsValid(){
        Assert.assertEquals("Create an account", registerPage.validateAccount());
    }

    @Step
    public void registerNewUser(){
        registerPage.doRegister();
    }

    @Step
    public void userShouldBeRegister(){
        Assert.assertEquals("My account", registerPage.validateRegistry());
    }


}
