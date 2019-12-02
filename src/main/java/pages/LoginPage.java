package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.cssSelector("#login button");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage setUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
        return this;
    }

    public LoginPage setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public SecureAreaPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }
}
