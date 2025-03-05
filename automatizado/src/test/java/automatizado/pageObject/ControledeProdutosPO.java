package automatizado.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ControledeProdutosPO extends BasePO{

    public ControledeProdutosPO(WebDriver driver) {
        super(driver);

    }

    @FindBy(id= "mensagem")
    public WebElement spanMensagem;
    
    @FindBy(id = "btn-adicionar")
    public WebElement btnAdicionar;

    @FindBy(css = "ul>li>a.nav-link")
    public WebElement linkVoltar;

    @FindBy(css = "div.modal-header>h4")
    public WebElement tituloModal;

    @FindBy(id = "codigo")
    public WebElement inputCodigo;

    @FindBy(id = "nome")
    public WebElement inputNome;

    @FindBy(id = "quantidade")
    public WebElement inputQuantidade;

    @FindBy(id = "valor")
    public WebElement inputValor;

    @FindBy(id = "data")
    public WebElement inputData;

    @FindBy(id = "btn-salvar")
    public WebElement btnSalvar;

    @FindBy(id = "btn-sair")
    public WebElement btnSair;

}
