package PageObjects;

import dataProvider.ConfigFileReader;
import managers.FileReaderManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;
    ConfigFileReader configFileReader;

    public  HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        configFileReader = new ConfigFileReader();
    }

    @FindBy(how = How.ID,using = "twotabsearchtextbox")
    private WebElement txtboxsearch;


    public void txtboxsearch1() {txtboxsearch.sendKeys("Gigabyte 2060 RTX");}

    public void txtboxsearch2(){
        txtboxsearch.sendKeys("Ryzen 5 2600");
    }

    public void navigateTo_HomePage() {
        driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
    }

}
