//import com.sun.xml.internal.ws.wsdl.writer.document.StartWithExtensionsType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TestRun {

//  public static void main(String[] args) {
//    WebDriverManager.chromedriver().setup();
//    ChromeDriver driver = new ChromeDriver();
//    driver.get("https://koligrum.com");
//  }
  @Test
  public void addQuote(){
    //download webdriver dan setup
    WebDriverManager.chromedriver().setup();

    //setting webdriver ke incognito
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--incognito", "--start-maximized");

    //setting
    ChromeDriver driver = new ChromeDriver(options);
//    driver.manage().window().maximize();

    //buka web page
    driver.get("http://bdd.atlasid.tech/\n");

    //input quote
//    By inputQuoteLocator = By.id("inputQuote");
//    WebElement inputQuote = driver.findElement(inputQuoteLocator);
    WebElement inputQuote = driver.findElementById("inputQuote");
    inputQuote.sendKeys("There is a will, there is a way");

    //select color
    WebElement selectColor = driver.findElementById("colorSelect");
    Select select = new Select(selectColor);
    select.selectByVisibleText("Blue");

    //click add quote
    WebElement buttonAddQuote = driver.findElementById("buttonAddQuote");
    buttonAddQuote.click();

//    get quote text
    List<WebElement> quotes = driver.findElementsByName("quoteText");
    WebElement quoteKedua= quotes.get(1);
    String actualQuote = quoteKedua.getText();
    Assert.assertEquals("There is a will, there is a way", actualQuote);

    // quit browser
    driver.quit();
  }

}
