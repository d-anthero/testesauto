package automatizado.test;



import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import automatizado.pageObject.GooglePO;
 

public class GoogleTest extends BaseTest {

    private static GooglePO googlePage;

    @BeforeAll
    public static void prepararTestes(){
        googlePage = new GooglePO(driver);
    }
    @Test
    public void devePesquisarNoGoogle(){
        //Arrange
        googlePage.pesquisar("Batata frita");
        
        String resultado = googlePage.obterResultadoDaPesquisa();
        assertTrue(resultado.contains("Ver"), resultado);
    }

    public void devePesquisarNoGoogle2(){
        //Arrange
        googlePage.inputPesquisa.sendKeys("Batata frita" + Keys.ENTER);
        
        String resultado = googlePage.divResultadoPesquisa.getText();
        assertTrue(resultado.contains("resultados"), resultado);
    }
}

