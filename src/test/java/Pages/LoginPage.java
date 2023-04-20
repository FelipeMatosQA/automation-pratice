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
        //getDriver().findElement(campoEmail).sendKeys(email);
        fillField(campoEmail,email);

    }

    public void preencherSenha(String senha){
        //getDriver().findElement(campoSenha).sendKeys(senha);
        fillField(campoSenha,senha);

    }

    public void clicarLogin(){
        clickElement(botaoLogin);
       // getDriver().findElement(botaoLogin).click();

    }

    public void validarCampoFaltando(String mensagem){
        checkMensage(campoFaltando,mensagem);
        //Assert.assertEquals(mensagem,getDriver().findElement(campoFaltando).getText());
    }
}
