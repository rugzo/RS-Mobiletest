package Utilities;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.WebElement;

public class MobileBase extends DriverManager {

    public static boolean isAndroid(){
        if(Variables.Running_Platform == "android") {
            return true;
        }else{
            return false;
        }
    }
    public WebElement findElement(String uiAutomatorString) {
        if(isAndroid()) {
            return driver.findElement(MobileBy.AndroidUIAutomator(uiAutomatorString));
        }else{
            //for ios
            return null;
        }
    }

}
