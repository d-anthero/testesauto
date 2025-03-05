package automatizado.pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPO extends BasePO {

    public LoginPO(WebDriver driver) {
        super(driver);
        
    }
    
    @FindBy(id = "email")
    public WebElement inputEmail;

    @FindBy(id = "senha")
    public WebElement inputSenha;

    @FindBy(id = "btn-entrar")
    public WebElement btnEntrar;
    
    @FindBy(css = "form.form-login>div.alert>span")
    public WebElement spanMensagem;

    public String obterMensagem(){
        return this.spanMensagem.getText();
    }

    public void executarAcaoLogin(String email, String senha){
         escrever(inputEmail, email);
         escrever(inputSenha, senha);

        btnEntrar.click();
    }    
}
