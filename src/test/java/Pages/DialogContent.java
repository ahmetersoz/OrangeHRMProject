package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent{
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy (name = "username")
    public WebElement username;

    @FindBy (name = "password")
    public WebElement Password;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement clicklogin;


   @FindBy(xpath= "//button[normalize-space()='Add']")
    public WebElement addBtn;


    @FindBy (xpath = "//div[text()='ESS']")
    public WebElement userRole;








}
