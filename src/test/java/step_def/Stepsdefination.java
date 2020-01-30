package step_def;

import cucumber.api.java.en.*;
import org.junit.Assert;
import page_objects.*;

public class Stepsdefination {
    HomePage homePage = new HomePage();
    ResultsPage resultsPage = new ResultsPage();
    ProductDescriptionPage productDescriptionPage = new ProductDescriptionPage();
    CartPage cartPage = new CartPage();
    SignInPage signInPage = new SignInPage();
    PriceDropPage priceDropPage = new PriceDropPage();

    @Given("^customer is on homepage$")
    public void customer_is_on_homepage() throws Throwable {
        String actualTitle = homePage.validatePageTitle();
        Assert.assertEquals("My Store",actualTitle);
        }

    @When("^customer enters desire product$")
    public void customer_enters_desire_product() throws Throwable {
        homePage.ValidateSearchbox("Dress");
        }

    @Then("^customer should see desied product$")
    public void she_should_see_desied_product() throws Throwable {
        String thumbnail = resultsPage.validateResultspage();
        Assert.assertEquals("7 results have been found.",thumbnail);
        }

    @Then("^customer clicked on product$")
    public void she_clicked_on_product() throws Throwable {
        resultsPage.selectproduct();
        }

    @Then("^customer select size$")
    public void she_select_size() throws Throwable {
        productDescriptionPage.validateSelectsize();
        }

    @Then("^customer clicked on addToCart$")
    public void she_clicked_on_addToCart() throws Throwable {
        productDescriptionPage.validateadd_to_cartbutn();
        }

    @Then("^customer clicked on checkout$")
    public void she_clicked_on_checkout() throws Throwable {
        productDescriptionPage.vlaidateproceedTocheckoutbutn();
        }

    @Then("^customer should see selected product in cartbox$")
    public void customer_should_see_selected_product_in_cartbox() throws Throwable {
        cartPage.validate_viewMyCrtbutn();
        cartPage.validateproceedtoCheckout();
    }


    @Then("^customer sould be on registration page\\.$")
    public void she_sould_be_on_registration_page() throws Throwable {
        cartPage.validateproceedtoCheckout();
        String actualTitle = signInPage.validatePageTitle();
        Assert.assertEquals("Login - My Store", actualTitle);
        }

        //Second Senario

    @When("^customer mousehover on womens option and select from option$")
    public void customer_mousehover_on_womens_option_and_select_from_option() throws Throwable {
        homePage.mouseHoveron_womensection();
    }

    @When("^customer can sortBy options$")
    public void customer_can_sortBy_options() throws Throwable {
        resultsPage.validatesort_by();
    }

    @Then("^customer should see desired product$")
    public void customer_should_see_desired_product() throws Throwable {
        String title = resultsPage.thumbnail();
        System.out.println(title);
        //Assert.assertEquals("BLOUSES",title);
    }

    @Then("^custome clicked on all specialLink$")
    public void custome_clicked_on_all_specialLink() throws Throwable {
        resultsPage.validatSpecial_link();
    }

    @Then("^customer selected product$")
    public void customer_selected_product() throws Throwable {
        priceDropPage.SlectProduct();
    }



}
