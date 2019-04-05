package pages;

/*******************************************************************************************
 * Page Factory class Template
 * @author Santhosh Kumar Gaikwad
 *******************************************************************************************/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;


public class Swiggy_locations_search_page extends PageBase {

    public Swiggy_locations_search_page(WebDriver driver) {
        super(driver);
    }

    /*******************************************************************************************
     * All WebElements are identified by @FindBy annotation
     *******************************************************************************************/

    WebDriver driver;
    // Web Element for Google Search Box
    @FindBy(id = "location")
    WebElement searchBox;

    // Web Element for Google Search first option
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div[1]/div/div[2]/div/div[3]/div[1]/span[2]")
    WebElement searchFirstOption;

    /*******************************************************************************************
     * All Methods for performing actions
     * @return
     *******************************************************************************************/


    public void enter_text(String Search_text){

        log.info("Enter text to search: "+Search_text);
        searchBox.sendKeys(Search_text);

    }

    public String get_first_option(){
        log.info("Select first option displayed by google search");
        return searchFirstOption.getText();

    }

    public void select_first_option(){
        log.info("Select first option displayed by Swiggy location search");
        searchFirstOption.click();

    }

    /*******************************************************************************************
     * This POM method will be exposed in test case
     * @param
     *******************************************************************************************/

    public void search_by_first_option(String text_to_search) {

        this.enter_text(text_to_search);

    }

    public void click_on_first_search_option () {

        this.select_first_option();

    }
}
