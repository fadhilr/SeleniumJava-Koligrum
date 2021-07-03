package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
        WebElement inputQuote = driver.findElementById("inputQuote");
        inputQuote.sendKeys(quote);
    }

    public void selectColor(String color){
        WebElement selectColor = driver.findElementById("colorSelect");
        Select select = new Select(selectColor);
        select.selectByVisibleText(color);
    }

    public void clickButtonAddQuote(){
        WebElement buttonAddQuote = driver.findElementById("buttonAddQuote");
        buttonAddQuote.click();
    }


}
