package stepDefinition;

import PageObjects.HomePage;
import cucumber.TestContext;
import io.cucumber.java.en.Given;

public class HomePageSteps {

    TestContext testContext;
    HomePage homePage;

    public HomePageSteps(TestContext context){
        testContext = context;
        homePage= testContext.getPageObjectManager().getHomePage();
    }

    @Given("User is on Home Page")
    public void user_is_on_Home_Page() {
        // Creamos instancia de Chroem
        homePage.navigateTo_HomePage();
    }


}
