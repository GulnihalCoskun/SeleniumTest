import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {

    WebDriver driver; //Kodun temiz olması için burda tanımlama yaptık. Tekrar yazmamak için.
    @BeforeTest
    public void testtenOncekiAdimlar() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void anaSayfaBaglanma(){
        driver.get("https://www.google.com");
    }

    @AfterTest
    public void testSonrasiAdimlar(){driver.quit();
    }
}
