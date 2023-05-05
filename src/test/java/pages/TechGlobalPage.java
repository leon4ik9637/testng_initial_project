package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TechGlobalPage {
    public TechGlobalPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "dropdown-button")
    public WebElement practicesDropdown;

    @FindBy(id = "sub_heading")
    public WebElement resetPasswordHeading;

    @FindBy(xpath = "//h2")
    public WebElement loggedInMessage;

    @FindBy(id = "logout")
    public WebElement logoutButton;

    @FindBy(id = "frontend-option")
    public WebElement frontendTestingOption;

    @FindBy(xpath = "//div[@class='CardGrids_CardGrids__qDdyI']//div//div/div")
    public List<WebElement> frontendTestingCards;

    @FindBy(id = "main_heading")
    public WebElement loginFormHeading1;

    @FindBy(xpath = "//label[@for='username']")
    public WebElement usernameLabel;

    @FindBy(xpath = "//label[@for='password']")
    public WebElement passwordLabel;

    @FindBy(id = "username")
    public WebElement usernameInputBox;

    @FindBy(id = "password")
    public WebElement passwordInputBox;

    @FindBy(id = "login_btn")
    public WebElement loginButton;

    @FindBy(id = "forgot-password")
    public WebElement forgotPasswordLink;

    @FindBy(css = "label[for='email']")
    public WebElement enterEmailToResetPasswordMessage;

    @FindBy(css = ".ForgotPassword_email__iK0sq")
    public WebElement enterEmailToResetPasswordInputBox;

    @FindBy(css = ".ForgotPassword_submit_btn__0w5GJ")
    public WebElement submitToResetPasswordButton;

    @FindBy(id = "confirmation_message")
    public WebElement linkToResetPasswordSent;

    @FindBy(id = "error_message")
    public WebElement invalidUsernameMessage;

    @FindBy(id = "error_message")
    public WebElement invalidPasswordMessage;


    public void clickOnFrontendTestingCards(String cardName){
        for(WebElement element : frontendTestingCards){
            if(element.getText().equals(cardName)){
                element.click();
                break;
            }
        }
    }
}
