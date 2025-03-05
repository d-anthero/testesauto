package automatizado.pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePO extends BasePO{

    @FindBy(name = "q")
    public WebElement inputPesquisa;

    @FindBy(id = "result-stats")
    public WebElement divResultadoPesquisa;

    /**
     * Construtor da página do google
     * @param driver driver do google
     */
    public GooglePO(WebDriver driver) {
        super(driver);
        
    }

    /**
     * Método de pesquisa no google baseando no texto
     * @param texto
     */

    public void pesquisar(String texto){
        inputPesquisa.sendKeys(texto + Keys.ENTER);
    }

    /**
     * Metodo que retorna o resultado aproximado da pesquisa
     * @return
     */
    public String obterResultadoDaPesquisa(){
        return divResultadoPesquisa.getText();
    }
    
}
