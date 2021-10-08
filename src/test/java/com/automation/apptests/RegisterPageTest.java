package com.automation.apptests;

import com.automation.steps.RegisterPageSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class RegisterPageTest {

    @Steps
    RegisterPageSteps registerPageSteps;

    @Managed(driver = "chrome")
    WebDriver browser;

    @Test
    public void appRegisterTest(){
        registerPageSteps.isOnRegistryPage();
        registerPageSteps.validationEmail();
        registerPageSteps.emailIsValid();
        registerPageSteps.registerNewUser();
        registerPageSteps.userShouldBeRegister();
    }

}
