package clase2;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Localizadores {

    @Test
    /* public void forgotAccountTest() throws InterruptedException {
        System.setProperty("WebDriver.chrome.driver" , "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();


        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        System.out.println("drive" + driver.getTitle());
        driver.findElement(By.linkText("¿Has olvidado la contraseña?")).click();


        String actualTitle = driver.getTitle();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        Assert.assertEquals(actualTitle, "¿Has olvidado la contraseña? | No puedo entrar | Facebook", "¿Has olvidado tu contraseña");
        Assert.assertNotEquals(driver.getCurrentUrl(),"Se deberia estar en otra URL", "https://www.facebook.com/");

        driver.close();

     }*/

    /*public void forgotAccountPartialLinkTest(){
        System.setProperty("WebDriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        driver.findElement(By.partialLinkText("¿Has olvidado la contraseña?")).click();

        Assert.assertEquals(driver.getTitle(),"¿Has olvidado la contraseña? | No puedo entrar | Facebook", "¿Has olvidado la contraseña?" );
    }*/

    /*public void customSalesforceLink(){
        System.setProperty("WebDriver.Chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/");

        driver.findElement(By.id("username")).sendKeys("as");
        driver.findElement(By.id("password")).sendKeys("test@test");
        driver.findElement(By.name("Login")).click();
    }*/

    /*public void checkBoxAndComboboxTest(){

        System.setProperty("WebDriver.Chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        driver.findElement(By.linkText("Crear cuenta nueva")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(By.name("firstname")).sendKeys("Alan");
        driver.findElement(By.name("lastname")).sendKeys("Smith");
        List<WebElement>listSex = driver.findElements(By.name("sex"));
        System.out.println("La cantidad de elementos encontrados es ..." + listSex.size());
        WebElement gender = listSex.get(0);
        gender.click();

        WebElement dias = driver.findElement(By.id("day"));
        Select comboboxDias = new Select(dias);
        comboboxDias.selectByValue("4");

        WebElement elementMeses = driver.findElement(By.id("month"));
        Select selectMes = new Select(elementMeses);
        selectMes.selectByVisibleText("oct");

        WebElement año = driver.findElement(By.id("year"));
        Select comboboxAño = new Select(año);
        comboboxAño.selectByIndex(9);
    }*/

    /*public void brirthdateTest() {


        System.setProperty("WebDriver.Chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        driver.findElement(By.linkText("Crear cuenta nueva")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


      WebElement dias = driver.findElement(By.id("day"));
        Select comboboxDias = new Select(dias);
        comboboxDias.selectByValue("20");

        WebElement elementMeses = driver.findElement(By.id("month"));
        Select selectMes = new Select(elementMeses);
        selectMes.selectByVisibleText("dic");

        WebElement año = driver.findElement(By.id("year"));
        Select comboboxAño = new Select(año);
        comboboxAño.selectByIndex(33);
    }*/
    /*---public void comboboxTest(){

        System.setProperty("WebDriver.Chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        driver.findElement(By.linkText("Crear cuenta nueva")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        WebElement Mes = driver.findElement(By.name("birthday_month"));
        Select combo = new Select(Mes);

        List<WebElement> options = combo.getOptions();
        Assert.assertNotEquals(0,options.size());

        boolean encontrar = false;

        for (WebElement opt : options){
            System.out.println(opt.getText());
            if(opt.getText().contentEquals("jun")) {
                encontrar = true;
                break;
            }
        }
        Assert.assertTrue(encontrar);
    }---*/


        public void completeRegistration () {

            System.setProperty("WebDriver.Chrome.driver", "drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.facebook.com/");

            driver.findElement(By.linkText("Crear cuenta nueva")).click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            WebElement firstname = driver.findElement(By.name("firstname"));
            firstname.sendKeys("The");

            WebElement lastname = driver.findElement(By.name("lastname"));
            lastname.sendKeys("Smith");

            WebElement phone = driver.findElement(By.name("reg_email__"));
            phone.sendKeys("12345666666");

            WebElement password = driver.findElement(By.name("reg_passwd__"));
            password.sendKeys("clave123");
            setBirthdate(, "22", "jun", "1998");


        }

        private void setBirthdate (WebDriver driver, String day, String month, String year){


            WebElement dias = driver.findElement(By.name("birthday_day"));
            Select comboDia = new Select(dias);
            comboDia.selectByVisibleText(day);

            WebElement mes = driver.findElement(By.name("birthday_month"));
            Select comboMes = new Select(mes);
            comboDia.selectByVisibleText(month);

            WebElement ano = driver.findElement(By.name("birthday_year"));
            Select comboano = new Select(ano);
            comboDia.selectByVisibleText(year);

        }
    }

}

