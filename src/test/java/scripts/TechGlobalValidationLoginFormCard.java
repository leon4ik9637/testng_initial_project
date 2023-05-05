package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.WaitHandler;

public class TechGlobalValidationLoginFormCard extends Base{

    @Test(priority = 1, description = "Validate TechGlobal Login Form Card")
    public void validateTechGlobalLoginFormCard(){
        driver.get("https://techglobal-training.netlify.app/");

        techGlobalPage.practicesDropdown.click();

        techGlobalPage.frontendTestingOption.click();

        techGlobalPage.clickOnFrontendTestingCards("Login Form");

        Assert.assertEquals(techGlobalPage.loginFormHeading1.getText(), "Login Form");

        Assert.assertEquals(techGlobalPage.usernameLabel.getText(), "Please enter your username");
        Assert.assertEquals(techGlobalPage.passwordLabel.getText(), "Please enter your password");

        Assert.assertTrue(techGlobalPage.usernameInputBox.isDisplayed());
        Assert.assertTrue(techGlobalPage.passwordInputBox.isDisplayed());

        Assert.assertTrue(techGlobalPage.loginButton.isDisplayed());

        Assert.assertTrue(techGlobalPage.forgotPasswordLink.isDisplayed());

    }



    @Test(priority = 2, description = "Validate TechGlobal Login Form Card Valid Login")
    public void validateTechGlobalLoginFormCardValidLogin(){

        driver.get("https://techglobal-training.netlify.app/");

        techGlobalPage.practicesDropdown.click();
        techGlobalPage.frontendTestingOption.click();
        techGlobalPage.clickOnFrontendTestingCards("Login Form");

        techGlobalPage.usernameInputBox.sendKeys("TechGlobal");
        techGlobalPage.passwordInputBox.sendKeys("Test1234");
        techGlobalPage.loginButton.click();

        Assert.assertEquals(techGlobalPage.loggedInMessage.getText(), "You are logged in");

        Assert.assertTrue(techGlobalPage.logoutButton.isDisplayed());

    }

    @Test(priority = 3, description = "Validate TechGlobal Login Form card valid login and then logout")
    public void validateLoginFormCardAndLogout(){

        driver.get("https://techglobal-training.netlify.app/");
        techGlobalPage.practicesDropdown.click();
        techGlobalPage.frontendTestingOption.click();

        techGlobalPage.clickOnFrontendTestingCards("Login Form");

        techGlobalPage.usernameInputBox.sendKeys("TechGlobal");
        techGlobalPage.passwordInputBox.sendKeys("Test1234");

        techGlobalPage.loginButton.click();
        techGlobalPage.logoutButton.click();

        Assert.assertEquals(techGlobalPage.loginFormHeading1.getText(), "Login Form");

    }

    @Test(priority = 4, description = "Validate TechGlobal Login Form card Forgot Password? Link and Reset Password page")
    public void validateForgotPasswordLinkAndReset(){
        driver.get("https://techglobal-training.netlify.app/");
        techGlobalPage.practicesDropdown.click();
        techGlobalPage.frontendTestingOption.click();

        techGlobalPage.clickOnFrontendTestingCards("Login Form");

        techGlobalPage.forgotPasswordLink.click();

        Assert.assertEquals(techGlobalPage.resetPasswordHeading.getText(), "Reset Password");

        Assert.assertEquals(techGlobalPage.enterEmailToResetPasswordMessage.getText(), "Enter your email address and we'll send you a link to reset your password.");

        Assert.assertTrue(techGlobalPage.enterEmailToResetPasswordInputBox.isDisplayed());

        Assert.assertTrue(techGlobalPage.submitToResetPasswordButton.isDisplayed());

    }

    @Test(priority = 5, description = "Validate TechGlobal Login Form card Reset Password link")
    public void validateTGLoginFormCardResetPasswordLink(){
        driver.get("https://techglobal-training.netlify.app/");

        techGlobalPage.practicesDropdown.click();
        techGlobalPage.frontendTestingOption.click();
        techGlobalPage.clickOnFrontendTestingCards("Login Form");
        techGlobalPage.forgotPasswordLink.click();
        techGlobalPage.enterEmailToResetPasswordInputBox.sendKeys("gronich1992@gmail.com");
        techGlobalPage.submitToResetPasswordButton.click();

        Assert.assertEquals(techGlobalPage.linkToResetPasswordSent.getText(), "A link to reset your password has been sent to your email address.");

    }

    @Test(priority = 6, description = "Test Case 6: Validate TechGlobal Login Form card invalid login with wrong username")
    public void validateTGInvalidLoginWithWrongUsername(){
        driver.get("https://techglobal-training.netlify.app/");
        techGlobalPage.practicesDropdown.click();
        techGlobalPage.frontendTestingOption.click();

        techGlobalPage.clickOnFrontendTestingCards("Login Form");

        techGlobalPage.usernameInputBox.sendKeys("john");
        techGlobalPage.passwordInputBox.sendKeys("Test1234");
        techGlobalPage.loginButton.click();

        Assert.assertEquals(techGlobalPage.invalidUsernameMessage.getText(), "Invalid Username entered!");

    }

    @Test(priority = 7, description = "Test Case 7: Validate TechGlobal Login Form card invalid login with wrong password")
    public void validateTGInvalidLoginWithWrongPassword(){
        driver.get("https://techglobal-training.netlify.app/");
        techGlobalPage.practicesDropdown.click();
        techGlobalPage.frontendTestingOption.click();

        techGlobalPage.clickOnFrontendTestingCards("Login Form");

        techGlobalPage.usernameInputBox.sendKeys("TechGlobal");
        techGlobalPage.passwordInputBox.sendKeys("1234");
        techGlobalPage.loginButton.click();

        Assert.assertEquals(techGlobalPage.invalidPasswordMessage.getText(), "Invalid Password entered!");

    }

    @Test(priority = 8, description = "Test Case 8: Validate TechGlobal Login Form card invalid login with both wrong credentials ")
    public void validateTGInvalidLoginWithWrongBothCredentials(){
        driver.get("https://techglobal-training.netlify.app/");
        techGlobalPage.practicesDropdown.click();
        techGlobalPage.frontendTestingOption.click();

        techGlobalPage.clickOnFrontendTestingCards("Login Form");

        techGlobalPage.usernameInputBox.sendKeys("john");
        techGlobalPage.passwordInputBox.sendKeys("1234");
        techGlobalPage.loginButton.click();

        Assert.assertEquals(techGlobalPage.invalidUsernameMessage.getText(), "Invalid Username entered!");

    }


}
