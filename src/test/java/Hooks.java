import cucumber.api.java.After;
import cucumber.api.java.Before;
import driver.BaseClass;

public class Hooks {
    BaseClass baseClass = new BaseClass();

    @Before
    public void setup(){
        baseClass.set_up();
    }
    @After
    public void teardown(){
        baseClass.tear_down();
    }

}
