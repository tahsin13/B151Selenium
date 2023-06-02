package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Drivermethods_ClassWork {
    public static void main(String[] args) {
        System.setProperty("chromwDriver", "src/main/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        //Amazon sayfasina gidelim.
        driver.get("https://amazon.com");
        //Sayfa basliginin Amazon icerdigini test edelim.
        String actualTitel = driver.getTitle();
        String expectedTitle = "Amazon";
        if (actualTitel.contains(expectedTitle)) {
            System.out.println("Test PASSED");
        } else System.out.println("Test FAIL");

        //Url in https://www.amazon.com/ oldugunun test edelim
        String actualUrl = driver.getCurrentUrl();

        String expectedUrl="https://www.amazon.com/";
        if(actualUrl.equals(expectedUrl)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAIL");

        //Sayfayi kapatalim
        driver.close();//Browser 'i kapatir.
        //driver.quit(); -> Birden fayla browser varsa hepsini kapatir.



    }
}
