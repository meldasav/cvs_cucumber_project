package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.utils.Driver;

import java.util.List;

public class CVSHomePage {
    public CVSHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="//a[text()='Shop']")
    public WebElement shopLink;
}
