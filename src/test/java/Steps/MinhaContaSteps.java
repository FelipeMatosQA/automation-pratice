package Steps;

import Pages.MinhaContaPage;
import Runner.RunCucumberTest;
import cucumber.api.java.pt.Entao;

public class MinhaContaSteps extends RunCucumberTest {
    MinhaContaPage minhaContaPage = new MinhaContaPage();

    private String nome = "Felipe";

    @Entao("^o usuario e cadastrado \"([^\"]*)\"$")
    public void o_usuario_e_cadastrado(String nome){
        minhaContaPage.validarMsgLogin("Cadastro realizado!");
        minhaContaPage.validarQuemEstaLogado("Bem-vindo ",nome);

    }
}
