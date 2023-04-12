package Pages;

import Runner.RunCucumberTest;

import Suport.Utils;
import org.openqa.selenium.By;


public class HomePage extends RunCucumberTest {

    private By acessarCadastro = By.xpath("//ul[@class=\"right_list_fix\"]/li[2]/a");

    public String url = "http://automationpratice.com.br";

    private By acessarLogin = By.xpath("//ul[@class =\"right_list_fix\"]/li/a");

    private By botaoLogin = By.id("btnLogin");

    public void acessarSite(){
        getDriver("firefox");
        getDriver().get(url);
    }

    public void acessarCadastro(){
        getDriver().findElement(acessarCadastro).click();

    }

    public void acessarLogin(){
        getDriver().findElement(acessarLogin).click();
       // Utils.esperarPorElementoEstarClicavel(By.id("btnLogin"),10);

    }
}
