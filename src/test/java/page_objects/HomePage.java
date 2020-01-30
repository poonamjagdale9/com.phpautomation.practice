package page_objects;

import driver.BaseClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class HomePage extends BaseClass {
    public static String searchitem;

    public String validatePhpAutomationUrl(){
        return driver.getCurrentUrl();
    }

    public String validatePageTitle(){
       return driver.getTitle();
    }

    public void validateSign_up(){
    driver.findElement(By.className("login")).click();
    }

    public void mouseHoveron_womensection(){

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//a[@class ='sf-with-ul'][contains(text(),'Women')]"))).build().perform();
        driver.findElement(By.linkText("Blouses")).click();
        driver.findElement(By.xpath("//input[@id='layered_id_attribute_group_2']")).click();

        List<WebElement> list = driver.findElements(By.className("nomargin hiddable col-lg-6"));
        for (WebElement element: list){
            String names = element.getText();
            System.out.println(names);
            if (names.equalsIgnoreCase("M")){
                element.click();
                break;
            }
        }
    }

    public void ValidateSearchbox(String item){
        searchitem = item;
        driver.findElement(By.id("search_query_top")).sendKeys(item);
        driver.findElement(By.name("submit_search")).click();

    }

}
