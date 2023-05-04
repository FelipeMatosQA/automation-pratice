package Pages;

import Runner.RunCucumberTest;
import org.openqa.selenium.By;

import static Suport.Comands.checkMensage;


public class MinhaContaPage extends RunCucumberTest {


    private By cadastroRealizado = By.id("swal2-title");

    private By campoBemVindo = By.id("swal2-html-container");

    private By botaoOK = By.className("swal2-confirm swal2-styled");

    public void validarMsgLogin(String bemVindo){
        checkMensage(cadastroRealizado,bemVindo);
    }

    public void validarQuemEstaLogado(String mensagem,String nome ){
        checkMensage(campoBemVindo,mensagem + nome);
    }


}
