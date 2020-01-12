package PageObjects;

import WebDriverWait.Wait;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    WebDriver driver;
    public  CartPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(how = How.XPATH,using = "//a[@id='nav-cart']")
    private WebElement btn_checkcart;

    public void btn_clickcheckcart(){
        Wait.untilPageLoadComplete(driver);
        btn_checkcart.click();
        Assert.assertEquals("2", driver.findElement(By.xpath("//span[@id='nav-cart-count']")).getAttribute("innerText"));
        driver.quit();
    }

}
