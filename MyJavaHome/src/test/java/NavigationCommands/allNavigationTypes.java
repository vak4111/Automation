package NavigationCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class allNavigationTypes {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver (  );
        driver.get ( "https://www.flipkart.com/" );
        driver.manage ().window ().maximize ();
        driver.get ( "https://www.amazon.in/" );

        driver.navigate ().back ();
          driver.navigate ().forward ();
           System.out.println (driver.getCurrentUrl () );
           driver.navigate ().refresh ();

    }
}
