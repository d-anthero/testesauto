package automatizado.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import automatizado.builder.ProdutoBuilder;
import automatizado.pageObject.ControledeProdutosPO;
import automatizado.pageObject.LoginPO;

public class ControleDeProdutosTest extends BaseTest{

    private static LoginPO loginPage;
    private static ControledeProdutosPO controleProdutoPage;

    @BeforeAll
    public static void prepararTestes(){
        loginPage = new LoginPO(driver);
        loginPage.executarAcaoLogin("admin@admin.com", "admin@123");

        controleProdutoPage = new ControledeProdutosPO(driver);
        assertEquals(controleProdutoPage.obterTituloPagina(), "Controle de Produtos");
        
    }
    
    @Test
    public void TC001_deveAbrirModalParaCadastroAoClicarEmAdicionar(){
        controleProdutoPage.btnAdicionar.click();
        // TODO REMOVER DOUBLE CLICK
        controleProdutoPage.btnAdicionar.click();
        String titulo = controleProdutoPage.tituloModal.getText();

        assertEquals("Produto", titulo);
        controleProdutoPage.btnSair.click();
        // TODO REMOVER DOUBLE CLICK
        controleProdutoPage.btnSair.click();
    }

    @Test
    public void TC002_naoDeveCadastrarProdutoSemPreencherTodosCampos(){
        controleProdutoPage.btnAdicionar.click();

        controleProdutoPage.btnAdicionar.click();
        ProdutoBuilder produtoBuilder = new ProdutoBuilder(controleProdutoPage);
        
        produtoBuilder
        .adicionarCodigo("").
        builder();

        String mensagem = controleProdutoPage.spanMensagem.getText();

        assertEquals("Todos os campos são obrigatórios para o cadastro!", mensagem);
    }

}
