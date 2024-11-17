package NavigationCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class windowHandles {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver (  );

        driver.get ( "https://www.flipkart.com/" );
        driver.manage ().window ().maximize ();
//get window id of first window
        driver.getWindowHandle ();

        //Get the title of first window
        System.out.println ( driver.getTitle ( ) );

        //Get the list of window handles as Set collection
         Set<String> windHanles=driver.getWindowHandles ();

     // Convert Set collection into List as SET DOES NOT provide option to choose individually
        List<String> WindowList = new ArrayList<> ( windHanles );

    // Get The parent and child windows
        String ParentHandle = WindowList.get ( 0 );
        String ChildHandle = WindowList.get ( 1 );

    //using switch method get the title of parent window
        driver.switchTo ().window ( ParentHandle );
        System.out.println (driver.getTitle ());

        //using switch method get the title of parent window
        driver.switchTo ().window ( ParentHandle );
        System.out.println (driver.getTitle ());
    }
}
