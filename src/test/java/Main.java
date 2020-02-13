import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.prestaShoplogin;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.prestashop.com/#/en/front");
        Thread.sleep(10000);
        prestaShoplogin.signInButton(driver).click();
    }
}
