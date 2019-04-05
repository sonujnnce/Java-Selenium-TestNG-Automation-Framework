package pages;

/*******************************************************************************************
 * Page Factory class Template
 * @author Santhosh Kumar Gaikwad
 *******************************************************************************************/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;


public class Swiggy_Resto_Search_page extends PageBase {

    public Swiggy_Resto_Search_page(WebDriver driver) {
        super(driver);
    }

    /*******************************************************************************************
     * All WebElements are identified by @FindBy annotation
     *******************************************************************************************/

    WebDriver driver;
    // Web Element for Google Search Box
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div/div/div[1]/div/input")
    WebElement searchBox;

    // Web Element for Google Search first option
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/header/div/div/ul/li[5]/div/a/span[2]")
    WebElement searchIcon;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div/div/div[2]/div[2]/div/div[1]/div[2]/div[1]/div[1]/a/div/div/div[2]/div[1]")
    WebElement restoname;
    /*******************************************************************************************
     * All Methods for performing actions
     * @return
     *******************************************************************************************/


    public void enter_text(String Search_text){

        log.info("Enter text to search: "+Search_text);
        searchBox.sendKeys(Search_text);

    }

    public void click_searchButton(){
        log.info("Clicking on restaurant search button");
        searchIcon.click();

    }
    public String get_first_resto() {
        log.info("Get Restaurant name of first restaurant");
        return restoname.getText();
    }
    private void click_on_restoName() {
        log.info("Get Restaurant name of first restaurant");
        restoname.click();
    }
    /*******************************************************************************************
     * This POM method will be exposed in test case
     * @param
     *******************************************************************************************/

    public void search_by_restoName(String text_to_search) {

        this.enter_text(text_to_search);

    }

    public void click_on_search_button () {

        this.click_searchButton();

    }


    public void click_on_searched_resto() {
        this.click_on_restoName();
    }
}
