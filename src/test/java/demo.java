import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class demo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/gp/cart/view.html?ref_=nav_cart");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println(links);

        driver.quit();
    }
}
