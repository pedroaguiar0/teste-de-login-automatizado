package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SignTest {
    @Test
    public void testFazerLogin(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver navegador = new ChromeDriver(options);
        System.setProperty("webdriver.chrome.driver","C:\\Users\\eluca\\Desktop\\drive\\chromedriver.exe");

        navegador.get("https://www.fbb.org.br/pt-br/ra/conteudo/teste-login");

        navegador.findElement(By.name("username")).sendKeys("pedroaguiar00");
        navegador.findElement(By.name("password")).sendKeys("@pedro1234");
        navegador.findElement(By.name("Submit")).click();

        assertEquals(1,1);
    }
}
