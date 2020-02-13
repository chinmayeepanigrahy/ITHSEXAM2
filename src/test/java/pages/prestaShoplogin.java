package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class prestaShoplogin {

    public static WebElement signInButton(WebDriver driver)
    {
        WebElement element = driver.findElement(By.xpath("//iframe[@id='framelive']"))
                ;

        return element;
        }
}
