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
        fillField(campoEMail,Utils.gerarEmailAleatorio());
    }

    public void preencherCampoEmail(String email){
        fillField(campoEMail,email);
    }

    public void preencherCampoSenha(String senha){
        fillField(campoSenha,senha);
    }

    public void preencherCampoNome(String nome){
        fillField(campoNome,nome);
    }

    public void clicarBotaoCadastrar(){
        clickElement(botaoRegistrar);

    }

    public void validarCampoFaltando(String mensagem){
        checkMensage(criticaCampo,mensagem);
    }


}
