package com.infor.step_definitions;

/*
In the class we will be able to pass pre- & post- conditions to each scenario and each step
 */


import com.infor.utilities.BrowserUtils;
import com.infor.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
/*
    //import from io.cucumber.java not from junit
    //@Before(order = 1)
    public void setupScenario(){
        System.out.println("====Setting up browser before using cucumber @Before");
    }

    //@Before (value = "@login", order = 2)
    public void setupScenarioForLogins(){
        System.out.println("====this will only apply to scenarios with @login tag");
    }

    //@Before (value = "@db", order = 0)
    public void setupForDatabaseScenarios(){
        System.out.println("====this will only apply to scenarios with @db tag");
    }

*/

    @After
    public void teardownScenario(Scenario scenario){

        //scenario.isFailed() --> if scenario fails this method will return True boolean value

        if (scenario.isFailed()){
            byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png", scenario.getName());
        }





       Driver.closeDriver();

    }
/*
    @BeforeStep
    public void setupStep(){
        System.out.println("-------------> applying setup using @BeforeStep");
    }


    @AfterStep
    public void afterStep(){
        //BrowserUtils.sleep(1);
        System.out.println("-------------> applying tearDown  using @AfterStep");
    }
*/

    @BeforeStep
    public static void beforeStep(){
        BrowserUtils.sleep(2);
    }
}

