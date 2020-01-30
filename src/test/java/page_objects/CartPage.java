package page_objects;

import driver.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CartPage extends BaseClass {

    public void validate_viewMyCrtbutn()  {
       WebElement cart = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(cart).build().perform();

        driver.findElement(By.xpath("//span[contains(text(),'Check out')]")).click();

    }
    public SignInPage validateproceedtoCheckout(){
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
        return new SignInPage();
    }
}
