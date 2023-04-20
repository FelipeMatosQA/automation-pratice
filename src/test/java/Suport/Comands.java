package Suport;

import Runner.RunCucumberTest;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.sql.SQLOutput;

public class Comands extends RunCucumberTest {

    public static void clickElement(By element){
        System.out.println("######################################");
        try{
            System.out.println("Vai clicar no elemento "+ element);
            Utils.esperarPorElementoEstarClicavel(element,10000);
            getDriver().findElement(element).click();
            System.out.println("Clicou no elemento "+ element);
        }catch (Exception erro){
            System.out.println("Ocorreu um erro ao tentar clicar no elemento " + element);
            System.out.println(erro);
            }
        System.out.println("######################################");
        }

    public static void fillField(By element,String valor){
        System.out.println("######################################");
        try{
            System.out.println("Vai preencher o campo "+ element);
            Utils.esperarPorElementoEstarVisivel(element,10000);
            getDriver().findElement(element).sendKeys(valor);
            System.out.println("Preencheu o campo "+ element);
        }catch (Exception erro){
            System.out.println("Ocorreu um erro ao tentar preencher o campo " + element);
            System.out.println(erro);
        }
        System.out.println("######################################");
    }

    public static void checkMensage(By element, String expectedMensage){
        System.out.println("######################################");
        System.out.println("Vai validar a mensagem "+ expectedMensage);
        Utils.esperarPorElementoEstarVisivel(element,10000);
        Assert.assertEquals("Erro ao validar a mensagem.",expectedMensage,getDriver().findElement(element).getText());
        System.out.println("Validou a mensagem "+ expectedMensage);
        System.out.println("######################################");
    }

}
