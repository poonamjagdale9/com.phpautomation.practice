package page_objects;

import driver.BaseClass;
import org.junit.Test;
import org.openqa.selenium.By;

public class SignInPage extends BaseClass {
    public void validateCreateAnAccount(){
        driver.findElement(By.name("email_create")).sendKeys("tompeter123@gmail.com");
        driver.findElement(By.id("SubmitCreate")).click();
    }

    public String validatePageTitle(){
         return driver.getTitle();
    }
}
