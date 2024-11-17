package Selenium.Waits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FluentWait {


    /*  Fluent wait code is defined in the selenium. It waits for polling duration of 5 second for total wait provided e.g 30 sec.
    * if condition passes in first polling it will pass and move ahead with execution*/
    public static void main(String[] args) {
//Create instance of driver
        WebDriver driver = new ChromeDriver (  );
//Fluent waits for polling duration of 5 second for total wait provided e.g 30 sec
        Wait<WebDriver> mywait = new org.openqa.selenium.support.ui.FluentWait<> (driver )
                .withTimeout ( Duration.ofSeconds ( 30 )).pollingEvery (Duration.ofSeconds ( 5 )).ignoring ( NoSuchFieldException.class);




    }
}
