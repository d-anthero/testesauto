package automatizado.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import automatizado.pageObject.LoginPO;


@TestMethodOrder(MethodOrderer.MethodName.class)
public class LoginTest extends BaseTest {
        private static LoginPO loginPage;

    @BeforeAll
    public static void prepararTestes(){
        loginPage = new LoginPO(driver);
    }

    @Test
    public void TC001_naoDeveLogarNoSistemaComEmailSenhaBranco(){
        loginPage.executarAcaoLogin("", "");
        String mensagem = loginPage.obterMensagem();

        assertEquals(mensagem, "Informe usuário e senha, os campos não podem ser brancos.");
    }

    @Test
    public void TC002_naoDeveLogarNoSistemaComEmailIncorretoSenhaBranco(){
        loginPage.executarAcaoLogin("", "teste");
        String mensagem = loginPage.obterMensagem();

        assertEquals(mensagem, "Informe usuário e senha, os campos não podem ser brancos.");
    }

    @Test
    public void TC003_naoDeveLogarNoSistemaComEmailBrancoSenhaIncorreta(){
        loginPage.executarAcaoLogin("teste", "");
        String mensagem = loginPage.obterMensagem();

        assertEquals(mensagem, "Informe usuário e senha, os campos não podem ser brancos.");
    }

    @Test
    public void TC004_naoDeveLogarNoSistemaComEmailIncorretaSenhaIncorreta(){
        loginPage.executarAcaoLogin("teste", "");
        String mensagem = loginPage.obterMensagem();

        assertEquals(mensagem, "Informe usuário e senha, os campos não podem ser brancos.");
    }

    @Test
    public void TC005_DeveLogarNoSistemaComEmailSenhaCorreto(){
        loginPage.executarAcaoLogin("admin@admin.com", "admin@123");
        

       
    }
}
