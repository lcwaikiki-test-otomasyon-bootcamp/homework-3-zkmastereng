package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class loginPage {

    By loginPageTitle = By.cssSelector(".login-form__title");
    By emailRadioButton = By.cssSelector(".login-form__radio-buttons--input[value='Email']");
    By phoneRadioButton = By.cssSelector(".login-form__radio-buttons--input[value='Phone']");
    By emailPlaceholder = By.cssSelector(".text-input[placeholder='E-Posta Adresiniz']");
    By passwordPlaceholder = By.cssSelector(".text-input[placeholder='Şifreniz']");
    By passwordIcon = By.cssSelector(".login-form__show-password-icon--img");
    By checkboxRememberMe = By.cssSelector(".checkbox-input");
    By forgotPassword = By.cssSelector(".login-form__forgot-password-link");
    By loginButton = By.cssSelector(".login-form__button");
    By phonePlace = By.cssSelector(".login-form__phone");
    By error = By.cssSelector(".error");
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public loginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkLoginPage(){elementHelper.checkElementPresence(loginPageTitle);}
    public void clickEmailRadioButton () {elementHelper.click(emailRadioButton);}
    public void checkLoginPageEmail() {elementHelper.presenceElement(emailRadioButton);};
    public void checkLoginPagePhone() {elementHelper.presenceElement(phoneRadioButton);};
    public void checkemailPlaceholder() {elementHelper.presenceElement(emailPlaceholder);};
    public void checkpasswordPlaceholder() {elementHelper.presenceElement(passwordPlaceholder);};
    public void checkPasswordIcon() {elementHelper.presenceElement(passwordIcon);};
    public void  checkCheckboxRememberMe() {elementHelper.presenceElement(checkboxRememberMe);};
    public void checkForgotPassword() {elementHelper.presenceElement(forgotPassword);};
    public void checkLoginButton() {elementHelper.presenceElement(loginButton);};
    public void clickPhoneRadioButton(){elementHelper.click(phoneRadioButton);};
    public void checkPhonePlace() {elementHelper.presenceElement(phonePlace);};
    public void clickLoginButton(){elementHelper.click(loginButton);};
    public void checkError(){elementHelper.presenceElement(error);};
    public void writeEmail(String text){elementHelper.sendKey(emailPlaceholder,text);};
    public void emailErrorCheck() {elementHelper.checkElementVisible(error);};
    public void writePassword(String text){elementHelper.sendKey(passwordPlaceholder,text);};

}
