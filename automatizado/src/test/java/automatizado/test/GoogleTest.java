package automatizado.test;



import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
 

public class GoogleTest extends BaseTest {

    @Test
    public void devePesquisarNoGoogle(){
        //Arrange
        WebElement inputPesquisa = driver.findElement(By.name("q"));
        inputPesquisa.sendKeys("batata frita" + Keys.ENTER);
        
        String resultado = driver.findElement(By.className("eniVJf RES9jf")).getText();
    
        assertTrue(resultado.contains("Ver"), resultado);
    }
}

