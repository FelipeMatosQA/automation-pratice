package Steps;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.MinhaContaPage;
import Runner.RunCucumberTest;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class LoginSteps extends RunCucumberTest {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    MinhaContaPage minhaContaPage = new MinhaContaPage();


    @Dado("^que eu estou na tela de login$")
    public void que_eu_estou_na_tela_de_login() {
        homePage.acessarSite();
        homePage.acessarLogin();
    }

    @Quando("^eu preencho os campos de \"([^\"]*)\" e \"([^\"]*)\"$")
    public void eu_preencho_os_campos_de_e(String email, String senha) {
        loginPage.preencherEmail(email);
        loginPage.preencherSenha(senha);

    }

    @Quando("^clico em login$")
    public void clico_em_login() {
        loginPage.clicarLogin();

    }

    @Entao("^o login e efetuado \"([^\"]*)\"$")
    public void o_login_e_efetuado(String email) {
        minhaContaPage.validarMsgLogin("Login realizado");
        minhaContaPage.validarQuemEstaLogado("Olá, ", email);
    }



    @Entao("^e exibido critica \"([^\"]*)\"$")
    public void e_exibido_critica(String critica) {

        loginPage.validarCampoFaltando(critica);
    }

}




