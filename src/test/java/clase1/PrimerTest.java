package clase1;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimerTest {


@Test
    /*public void testEnWindows(){
    System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.google.com/");

}*/

public void senKeysToFacebook(){

    System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com/");

    driver.findElement(By.id("email")).sendKeys("test@test.com");
    driver.findElement(By.id("pass")).sendKeys("holamundo");
    driver.findElement(By.name("login")).click();


}


}

