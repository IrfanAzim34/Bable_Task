package com.bable.step_definitions;

import com.bable.pages.HomePage;
import com.bable.utils.ConfigurationReader;
import com.bable.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    HomePage homePage = new HomePage();

    @Before
    public void goToHomePage(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        homePage.privacyNoticeAccept.click();
    }

    @After
    public void teardownForSs(Scenario scenario){

        if(scenario.isFailed()) {
            byte[] ss = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(ss, "image/png", scenario.getName());
        }


        Driver.closeDriver();
    }

}
