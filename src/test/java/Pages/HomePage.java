package Pages;

import Runner.RunCucumberTest;
import org.openqa.selenium.By;

import static Suport.Comands.clickElement;


public class HomePage extends RunCucumberTest {

    private By acessarCadastro = By.xpath("//ul[@class=\"right_list_fix\"]/li[2]/a");

    public String url = "http://automationpratice.com.br";

    private By acessarLogin = By.xpath("//ul[@class =\"right_list_fix\"]/li/a");

    private By botaoLogin = By.id("btnLogin");

    public void acessarSite(){
        getDriver(System.getProperty("browser"));
        getDriver().get(url);
    }

    public void acessarCadastro(){
        clickElement(acessarCadastro);
    }

    public void acessarLogin(){
        clickElement(acessarLogin);
    }
}
