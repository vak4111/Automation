package Selenium.Waits;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class ImplicitWait {

    public static void main(String[] args) throws InterruptedException {

       WebDriver  NewDriver = new ChromeDriver();
       NewDriver.manage ().window ().maximize ();
       NewDriver.get ( "https://www.flipkart.com/" );
//       Thread.sleep ( 1000 );
//
//       NewDriver.manage ().timeouts ().implicitlyWait( Duration.ofSeconds ( 3000 ));
        }

    }

