import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TesteCampoTreinamento

{

    @Test
    public void teste(){
        //Iniciando o ChromeDriver
        WebDriver driver = new ChromeDriver();
        //Maximizando a tela do bronwser
        driver.manage().window().maximize();
        // Abrindo arquivo componente.html no diretorio de resource do cÃ³digo
        driver.get("file:///" + System.getProperty("user.dir")  + "/src/main/resources/componentes.html");
        //fechando a sessÃ£o do brownser
        //driver.quit();

    }

    @Test
    public void testeTextField(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///" + System.getProperty("user.dir")  + "/src/main/resources/componentes.html");
        driver.findElement(By.id("elementosForm:nome")).sendKeys("Teste Inicial");
        Assert.assertEquals("Teste Inicial", driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));
        driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("Linha Complementar");
        Assert.assertEquals("Linha Complementar", driver.findElement(By.id("elementosForm:sobrenome")).getAttribute("value"));

        //driver.quit();

    }

    @Test
    public void deveInteragirComTextArea(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///" + System.getProperty("user.dir")  + "/src/main/resources/componentes.html");
        driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Ã�rea de texto derivada para comentÃ¡rios.\n\nBy Jairo Nascimento");
        Assert.assertEquals("Ã�rea de texto derivada para comentÃ¡rios.\n\nBy Jairo Nascimento", driver.findElement(By.id("elementosForm:sugestoes")).getAttribute("value"));

        //driver.quit();

    }

    @Test
    public void deveInteragirComRadioButton(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///" + System.getProperty("user.dir")  + "/src/main/resources/componentes.html");

        driver.findElement(By.id("elementosForm:sexo:0")).click();
        //ValidaÃ§Ã£o com assertEquals e com AssertTrue
//        Assert.assertEquals("M", driver.findElement(By.id("elementosForm:sexo:0")).getAttribute("value"));
        Assert.assertTrue(driver.findElement(By.id("elementosForm:sexo:0")).isSelected());

//        driver.findElement(By.id("elementosForm:sexo:1")).click();
//        //ValidaÃ§Ã£o com assertEquals e com AssertTrue
//        Assert.assertEquals("F", driver.findElement(By.id("elementosForm:sexo:1")).getAttribute("value"));
//        Assert.assertTrue(driver.findElement(By.id("elementosForm:sexo:1")).isSelected());

        //driver.quit();

    }

    @Test
    public void deveInteragirComCheckBox(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///" + System.getProperty("user.dir")  + "/src/main/resources/componentes.html");

//        driver.findElement(By.id("elementosForm:comidaFavorita:0")).click();
//        Assert.assertEquals("carne", driver.findElement(By.id("elementosForm:comidaFavorita:0")).getAttribute("value"));

//        driver.findElement(By.id("elementosForm:comidaFavorita:1")).click();
//        Assert.assertEquals("frango", driver.findElement(By.id("elementosForm:comidaFavorita:1")).getAttribute("value"));

//        driver.findElement(By.id("elementosForm:comidaFavorita:2")).click();
//        Assert.assertEquals("pizza", driver.findElement(By.id("elementosForm:comidaFavorita:2")).getAttribute("value"));

        driver.findElement(By.id("elementosForm:comidaFavorita:3")).click();
        //Assert.assertEquals("vegetariano", driver.findElement(By.id("elementosForm:comidaFavorita:3")).getAttribute("value"));
        Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:3")).isSelected());

        //driver.quit();

    }



    @Test
    public void deveInteragirComCombox(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///" + System.getProperty("user.dir")  + "/src/main/resources/componentes.html");
        WebElement element = driver.findElement(By.id("elementosForm:escolaridade"));
        Select combo = new Select(element);
        //SeleÃ§Ã£o por Index
        //combo.selectByIndex(0);
        //SeleÃ§Ã£o por Value
        //combo.selectByValue("doutorado");
        //SeleÃ§Ã£o por Visible Text
        combo.selectByVisibleText("2o grau incompleto");
        Assert.assertEquals("2o grau incompleto", combo.getFirstSelectedOption().getText());

        //driver.quit();

    }

    @Test
    public void deveVerficarvaloresCombox() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
        WebElement element = driver.findElement(By.id("elementosForm:escolaridade"));
        Select combo = new Select(element);
        List<WebElement> options = combo.getOptions();
        //Validando o tamanho da lista
        //Assert.assertEquals(8, options.size());

        boolean encontrou = false;
        for (WebElement option: options ) {
            if (option.getText().equals("Mestrado")) {
                encontrou = true;
                break;
            }
        }
            Assert.assertTrue(encontrou);


        //driver.quit();
    }

}