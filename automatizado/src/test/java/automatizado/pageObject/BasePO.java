package automatizado.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePO {
    protected WebDriver driver;
    
    protected BasePO(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
}
