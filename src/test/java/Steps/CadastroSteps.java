package Steps;

import Pages.CadastroPage;
import Pages.HomePage;
import Pages.MinhaContaPage;
import Runner.RunBase;
import Runner.RunCucumberTest;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CadastroSteps extends RunCucumberTest {
    MinhaContaPage minhaContaPage = new MinhaContaPage();
    CadastroPage cadastroPage = new CadastroPage();
    HomePage homePage = new HomePage();

    //private  String nome = "Felipe";

    private String email = "felipematos@yopmail.com";


    @Dado("^que eu estou na tela de cadastro$")
    public void que_eu_estou_na_tela_de_cadastro(){
        homePage.acessarSite();
        homePage.acessarCadastro();

    }

    @Quando("^eu preencho os campos \"([^\"]*)\" e \"([^\"]*)\" com um novo email$")
    public void eu_preencho_os_campos_e_com_um_novo_email(String nome, String senha){
        cadastroPage.preencherCampoNome(nome);
        cadastroPage.preencherCampoEmailAleatorio();
        cadastroPage.preencherCampoSenha(senha);
    }

    @Dado("^preencho os campos de cadastro \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void preencho_os_campos_de_cadastro(String nome, String email, String senha){
        cadastroPage.preencherCampoNome(nome);
        cadastroPage.preencherCampoEmail(email);
        cadastroPage.preencherCampoSenha(senha);

    }

    @Quando("^clico em cadastrar$")
    public void clico_em_cadastrar() {
        cadastroPage.clicarBotaoCadastrar();
    }


    @Entao("^e exibido mensagem de critica \"([^\"]*)\"$")
    public void e_exibido_mensagem_de_critica(String mensagem) {
        cadastroPage.validarCampoFaltando(mensagem);
    }



    @Entao("^e exibido critica de cadastro sem email$")
    public void eExibidoCriticaDeCadastroSemEmail() {
        cadastroPage.validarCampoFaltando("O campo e-mail deve ser prenchido corretamente");
    }

    @E("^preencho o email$")
    public void preenchoOEmail() {
        cadastroPage.preencherCampoEmail(email);
    }

    @Entao("^e exibido critica de cadastro sem senha$")
    public void eExibidoCriticaDeCadastroSemSenha() {
        cadastroPage.validarCampoFaltando("O campo senha deve ter pelo menos 6 dígitos");
    }
}
