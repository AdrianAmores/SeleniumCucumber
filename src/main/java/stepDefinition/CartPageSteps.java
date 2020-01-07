package stepDefinition;

import PageObjects.CartPage;
import cucumber.TestContext;
import io.cucumber.java.en.Then;

public class CartPageSteps {

    TestContext testContext;
    CartPage cartPage;

    public CartPageSteps(TestContext context){
        testContext = context;
        cartPage = testContext.getPageObjectManager().getCartPage();

    }


    @Then("User checks that the products have been added to the shopping cart")
    public void user_checks_that_the_products_have_been_added_to_the_shopping_cart(){
        // Observamos la cesta de que efectivamente se ha añadido los productos
        cartPage.btn_clickcheckcart();

    }

}
