package seleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class NavigateMethod {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        //driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();


        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

         driver.navigate().back();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().refresh();

    }



}
