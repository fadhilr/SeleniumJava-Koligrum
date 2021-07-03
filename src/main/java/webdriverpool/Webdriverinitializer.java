package webdriverpool;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Webdriverinitializer {
    public static ChromeDriver driver;

    public static void initialize(){
        //download webdriver dan setup
        WebDriverManager.chromedriver().setup();

        //setting webdriver ke incognito
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito", "--start-maximized");

        //setting
        driver = new ChromeDriver(options);
//    driver.manage().window().maximize();
    }

    public static void quit(){
        driver.quit();
    }
}
