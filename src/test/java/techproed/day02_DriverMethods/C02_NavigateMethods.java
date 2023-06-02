package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_NavigateMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromwDriver", "src/main/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        //Techproeducation sayfasina gidelim
        driver.navigate().to("https://techproeducation.com/");
        Thread.sleep(3000);


        //Sonra Amazon sayfasina gidelim
        driver.navigate().to("https://amazon.com");
        Thread.sleep(3000);

        //Amazon sayfasinin basligini yazdiralim.
        System.out.println("Sayfanin basligi :"+ driver.getTitle());
        Thread.sleep(3000);

        //Techproeducation sayfasina geri donelim
        driver.navigate().back();
        Thread.sleep(3000);

        //Sayfa basligini yazdiralim
        System.out.println("Techproeducation sayfa basligi : "+driver.getTitle());
        Thread.sleep(3000);

        //Amazon sayfasina tekrar gidip url'i yazdiralim
        driver.navigate().forward();
        System.out.println("Amazon sayfasi URL :"+ driver.getCurrentUrl());
        Thread.sleep(3000);

        //Amazon sayfasindayken sayfayi yenileyelim
        driver.navigate().refresh();
        Thread.sleep(3000);

        //Sayfayi kapatalim
        driver.close();
    }
}
