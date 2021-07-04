//import com.sun.xml.internal.ws.wsdl.writer.document.StartWithExtensionsType;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.GridViewPage;
import pages.TableViewPage;
import pages.WebPlaygroundHomePage;
import webdriverpool.Webdriverinitializer;
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

  @Test
  public void hoverShowTableButton(){
    WebPlaygroundHomePage homePage = new WebPlaygroundHomePage(Webdriverinitializer.driver);
    TableViewPage tableViewPage = new TableViewPage(Webdriverinitializer.driver);

    homePage.openPage();
    tableViewPage.tableView();
    tableViewPage.hoverShowTable();
    boolean result = tableViewPage.isTableShown();
    Assert.assertTrue(result);
  }

  @Test
  public void clickButtonShowAfterTen(){
    WebPlaygroundHomePage homePage = new WebPlaygroundHomePage(Webdriverinitializer.driver);
    TableViewPage tableViewPage = new TableViewPage(Webdriverinitializer.driver);

    homePage.openPage();
    tableViewPage.tableView();
    tableViewPage.clickButtonShowTableAfterTen();
    boolean result = tableViewPage.isTableShown();
    Assert.assertTrue(result);
  }

  @Test
  public void switchTab(){
    WebPlaygroundHomePage homePage = new WebPlaygroundHomePage(Webdriverinitializer.driver);


    homePage.openPage();
    homePage.clickPoweredBy();
    String title = homePage.getAtlasTitle();
    System.out.println(title);
    Assert.assertEquals("Atlas ID – Automatin Testing Learning and Sharing Indonesia", title);
  }
}
