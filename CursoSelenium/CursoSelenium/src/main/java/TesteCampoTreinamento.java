import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteCampoTreinamento {

	@Test
	public void teste(){
		WebDriver driver = new FirefoxDriver();
		//Maximizando a tela do brownser
		driver.manage().window().setSize(new Dimension(1200, 765));
		//Acessando formulário componentes.html no diretório Resources do código selenium
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		

		
//		driver.quit();
	}
}
