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
    public WebElement usernameTB;

    @FindBy (name = "password")
    public WebElement passwordTB;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement loginButton;


   @FindBy(xpath= "//button[normalize-space()='Add']")
    public WebElement addBtn;


    @FindBy (xpath = "//div[text()='ESS']")
    public WebElement userRole;








}
