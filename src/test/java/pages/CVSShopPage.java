package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.utils.Driver;

public class CVSShopPage {
    public CVSShopPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "searchBar")
    public WebElement searchBox;
}
