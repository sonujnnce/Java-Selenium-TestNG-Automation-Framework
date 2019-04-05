package pages;
/*******************************************************************************************
 * Page Factory class Template
 * @author Santhosh Kumar Gaikwad
 *******************************************************************************************/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;
public class Swiggy_cart_checkout_page extends PageBase{
    public Swiggy_cart_checkout_page(WebDriver driver) {
        super(driver);
    }

    /*******************************************************************************************
     * All WebElements are identified by @FindBy annotation
     *******************************************************************************************/

    @FindBy(xpath = "//*[@id=\"h-1950595611\"]/div[2]/div[1]/div/div[3]/div[2]/div[1]")
    WebElement item1Add;

    @FindBy(xpath = "//*[@id=\"menu-content\"]/div[2]/div/div[2]/div[2]/div/div[2]/div")
    WebElement temp1;

    @FindBy(xpath = "//*[@id=\"h-1950595611\"]/div[2]/div[1]/div/div[3]/div[2]/div[2]")
    WebElement item1qty;

    @FindBy(xpath = "//*[@id=\"h-1950595611\"]/div[3]/div[1]/div/div[3]/div[2]/div[1]")
    WebElement item2Add;

    @FindBy(xpath = "//*[@id=\"h-1950595611\"]/div[3]/div[1]/div/div[3]/div[2]/div[2]")
    WebElement item2qty;

    @FindBy(xpath = "//*[@id=\"h-1950595611\"]/div[5]/div[1]/div/div[3]/div[2]/div[1]")
    WebElement item3Add;

    @FindBy(xpath = "//*[@id=\"h-1950595611\"]/div[5]/div[1]/div/div[3]/div[2]/div[2]")
    WebElement item3qty;

    @FindBy(xpath = "//*[@id=\"h-1950595611\"]/div[6]/div/div/div[3]/div[2]/div[1]")
    WebElement item4Add;

    @FindBy(xpath = "//*[@id=\"h-1950595611\"]/div[6]/div/div/div[3]/div[2]/div[2]")
    WebElement item4qty;

    @FindBy(xpath = "//*[@id=\"menu-content\"]/div[2]/div/div[3]/div[3]")
    WebElement checkout;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div/div[1]/div[2]/div[2]/div[2]")
    WebElement singup;

    @FindBy(xpath = "//*[@id=\"name\"]")
    WebElement name_form;

    @FindBy(xpath = "//*[@id=\"mobile\"]")
    WebElement phonenumber;

    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement email;

    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div/div[1]/div[2]/div[2]/div/div[2]/form/div[3]/a")
    WebElement continuetosingup;

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div/div[1]/div[2]/div[2]/div/div[2]/form/div[1]/div[3]/label")
    WebElement verifyemailexist;

    @FindBy(xpath = "//*[@id=\"menu-content\"]/div[2]/div/div[2]/div[2]/div/div[2]/div[1]/div[1]/div[2]")
    WebElement item1;

    @FindBy(xpath = "//*[@id=\"menu-content\"]/div[2]/div/div[2]/div[2]/div/div[2]/div[2]/div[1]/div[2]")
    WebElement item2;

    @FindBy(xpath = "//*[@id=\"menu-content\"]/div[2]/div/div[2]/div[2]/div/div[2]/div[3]/div[1]/div[2]")
    WebElement item3;

    @FindBy(xpath = "//*[@id=\"menu-content\"]/div[2]/div/div[2]/div[2]/div/div[2]/div[4]/div[1]/div[2]")
    WebElement item4;




    /*******************************************************************************************
     * All Methods for performing actions
     * @return
     *******************************************************************************************/
    public String verify_item1_exists(){

        log.info("Get item 1 in cart");
        return item1.getText();

    }
    public String verify_item2_exists(){

        log.info("Get item 2 in cart");
        return item2.getText();

    }
    public String verify_item3_exists(){

        log.info("Get item 3 in cart");
        return item3.getText();

    }
    public String verify_item4_exists(){

        log.info("Get item 4 in cart");
        return item4.getText();

    }

    public void add_item1(){

        log.info("Item 1 added");
        item1Add.click();

    }
    public void add_item2(){

        log.info("Item 2 added");
        item2Add.click();

    }
    public void add_item3(){

        log.info("Item 3 added");
        item3Add.click();

    }
    public void add_item4(){

        log.info("Item 4 added");
        item4Add.click();

    }
    public void click_checkout(){

        log.info("Clicked checkout");
        checkout.click();

    }
    public void enter_phone(String phone){

        log.info("phone number entered:: "+phone);
        phonenumber.sendKeys(phone);

    }
    public void enter_name(String name){

        log.info("Name entered:: "+name);
        name_form.sendKeys(name);

    }
    public void enter_email(String email_string){

        log.info("email id entered:: "+email_string);
        email.sendKeys(email_string);

    }
    public void enter_password(String password_string){

        log.info("passowrd entered:: "+password_string);
        password.sendKeys(password_string);

    }
    public void click_continuesignup(){

        log.info("Clicked contine signup");
        continuetosingup.click();

    }
    public String verify_email_exists(){

        log.info("Email exist text shown");
        return verifyemailexist.getText();

    }
    public void click_signnewuser(){

        log.info("Clicked signup");
        singup.click();

    }
    public void Increase_item1qty(){

        log.info("Quantiy increased");
        item1qty.click();

    }
    public void Increase_item2qty(){

        log.info("Quantiy increased");
        item2qty.click();

    }

    /*******************************************************************************************
     * This POM method will be exposed in test case
     * @param
     *******************************************************************************************/
    public void increase_qty_item1() {

        this.Increase_item1qty();

    }
    public void increase_qty_item2() {

        this.Increase_item2qty();

    }
    public void add_item1_tocart() {

        this.add_item1();

    }
    public void add_item2_tocart() {

        this.add_item2();

    }
    public void add_item3_tocart() {

        this.add_item3();

    }
    public void add_item4_tocart() {

        this.add_item4();

    }
    public void click_checkout_cart() {

        this.click_checkout();

    }
    public void click_Signup_button() {

        this.click_signnewuser();

    }

}
