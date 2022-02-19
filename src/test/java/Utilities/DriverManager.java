package Utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverManager{

    public static AppiumDriver driver;
    public static WebDriverWait wait;
    public String PLATFORM = "";

    public void setDriver(String testPlatform) throws MalformedURLException {
        System.out.println("***** Constants.Running_Platform : "+ Variables.Running_Platform+"  *****");
        switch (Variables.Running_Platform) {
            case "ios": {
                // TO DO
                System.out.println("***** iOS App *****");
                break;
            }
            default: {
                System.out.println("***** Android App *****");
                DesiredCapabilities androidCaps = new DesiredCapabilities();
                androidCaps.setCapability("appium:deviceName", "HA0YVCAF");
                androidCaps.setCapability("appium:automationName", "UIAutomator2");
                androidCaps.setCapability("appium:udid", "HA0YVCAF");
                androidCaps.setCapability("appium:platformName", "Android");
                androidCaps.setCapability("appium:platformVersion", "9");
//                androidCaps.setCapability("appium:skipUnlock", "true");
                androidCaps.setCapability("appium:app", System.getProperty("user.dir") + "\\src\\test\\resources\\edreams.apk");
                androidCaps.setCapability("appium:fullReset", "true");
                androidCaps.setCapability("appium:noReset", "false");
                androidCaps.setCapability("appPackage", "com.edreams.travel");
                androidCaps.setCapability("appActivity", "com.odigeo.app.android.navigator.SplashNavigator");
                driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), androidCaps);
                driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
                wait = new WebDriverWait(driver, 60);

                break;
            }
        }
    }

}
