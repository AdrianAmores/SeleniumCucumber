package PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProductListingPage {
    WebDriver driver;
    public ProductListingPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

}
    @FindBy(how = How.CLASS_NAME,using = "nav-input")
    private WebElement btn_searchproduct;

    @FindBy(how = How.LINK_TEXT,using = "Gigabyte Technology GeForce RTX 2060 OC GV-N2060OC-6GD - Tarjeta grafica, Negro")
    private WebElement first_product;

    @FindBy(how = How.XPATH,using = "//*[@id=\"comparison_add_to_cart_button\"]/span/input")
    private WebElement add_cart1;


    @FindBy(how = How.LINK_TEXT,using = "AMD Ryzen 5 3400G, Procesador con Disipador de Calor Wraith Spire (4 MB, 4 Núcleos, Velocidad de 4.2 GHz, 65W)")
    private WebElement second_product;

    @FindBy(how = How.XPATH,using = "//span[@id='comparison_add_to_cart_button']//input[@class='a-button-input']")
    private WebElement add_cart2;

    public void searchproduct(){btn_searchproduct.click();}

    public void clickfirstproduct(){ first_product.sendKeys(Keys.ENTER);}

    public void clickadd_cart1(){add_cart1.click(); }

    public void clicksecondproduct(){second_product.click();}

    public void clickONadd_cart2(){ add_cart2.click();}

    public String getProductName(int productNumber) {
        return first_product.getText();
    }
}
