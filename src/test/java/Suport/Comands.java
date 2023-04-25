package Suport;

import Runner.RunCucumberTest;
import org.junit.Assert;
import org.openqa.selenium.By;



public class Comands extends RunCucumberTest {

    public static void clickElement(By element){
            System.out.println("######################################");
            Utils.esperarPorElementoEstarClicavel(element,10);
            getDriver().findElement(element).click();
            System.out.println("Clicou no elemento "+ element);
            System.out.println("######################################");
        }

    public static void fillField(By element,String valor){
        System.out.println("######################################");
        Utils.esperarPorElementoEstarVisivel(element,10);
        getDriver().findElement(element).sendKeys(valor);
        System.out.println("Preencheu o campo "+ element);
        System.out.println("######################################");
    }

    public static void checkMensage(By element, String expectedMensage){
        System.out.println("######################################");
        Utils.esperarPorElementoEstarVisivel(element,10);
        Assert.assertEquals("Erro ao validar a mensagem.",expectedMensage,getDriver().findElement(element).getText());
        System.out.println("Validou a mensagem "+ expectedMensage);
        System.out.println("######################################");
    }

}
