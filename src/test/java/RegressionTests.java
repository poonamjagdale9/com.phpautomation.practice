import driver.BaseClass;
import org.junit.Assert;
import org.junit.Test;
import page_objects.*;

public class RegressionTests extends BaseClass {

    HomePage homePage = new HomePage();
    SignInPage signInPage = new SignInPage();
    ResultsPage resultsPage= new ResultsPage();
    PriceDropPage priceDropPage = new PriceDropPage();
    ProductDescriptionPage productDescriptionPage = new ProductDescriptionPage();
    CartPage cartPage = new CartPage();
    @Test
    public void urlTest(){
        String actualUrl = homePage.validatePhpAutomationUrl();
        Assert.assertEquals(actualUrl,"http://automationpractice.com/index.php");
    }

    @Test
    public void createAnAccountTest(){
        homePage.validateSign_up();
        signInPage.validateCreateAnAccount();
    }

    @Test
    public void mouseHoverTest(){
        homePage.mouseHoveron_womensection();
    }

    @Test
    public void sort_byTest(){
        resultsPage.validatesort_by();
    }

    @Test
    public void selectproductTest() throws InterruptedException {
        priceDropPage.SlectProduct();
        productDescriptionPage.validateadd_to_cartbutn();
        productDescriptionPage.validateSelectsize();
        productDescriptionPage.validate_Coloursboxes();
        productDescriptionPage.vlaidateproceedTocheckoutbutn();
        String actualUrl =homePage.validatePhpAutomationUrl();
        Assert.assertEquals("http://automationpractice.com/index.php?controller=order",actualUrl);
        cartPage.validate_viewMyCrtbutn();
        cartPage.validateproceedtoCheckout();
        String actualtitle = driver.getTitle();
        System.out.println(actualtitle);
        Assert.assertEquals("Login - My Store",actualtitle);
    }

    @Test
    public void searchTest(){
        homePage.ValidateSearchbox("Dress");
        String thumbnail = resultsPage.validateResultspage();
        System.out.println(thumbnail);
        resultsPage.selectproduct();
        String actualTitle =homePage.validatePageTitle();
        Assert.assertEquals("Printed Dress - My Store",actualTitle);
        productDescriptionPage.validateSelectsize();
        productDescriptionPage.validateadd_to_cartbutn();
        productDescriptionPage.vlaidateproceedTocheckoutbutn();
        cartPage.validate_viewMyCrtbutn();
        cartPage.validateproceedtoCheckout();
    }

    @Test
    public void options(){
    homePage.mouseHoveron_womensection();
    resultsPage.validatesort_by();
    String title = resultsPage.thumbnail();
    System.out.println(title);
    //Assert.assertEquals("BLOUSES",title);
    resultsPage.validatSpecial_link();
    //resultsPage.selectproduct();
    priceDropPage.SlectProduct();
    productDescriptionPage.validateadd_to_cartbutn();
    productDescriptionPage.vlaidateproceedTocheckoutbutn();
    cartPage.validate_viewMyCrtbutn();
    cartPage.validateproceedtoCheckout();

    }
}


