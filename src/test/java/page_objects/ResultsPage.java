package page_objects;

import driver.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ResultsPage extends BaseClass {
    HomePage homePage= new HomePage();

    public String validateResultspage(){
       return driver.findElement(By.className("heading-counter")).getText();
    }

    public String thumbnail(){
       return driver.findElement(By.xpath("//span[@class='cat-name']")).getText();
    }
    public void validatesort_by(){
        //homePage.mouseHoveron_womensection();
        WebElement sort_by = driver.findElement(By.xpath("//select[@id='selectProductSort']"));

        Select select= new Select(sort_by);
        select.selectByVisibleText("Product Name: A to Z");
    }

    public void validatSpecial_link(){
        driver.findElement(By.xpath("//span[contains(text(),'All specials')]")).click();
    }

    public void selectproduct(){
        driver.findElement(By.linkText("Printed Dress")).click();
    }
}
