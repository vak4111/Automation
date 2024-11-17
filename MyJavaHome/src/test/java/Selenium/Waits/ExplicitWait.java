package Selenium.Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    public static void main(String[] args) {
//Create Intsance of Webdrive
        WebDriver driver = new ChromeDriver (  );

//Create declaration of explicit wait. Remember ** WebDriverWait Object needs to be created
        WebDriverWait Mywait = new WebDriverWait ( driver, Duration.ofSeconds (10));

//Provide the condition to be executed. use of until function
        WebElement TxtInput = Mywait.until ( ExpectedConditions.visibilityOfElementLocated ( By.cssSelector ( "css" ) ));
        TxtInput.sendKeys ("abc"  );


           }
}
