package step_def;

import cucumber.api.java.en.*;
import org.junit.Assert;
import page_objects.HomePage;
import page_objects.MyAccountPage;
import page_objects.SignInPage;

public class SignInSteps {
    HomePage homePage = new HomePage();
    SignInPage signInPage = new SignInPage();
    MyAccountPage myAccountPage = new MyAccountPage();

    @Given("^Customer is on homepage$")
    public void customer_is_on_homepage() throws Throwable {
        String actualTitle = homePage.validatePageTitle();
        Assert.assertEquals("My Store",actualTitle);
    }

    @When("^Customer Click on SignIn link$")
    public void customer_Click_on_SignIn_link() throws Throwable {
        homePage.validateSign_up();
        }

    @Then("^customer is on login_page$")
    public void customer_is_on_login_page() throws Throwable {
       String actualTitle= signInPage.validatePageTitle();
       Assert.assertEquals(actualTitle,"Login - My Store");
        }

    @Then("^customer enters emailId and clicked on createAnAccount button$")
    public void customer_enteres_emailId_and_clicked_on_createAnAccount_button() throws Throwable {
        signInPage.validateCreateAnAccount("tom12@gmail.com");
        }

    @Then("^customer fill personalInformation$")
    public void customer_fill_personalInformation() throws Throwable {
        signInPage.validateSelect_titleRadiobtn();
        signInPage.validatePersonalInformation("Tom","Peter","password");
       }

    @Then("^customer select date of birth$")
    public void customer_select_date_of_birth() throws Throwable {
        signInPage.validateBirthDayDropBox();
        }

    @Then("^customer fills address and invalid zip code and click on register button$")
    public void customer_fills_address_and_invalid_zip_code_and_click_on_register_button() throws Throwable {
        signInPage.validateAddress("Abc Corporation","75 sibley","New York","E12 6sd","7404346");
        }

    @Then("^customer should see error message$")
    public void customer_shoud_see_error_message() throws Throwable {
        String error_message =signInPage.validate_error_message();
        Assert.assertEquals("The Zip/Postal code you've entered is invalid. It must follow this format: 00000",error_message);
        }

    @Then("^customer fills address and Valid zip code and click on register button$")
    public void customer_fills_address_and_Valid_zip_code_and_click_on_register_button() throws Throwable {
        signInPage.validateAddress("Abc Corporation","75 Sibly","NewYork","12345","7404346141");
       }

    @Then("^customer should be on My Account Page$")
    public void customer_should_be_on_My_Account_Page() throws Throwable {
        String massage = myAccountPage.thumbnail();
        Assert.assertEquals("My account",massage);
       }

}

