import Base.baseTest;
import LoginScreen_Locators.LoginScreen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;


public class scenarios extends baseTest{

    LoginScreen login_screen;

    @Test
    public void successfulLogin(){
        login_screen = new  LoginScreen(driver);
        login_screen.loginMethod("standard_user","secret_sauce");
        WebElement element = driver.findElement(By.xpath("//android.widget.TextView[@text='PRODUCTS']"));
        Assert.assertTrue(element.isDisplayed());
    }

    @Test
    public void failLogin(){
        login_screen = new  LoginScreen(driver);
        login_screen.loginMethod("standard_user2","secret_sauce");
    }



}
