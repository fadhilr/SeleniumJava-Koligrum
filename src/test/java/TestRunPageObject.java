//import com.sun.xml.internal.ws.wsdl.writer.document.StartWithExtensionsType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import pages.GridViewPage;
import pages.WebPlaygroundHomePage;
import webdriverpool.Webdriverinitializer;

import java.util.List;
//TDD test driven development/unit testing
public class TestRunPageObject {

//  public static void main(String[] args) {
//    WebDriverManager.chromedriver().setup();
//    ChromeDriver driver = new ChromeDriver();
//    driver.get("https://koligrum.com");
//  }
  @Before
  public void inisialiasiWebdriver(){
    Webdriverinitializer.initialize();
  }

  @After
  public void quitBrowser(){
    Webdriverinitializer.quit();
  }

  @Test
  public void addQuoteWithBlue(){
    WebPlaygroundHomePage homePage = new WebPlaygroundHomePage(Webdriverinitializer.driver);
    GridViewPage gridViewPage = new GridViewPage(Webdriverinitializer.driver);

    homePage.openPage();
    homePage.inputQuote("There is a will there is a way");
    homePage.selectColor("Blue");
    homePage.clickButtonAddQuote();

    String actualQuote = gridViewPage.getQuoteText(1);
    Assert.assertEquals("There is a will there is a way", actualQuote);

    //tutup browser

  }

  @Test
  public void addQuoteWithYellow(){
    WebPlaygroundHomePage homePage = new WebPlaygroundHomePage(Webdriverinitializer.driver);
    GridViewPage gridViewPage = new GridViewPage(Webdriverinitializer.driver);

    homePage.openPage();
    homePage.inputQuote("There is a will there is a way");
    homePage.selectColor("Yellow");
    homePage.clickButtonAddQuote();

    String actualQuote = gridViewPage.getQuoteText(1);
    Assert.assertEquals("There is a will there is a way", actualQuote);

    //tutup browser

  }

}
