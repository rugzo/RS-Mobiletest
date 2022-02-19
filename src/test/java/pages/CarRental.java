package pages;

import Utilities.MobileBase;

public class CarRental extends MobileBase {
    public String carsPageTitle = isAndroid() ? "new UiSelector().className(\"android.widget.TextView\").text(\"Car Rental\")" : "";
    public String searchTextView = isAndroid() ? "new UiSelector().className(\"android.widget.TextView\").resourceId(\"com.edreams.travel:id/searchTv\")" : "";
    public String searchEditText = isAndroid() ? "new UiSelector().className(\"android.widget.EditText\").resourceId(\"com.edreams.travel:id/toolbarSearchInput\")" : "";
    public String selectItem = isAndroid() ? "new UiSelector().text(\"{keyword}\").resourceId(\"com.edreams.travel:id/locationsItemHeading\")" : "";
    public String selectDateEditText = isAndroid() ? "new UiSelector().description(\"inputSelectDate\").className(\"android.widget.EditText\")" : "";
    public String selectPickDate = isAndroid() ? "new UiSelector().description(\"day- {date}\").className(\"android.widget.TextView\")" : "";
    public String selectReturnDate = isAndroid() ? "new UiSelector().description(\"day- {date}\").className(\"android.widget.TextView\")" : "";
    public String selectContinueBtn = isAndroid() ? "new UiSelector().description(\"btnContinue\").className(\"android.widget.Button\")" : "";
    public String selectDriverAge = isAndroid() ? "new UiSelector().text(\"{range}\").className(\"android.widget.CompoundButton\")" : "";
    public String searchCarBtn = isAndroid() ? "new UiSelector().description(\"searchDriverCTASearch\").className(\"android.widget.Button\")" : "";

    public void searchAndSelectLocation(String searchText, String selectText){
        findElement(searchTextView).click();
        findElement(searchEditText).sendKeys(searchText);
        String select = selectItem.replace("{keyword}",selectText);
        findElement(select).click();
    }

    public void selectPickReturnDate(String pickDate, String returnDate){
        findElement(selectDateEditText).click();
        pickDate = pickDate.replace("-","");
        String selectorPickDate = selectPickDate.replace("{date}",pickDate);
        findElement(selectorPickDate).click();
        returnDate = returnDate.replace("-","");
        String selectorReturnDate = selectReturnDate.replace("{date}",returnDate);
        findElement(selectorReturnDate).click();
        findElement(selectContinueBtn).click();
    }

    public void selectDriverAgeRange(String range){
        String selectorAgeRange = selectDriverAge.replace("{range}",range);
        findElement(selectorAgeRange).click();
    }

    public void searchCars(){
        findElement(searchCarBtn).click();
    }

}
