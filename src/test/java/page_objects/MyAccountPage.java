package page_objects;

import driver.BaseClass;
import org.openqa.selenium.By;

public class MyAccountPage extends BaseClass {
    public String thumbnail(){
        return driver.findElement(By.className("navigation_page")).getText();
    }
}
