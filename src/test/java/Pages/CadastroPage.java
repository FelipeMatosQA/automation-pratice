package Pages;

import Runner.RunCucumberTest;
import Suport.Utils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Suport.Comands.*;

public class CadastroPage extends RunCucumberTest {



    private By campoNome = By.id("user");

    private By campoEMail = By.id("email");

    private By campoSenha = By.id("password");

    private By botaoRegistrar = By.id("btnRegister");

    private By criticaCampo = By.id("errorMessageFirstName");





    public void preencherCampoEmailAleatorio(){
        //Utils.esperarPorElementoEstarClicavel(campoEMail,10);
        //getDriver().findElement(campoEMail).sendKeys(Utils.gerarEmailAleatorio());
        fillField(campoEMail,Utils.gerarEmailAleatorio());
    }

    public void preencherCampoEmail(String email){

        //getDriver().findElement(campoEMail).sendKeys(email);
        fillField(campoEMail,email);
    }

    public void preencherCampoSenha(String senha){
        //getDriver().findElement(campoSenha).sendKeys(senha);
        fillField(campoSenha,senha);


    }

    public void preencherCampoNome(String nome){
        //Utils.esperarPorElementoEstarClicavel(campoNome,10);
        //getDriver().findElement(campoNome).sendKeys(nome);
        fillField(campoNome,nome);
    }

    public void clicarBotaoCadastrar(){
        clickElement(botaoRegistrar);
       // getDriver().findElement(botaoRegistrar).click();

    }

    public void validarCampoFaltando(String mensagem){
        //Assert.assertEquals(mensagem,getDriver().findElement(criticaCampo).getText());
        checkMensage(criticaCampo,mensagem);
    }


}
