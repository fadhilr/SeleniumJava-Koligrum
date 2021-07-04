package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

public class TableViewPage {
    ChromeDriver driver;

    public TableViewPage(ChromeDriver driver) {
        this.driver = driver;
    }

    public void tableView(){
        WebElement tableViewTab = driver.findElementById("tableView");
        tableViewTab.click();
    }

    public  void hoverShowTable(){
        WebElement buttonShowTable = driver.findElementById("buttonShowTable");
        Actions action = new Actions(driver);
        action.moveToElement(buttonShowTable).pause(5000).build().perform();

    }

    public boolean isTableShown(){
//        WebElement table = driver.findElementById("tableQuote");
//        boolean result = table.isDisplayed();
//        return result;

        By locatorTable = By.id("tableQuote");
        WebDriverWait wait = new WebDriverWait(driver, 15, 1000);
        WebElement table = wait.until(ExpectedConditions.presenceOfElementLocated(locatorTable));
        boolean result = table.isDisplayed();
        return result;
    }

    public void clickButtonShowTableAfterTen(){
        WebElement buttonAfterTen = driver.findElementById("buttonShowAfterTen");
        buttonAfterTen.click();

    }
}
