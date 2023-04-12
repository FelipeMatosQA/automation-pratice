package Pages;

import Runner.RunCucumberTest;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage extends RunCucumberTest {

    private By campoEmail = By.id("user");

    private By campoSenha = By.id("password");

    private By botaoLogin = By.id("btnLogin");

    private By campoFaltando = By.className("invalid_input");

    public void preencherEmail(String email){
        getDriver().findElement(campoEmail).sendKeys(email);

    }

    public void preencherSenha(String senha){
        getDriver().findElement(campoSenha).sendKeys(senha);

    }

    public void clicarLogin(){
        getDriver().findElement(botaoLogin).click();

    }

    public void validarCampoFaltando(String mensagem){
        Assert.assertEquals(mensagem,getDriver().findElement(campoFaltando).getText());
    }
}
