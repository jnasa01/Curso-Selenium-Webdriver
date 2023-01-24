import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TesteGoogle {

    @Test
    public void teste(){
        //Setando as propriedades dos navegadores
        //System.setProperties("webdriver.chrome.driver","C:\\Users\\jnasa\\Downloads\\geckodiver.exe" );
        //System.setProperties("webdriver.chrome.driver","C:\\Users\\jnasa\\Downloads\\ChromeDriver.exe" );

        //Abrindo instancia dos navegadores Chrome ou Firefox
        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new FirefoxDriver();
        //WebDriver driver = new InternetExplorerDriver(); // Validar configuração
        //WebDriver driver = new EdgeDriver();// Validar configuração
        //driver.manage().window().setSize(new Dimension(1200,765));
        driver.manage().window().maximize();

        driver.get("http://www.google.com");
        //System.out.println(driver.getTitle());
        Assert.assertEquals("Google", driver.getTitle());

        //driver.quit();

    }

}
