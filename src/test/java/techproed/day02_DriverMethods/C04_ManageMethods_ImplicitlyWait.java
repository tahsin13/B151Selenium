package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethods_ImplicitlyWait {
    public static void main(String[] args) {
        System.setProperty("chromwDriver", "src/main/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       /*
    implicitlyWait(Duration.ofSeconds(20)) Sayfadaki webElementleri gorunur olana kadar(sayfada olusana kadar)
    maximum 20 saniye bekler. Eger 2 saniyede olusursa 2 saniye bekler ve alt satira gecer . Fakat belirttigimiz
    sure boyunca internetten ya da sayfadan kaynakli webElementler olusmazsa testimiz "FAIL" verir
    Thread.sleep() java kodlarini bizim belirttigimiz sure kadar bekler. 30 saniye beklemesini belirtirsem
    30 saniye bekler ve alt satira gecer .
        */

        //techproed sayfasina gidelim
        String techproUrl="https://techproeducation.com";
        driver.get(techproUrl);

        //amazona gidelim
        String amazonUrl="https://amazon.com";
        driver.get(amazonUrl);

        //techpro sayfasina geri donelim
        driver.navigate().back();

        //sayfa basligini Techpro icerdigini test edelim
        String actualTitle= driver.getTitle();
        String arananKelime="Techpro";
        if(actualTitle.contains(arananKelime)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        //tekrar amazon sayfasina gidelim
        driver.navigate().forward();

        //sayfa basligini Amazon icerdigini test edelim
        String actualTitleAmazon=driver.getTitle();
        String arananKelimeAmazon="Amazon";
        if(actualTitleAmazon.contains(arananKelimeAmazon)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        //Sayfayi kapatiniz
        driver.close();

    }
}
