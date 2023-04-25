package Suport;

import cucumber.api.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static Runner.RunBase.getDriver;

public class ScreenShotUtils {

    public static void takeScreenshotOnScenario(Scenario scenario){

        System.out.println("+++++++++++++");
        System.out.println("Teste sendo exectado" + scenario.getName());
        System.out.println("Status: " + scenario.getStatus());
        System.out.println("Tag: " + scenario.getSourceTagNames());

        byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot,"image/png");
    }
}
