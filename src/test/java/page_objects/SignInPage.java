package page_objects;

import driver.BaseClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SignInPage extends BaseClass {

    public void validateCreateAnAccount(String emailId){
        driver.findElement(By.name("email_create")).sendKeys(emailId);
        driver.findElement(By.id("SubmitCreate")).click();
    }

    public String validatePageTitle(){
         return driver.getTitle();
    }

    public void validateSelect_titleRadiobtn(){
       /* List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/div[1]"));
        int totalnum =list.size();
        for(WebElement element: list){
            String title =element.getText();
            if(title.equalsIgnoreCase("Mr")){
                element.click();
                break;
            }
        }*/
       driver.findElement(By.xpath("//*[@id=\"id_gender1\"]")).click();
    }

    public void validatePersonalInformation(String firstName , String lastName , String password){
        driver.findElement(By.id("customer_firstname")).sendKeys(firstName);
        driver.findElement(By.id("customer_lastname")).sendKeys(lastName);
        driver.findElement(By.id("passwd")).sendKeys(password);
    }
    public void validateBirthDayDropBox(){

        WebElement day =  driver.findElement(By.id("days"));
        WebElement month = driver.findElement(By.id("months"));
        WebElement year = driver.findElement(By.id("years"));

        Select select = new Select(day);
        select.selectByValue("23");

        Select select1 =new Select(month);
        select1.selectByValue("2");

        Select select2 = new Select(year);
        select2.selectByValue("1983");
    }

    public  void validateAddress(String companyName, String address, String city, String zipCode, String mobNum){
        driver.findElement(By.id("company")).sendKeys(companyName);
        driver.findElement(By.id("address1")).sendKeys(address);
        driver.findElement(By.id("city")).sendKeys(city);

        WebElement state = driver.findElement(By.id("id_state"));
        Select select = new Select(state);
        select.selectByVisibleText("New York");

        driver.findElement(By.id("postcode")).sendKeys(zipCode);
        driver.findElement(By.id("phone_mobile")).sendKeys(mobNum);
        driver.findElement(By.id("submitAccount")).click();

    }
    public String validate_error_message(){
        String error = driver.findElement(By.xpath("//li[contains(text(),\"The Zip/Postal code you've entered is invalid. It\")]")).getText();
        System.out.println(error);
        return error;

    }

}
