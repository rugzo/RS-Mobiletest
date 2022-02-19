package pages;

import Utilities.MobileBase;

public class Home extends MobileBase {
    public String carsTab = isAndroid() ? "new UiSelector().textContains(\"Cars\").className(\"android.widget.TextView\")" : "";

    public void goToCarsPage(){
        findElement(carsTab).click();
    }
}
