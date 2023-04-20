package Pages;

import Runner.RunCucumberTest;
import Suport.Utils;
import org.junit.Assert;
import org.openqa.selenium.By;

import static Suport.Comands.checkMensage;


public class MinhaContaPage extends RunCucumberTest {





    private By cadastroRealizado = By.id("swal2-title");

    private By campoBemVindo = By.id("swal2-html-container");

    private By botaoOK = By.className("swal2-confirm swal2-styled");

    public void validarMsgLogin(String bemVindo){
        //Utils.esperarPorElementoEstarVisivel(cadastroRealizado,20);
        //Assert.assertEquals(bemVindo,getDriver().findElement(cadastroRealizado).getText());
        checkMensage(cadastroRealizado,bemVindo);
    }

    public void validarQuemEstaLogado(String mensagem,String nome ){
        //Assert.assertEquals(mensagem + nome,getDriver().findElement(campoBemVindo).getText());
        checkMensage(campoBemVindo,mensagem + nome);
    }


}
