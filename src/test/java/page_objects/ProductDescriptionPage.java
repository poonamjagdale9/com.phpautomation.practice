package page_objects;

import driver.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ProductDescriptionPage extends BaseClass {

    public void validateadd_to_cartbutn(){
        driver.findElement(By.xpath("//button[@name='Submit']")).click();
    }

    public void validateSelectsize() {
        WebElement size = driver.findElement(By.xpath("//select[@id='group_1']"));

        Select select = new Select(size);
        select.selectByVisibleText("M");

    }

    public void validate_Coloursboxes() throws InterruptedException {
        List<WebElement> list= driver.findElements(By.id("color_to_pick_list"));
        int total_num  = list.size();
        for(WebElement element: list){
            String elesname = element.getText();
            if (elesname.equalsIgnoreCase("Orange")){
                element.click();
                break;

            }
            Thread.sleep(1000);

        }
    }

    public void vlaidateproceedTocheckoutbutn(){
        driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]")).click();
    }
}
