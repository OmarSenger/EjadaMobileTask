package LoginScreen_Locators;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class LoginScreen {

    // Constructor
    private AppiumDriver driver;
    public LoginScreen(AppiumDriver driver){
        this.driver = driver ;
    }

    // Locators

    private By userNameField = AppiumBy.accessibilityId("test-Username");
    private By passwordField = AppiumBy.accessibilityId("test-Password");
    private By loginButton = AppiumBy.accessibilityId("test-LOGIN");


    //Actions

    public void loginMethod(String userName , String passWord){

        driver.findElement(userNameField).sendKeys(userName);
        driver.findElement(passwordField).sendKeys(passWord);
        driver.findElement(loginButton).click();

    }
}
