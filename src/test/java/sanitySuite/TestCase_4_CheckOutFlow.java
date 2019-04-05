package sanitySuite;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import pages.Swiggy_Resto_Search_page;
import pages.Swiggy_cart_checkout_page;


public class TestCase_4_CheckOutFlow extends TestBase{

    Swiggy_cart_checkout_page obj_swiggy_checkout;


    @Test (priority=6, description = "Add Items to Cart")
    public void add_items_to_Cart() {

        log.info("Adding all items to cart.");
        obj_swiggy_checkout = new Swiggy_cart_checkout_page (driver);
        obj_swiggy_checkout.wait(2);
        obj_swiggy_checkout.add_item1_tocart();
        obj_swiggy_checkout.wait(2);
        log.info("Increase Qunatity of item 1.");
        obj_swiggy_checkout.increase_qty_item1();


        obj_swiggy_checkout.wait(2);
        obj_swiggy_checkout.add_item2_tocart();
        obj_swiggy_checkout.wait(2);
        log.info("Increase Qunatity of item 2.");
        obj_swiggy_checkout.increase_qty_item2();
        obj_swiggy_checkout.wait(2);

        log.info("Adding item 3 and 4.");
        obj_swiggy_checkout.add_item3_tocart();
        obj_swiggy_checkout.wait(2);

        obj_swiggy_checkout.add_item4_tocart();
        obj_swiggy_checkout.wait(2);




    }

    @Test (priority=7, description = "Click Checkout to signup and continue")
    public void validate_cart_items() {
        log.info("Assert items from property file added to cart");
        obj_swiggy_checkout.wait(4);
        assertStrings(obj_swiggy_checkout.verify_item1_exists(),data.getProperty("TestCase_4_CartItem1"));

        obj_swiggy_checkout.wait(4);
        assertStrings(obj_swiggy_checkout.verify_item2_exists(),data.getProperty("TestCase_4_CartItem2"));

        obj_swiggy_checkout.wait(4);
        assertStrings(obj_swiggy_checkout.verify_item3_exists(),data.getProperty("TestCase_4_CartItem3"));

        obj_swiggy_checkout.wait(4);
        assertStrings(obj_swiggy_checkout.verify_item4_exists(),data.getProperty("TestCase_4_CartItem4"));
    }

    @Test (priority=8, description = "Click Checkout to signup and continue")
    public void checkout_cart_signup() {

        log.info("Click Checkout to signup and continue");
        obj_swiggy_checkout.click_checkout_cart();
        obj_swiggy_checkout.wait(2);
        obj_swiggy_checkout.click_Signup_button();
        obj_swiggy_checkout.wait(2);
        obj_swiggy_checkout.enter_phone(data.getProperty("TestCase_4_phoneNumber"));
        obj_swiggy_checkout.wait(2);
        obj_swiggy_checkout.enter_name(data.getProperty("TestCase_4_UserName"));
        obj_swiggy_checkout.wait(2);
        obj_swiggy_checkout.enter_email(data.getProperty("TestCase_4_Email"));
        obj_swiggy_checkout.wait(2);
        obj_swiggy_checkout.enter_password(data.getProperty("TestCase_4_Password"));
        obj_swiggy_checkout.wait(2);
        obj_swiggy_checkout.click_continuesignup();

        obj_swiggy_checkout.wait(4);
        assertStrings(obj_swiggy_checkout.verify_email_exists(),data.getProperty("TestCase_4_emailAlreadyexist"));
        driver.quit();
    }

}
