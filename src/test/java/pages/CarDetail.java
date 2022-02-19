package pages;

import Utilities.MobileBase;
import org.junit.Assert;


public class CarDetail extends MobileBase {
    public String carDetailPriceText = isAndroid() ? "new UiSelector().resourceId(\"com.edreams.travel:id/mainContentVehicle\").childSelector(new UiSelector().resourceId(\"com.edreams.travel:id/priceTitle\"))" : "";
    public String basketBtn = isAndroid() ? "new UiSelector().resourceId(\"com.edreams.travel:id/vehicleSummarySwitch\")" : "";
    public String totolPriceText = isAndroid() ? "new UiSelector().resourceId(\"com.edreams.travel:id/totalPriceText\")" : "";

    public void carDetailandBasketPriceCheck(){
        String carDetailprice = findElement(carDetailPriceText).getText();

        findElement(basketBtn).click();
        String totalPrice = findElement(totolPriceText).getText();

        Assert.assertEquals(carDetailprice,totalPrice);
    }

}
