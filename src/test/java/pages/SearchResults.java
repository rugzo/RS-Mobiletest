package pages;

import Utilities.MobileBase;

public class SearchResults extends MobileBase {
    public String searchFilterBtn = isAndroid() ? "new UiSelector().resourceId(\"com.edreams.travel:id/resultsFiltersButton\").className(\"android.widget.Button\")" : "";
    public String filterStartPrice = isAndroid() ? "new UiSelector().descriptionStartsWith(\"Range start\").className(\"android.widget.SeekBar\")" : "";
    public String filterEndPrice = isAndroid() ? "new UiSelector().descriptionStartsWith(\"Range end\").className(\"android.widget.SeekBar\")" : "";
    public String filterShowCarsBtn = isAndroid() ? "new UiSelector().resourceId(\"com.edreams.travel:id/ctaBtn\").className(\"android.widget.Button\")" : "";
    public String selectCarIndex = isAndroid() ? "new UiSelector().description(\"carBlock {index}\").className(\"androidx.cardview.widget.CardView\")" : "";
    public String basketTotalPriceText = isAndroid() ? "new UiSelector().resourceId(\"com.edreams.travel:id/details_toolbar_summary\").className(\"android.widget.TextView\")" : "";


    public void openFilter(){
        findElement(searchFilterBtn).click();
    }

    public void setPriceRange(String low, String high){
        findElement(filterStartPrice).sendKeys(low);
        findElement(filterEndPrice).sendKeys(high);
    }

    public void applyFilter(){
        findElement(filterShowCarsBtn).click();
    }

    public void selectCar(String index){
        String selectorCar = selectCarIndex.replace("{index}", index);
        findElement(selectorCar).click();
    }

}
