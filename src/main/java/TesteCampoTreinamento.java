import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TesteCampoTreinamento

{

    @Test
    public void teste(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///" + System.getProperty("user.dir")  + "/src/main/resources/componentes.html");
        driver.quit();

    }

    @Test
    public void testeTextField(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///" + System.getProperty("user.dir")  + "/src/main/resources/componentes.html");
        driver.findElement(By.id("elementosForm:nome")).sendKeys("Teste Inicial");
        driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("Linha Complementar");
        driver.findElement(By.id("elementosForm:sexo:0")).click();
        //driver.findElement(By.id("elementosForm:sexo:1")).click();
        driver.findElement(By.id("elementosForm:comidaFavorita:0")).click();

        //driver.findElements(By.id("elementosForm:escolaridade") List("2grauincomp"));


        driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Área de texto derivada para comentários.");

        //driver.quit();

    }

    @Test
    public void testeTextArea(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///" + System.getProperty("user.dir")  + "/src/main/resources/componentes.html");
        driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Área de texto derivada para comentários.");

        //driver.quit();

    }

}
