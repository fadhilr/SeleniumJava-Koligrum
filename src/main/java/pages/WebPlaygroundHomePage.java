package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class WebPlaygroundHomePage {



    //global/instance variable
    ChromeDriver driver;
    public WebPlaygroundHomePage(ChromeDriver driver) {
        this.driver = driver;
    }

    public void openPage(){
        driver.get("http://bdd.atlasid.tech/\n");
    }

    public void inputQuote(String quote){
//        WebElement inputQuote = driver.findElementById("inputQuote");
        WebElement inputQuote = driver.findElementByCssSelector("#inputQuote");
        inputQuote.sendKeys(quote);
    }

    public void selectColor(String color){
//        WebElement selectColor = driver.findElementById("colorSelect");
        WebElement selectColor = driver.findElementByXPath("//select[@id='colorSelect']");
        Select select = new Select(selectColor);
        select.selectByVisibleText(color);
    }

    public void clickButtonAddQuote(){
        WebElement buttonAddQuote = driver.findElementById("buttonAddQuote");
        buttonAddQuote.click();
    }

    public void clickPoweredBy(){
        WebElement poweredBy = driver.findElementById("poweredBy");
        poweredBy.click();
    }

    public String getAtlasTitle(){
        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));
        String title = driver.getTitle();
        return title;
    }
}
