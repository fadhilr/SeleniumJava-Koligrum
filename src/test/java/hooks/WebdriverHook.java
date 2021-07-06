package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import webdriverpool.Webdriverinitializer;

public class WebdriverHook {
    @Before
    public void inisialiasiWebdriver(){
        Webdriverinitializer.initialize();
    }

    @After
    public void quitBrowser(Scenario scenario) {
        if(scenario.isFailed()){
            TakesScreenshot screenshot = Webdriverinitializer.driver;
            byte[] imageByte = screenshot.getScreenshotAs(OutputType.BYTES);
            scenario.attach(imageByte, "image/png", scenario.getId());
        }
        Webdriverinitializer.quit();
    }
}
