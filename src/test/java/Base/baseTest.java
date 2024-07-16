package Base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;


public class baseTest {


    public AppiumDriver driver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName","Android");
        caps.setCapability("automationName","UiAutomator2");
        caps.setCapability("platformVersion","10");
        caps.setCapability("deviceName","Android Emulator");
        caps.setCapability("app",System.getProperty("user.dir")+"/apps/Android.SauceLabs.Mobile.Sample.app.2.7.1.apk");
        driver = new AndroidDriver(new URL("https://localhost:4723/wd/hub"),caps);

    }

    @AfterMethod
    public void tearDown(){

        if(null != driver){
            driver.quit();
        }

    }

}
