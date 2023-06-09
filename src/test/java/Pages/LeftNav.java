package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{
    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(),this);
    }


    @FindBy(xpath = "//a[@class='oxd-main-menu-item']")
    public WebElement Adminclick;

    @FindBy(css = "div[class='oxd-sidepanel-header']")
    public WebElement header;

}
