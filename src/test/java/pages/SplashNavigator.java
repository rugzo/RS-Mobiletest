package pages;

import Utilities.MobileBase;


public class SplashNavigator extends MobileBase {

    public String privacyBtn = isAndroid() ? "new UiSelector().resourceId(\"com.edreams.travel:id/privacyOpen\")" : "";
    public String termsOfUseBtn = isAndroid() ? "new UiSelector().resourceId(\"com.edreams.travel:id/button_agree\")" : "";
    public String signInBtn = isAndroid() ? "new UiSelector().resourceId(\"com.edreams.travel:id/signIn\")" : "";
    public String signInWithGoogleBtn = isAndroid() ? "new UiSelector().resourceId(\"com.edreams.travel:id/btnGoogleSignUp\")" : "";
    public String selectAccountBtn = isAndroid() ? "new UiSelector().textContains(\"909@gmail.com\")" : "";
    public String OKBtn = isAndroid() ? "new UiSelector().resourceId(\"android:id/button1\")" : "";
    public String AllowBtn = isAndroid() ? "new UiSelector().textContains(\"Allow\").className(\"android.widget.Button\")" : "";

    public void skipWelcomeScreens(){
        findElement(privacyBtn).click();
        findElement(termsOfUseBtn).click();
    }

    public void signInWithGoogle(){
        findElement(signInBtn).click();
        findElement(signInWithGoogleBtn).click();
        findElement(selectAccountBtn).click();
        findElement(OKBtn).click();
//        findElement(AllowBtn).click();
    }
}
