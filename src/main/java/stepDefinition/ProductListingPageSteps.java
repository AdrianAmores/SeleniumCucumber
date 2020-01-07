package stepDefinition;

import PageObjects.HomePage;
import PageObjects.ProductListingPage;
import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class ProductListingPageSteps {

    TestContext testContext;
    ProductListingPage productListingPage;
    HomePage homePage;

    public ProductListingPageSteps(TestContext context){
        testContext = context;
        productListingPage = testContext.getPageObjectManager().getProductListingPage();
        homePage = testContext.getPageObjectManager().getHomePage();
    }

    @When("User search product")
    public void user_search_product() {
        // Ahora en el motor de busqueda escribimos lo que queremos buscar
        homePage.txtboxsearch1();
        // Ahora presionamos en la busqueda anteriorimente realizada
        productListingPage.searchproduct();
        productListingPage.clickfirstproduct();
    }


    @And("User add product to shopping cart and move to Home Page")
    public void user_add_product_to_shopping_cart_and_move_to_Home_Page() {
        // Añadimos a la Cesta
        productListingPage.clickadd_cart1();
        // Volvemos a la pagina principal
        homePage.navigateTo_HomePage();

    }


    @When("User search another product")
    public void user_search_another_product() {
        // Segunda Busqueda
        // Ahora en el motor de busqueda escribimos lo que queremos buscar
        homePage.txtboxsearch2();
        // Ahora presionamos en la busqueda anteriorimente realizada
        productListingPage.searchproduct();
        productListingPage.clicksecondproduct();
    }


    @And("User add product to shopping cart")
    public void user_add_product_to_shopping_cart() {
        // AÃƒÂ±adimos a la cesta
        productListingPage.clickONadd_cart2();

    }

}
