package managers;
import PageObjects.CartPage;
import PageObjects.HomePage;
import PageObjects.ProductListingPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjectManager {
    WebDriver driver;
    private HomePage homePage;
    private ProductListingPage productListingPage;
    private CartPage cartPage;

    public PageObjectManager(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    public HomePage getHomePage() {
        return (homePage == null) ? homePage= new HomePage(driver): homePage;
    }

    public ProductListingPage getProductListingPage() {
        return (productListingPage == null) ? productListingPage= new ProductListingPage(driver) : productListingPage;
    }

    public CartPage getCartPage(){
        return (cartPage == null) ? cartPage = new CartPage(driver) : cartPage;
    }


}
