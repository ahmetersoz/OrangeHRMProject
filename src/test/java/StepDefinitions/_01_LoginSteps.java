package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.reactivex.rxjava3.exceptions.Exceptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class _01_LoginSteps {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();
    @Given("Navigate to OrangeHRM")
    public void navigateToOrangeHRM() {
        GWD.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        GWD.getDriver().manage().window().maximize();
    }

    @When("Login as an Admin and navigate to Admin UserManagement Page")
    public void loginAsAnAdminAndNavigateToAdminUserManagementPage() {
        dc.sendKeysFunction(dc.usernameTB, "Admin");
        dc.sendKeysFunction(dc.passwordTB,"admin123");
        dc.clickFunction(dc.loginButton);
    }

    @Then("User should successfully login")
    public void userShouldSuccessfullyLogin() {
        Assert.assertTrue(GWD.getDriver().getCurrentUrl().contains("dashboard"),"Test Failed");
    }
}
