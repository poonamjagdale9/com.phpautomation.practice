package page_objects;

import driver.BaseClass;
import org.openqa.selenium.By;

public class PriceDropPage extends BaseClass {
    ResultsPage resultsPage= new ResultsPage();

    public void SlectProduct(){
        //resultsPage.validatesort_by();
        //resultsPage.validatSpecial_link();
        driver.findElement(By.xpath("//a[@class='product-name'][contains(text(),'Printed Summer Dress')]")).click();
    }
}
