package Suport;

import Runner.RunCucumberTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class Utils extends RunCucumberTest {

    public static void esperarPorElementoEstarClicavel(By elemento, int tempo){

        WebDriverWait wait = new WebDriverWait(getDriver(), tempo);
        wait.until(ExpectedConditions.elementToBeClickable(elemento));

    }

    public static void esperarPorElementoEstarVisivel(By elemento, int tempo){

        WebDriverWait wait = new WebDriverWait(getDriver(), tempo);
        wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));

    }

    public static String gerarEmailAleatorio(){

        String email_init = "seleniumEmail";
        String email_final = "@yopmail.com";

        Random random = new Random();

        int minimo = 1;
        int maximo = 999999;
        int resultado = random.nextInt(maximo-minimo) + minimo;

        return email_init + resultado + email_final;
    }


}
