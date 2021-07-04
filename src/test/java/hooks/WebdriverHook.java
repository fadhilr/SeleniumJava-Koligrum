package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import webdriverpool.Webdriverinitializer;

public class WebdriverHook {
    @Before
    public void inisialiasiWebdriver(){
        Webdriverinitializer.initialize();
    }

    @After
    public void quitBrowser(){
        Webdriverinitializer.quit();
    }
}
