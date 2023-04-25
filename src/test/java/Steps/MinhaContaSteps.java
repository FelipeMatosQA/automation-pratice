package Steps;

import Pages.MinhaContaPage;
import Runner.RunCucumberTest;
import Suport.ScreenShotUtils;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.pt.Entao;

public class MinhaContaSteps extends RunCucumberTest {
    MinhaContaPage minhaContaPage = new MinhaContaPage();

    private String nome = "Felipe";

    @Entao("^o usuario e cadastrado \"([^\"]*)\"$")
    public void o_usuario_e_cadastrado(String nome){
        minhaContaPage.validarMsgLogin("Cadastro realizado!");
        minhaContaPage.validarQuemEstaLogado("Bem-vindo ",nome);

    }

    @After
    public static void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            ScreenShotUtils.takeScreenshotOnScenario(scenario);
        }
    }
}
