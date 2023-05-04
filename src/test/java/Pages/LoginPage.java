package Pages;

import Runner.RunCucumberTest;
import org.junit.Assert;
import org.openqa.selenium.By;

import static Suport.Comands.*;

public class LoginPage extends RunCucumberTest {

    private By campoEmail = By.id("user");

    private By campoSenha = By.id("password");

    private By botaoLogin = By.id("btnLogin");

    private By campoFaltando = By.className("invalid_input");



    public void preencherEmail(String email){
        fillField(campoEmail,email);
    }

    public void preencherSenha(String senha){

        fillField(campoSenha,senha);
    }

    public void clicarLogin(){
        clickElement(botaoLogin);
    }

    public void validarCampoFaltando(String mensagem){
        checkMensage(campoFaltando,mensagem);
    }
}
