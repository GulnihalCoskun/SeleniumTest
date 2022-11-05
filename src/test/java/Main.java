import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,450)", "");

        WebElement elementButton = driver.findElement(By.xpath("//h5[normalize-space()='Elements']"));
        elementButton.click();

        WebElement webTables = driver.findElement(By.xpath("//span[normalize-space()='Web Tables']"));
        webTables.click();

        WebElement addButton = driver.findElement(By.cssSelector("#addNewRecordButton\n"));
        addButton.click();

        WebElement firstName = driver.findElement(By.cssSelector("#firstName"));
        firstName.click();
        firstName.sendKeys("Gülnihal");

        WebElement lastName = driver.findElement(By.cssSelector("#lastName"));
        lastName.click();
        lastName.sendKeys("Coskun");

        WebElement eMail = driver.findElement(By.cssSelector("#userEmail"));
        eMail.click();
        eMail.sendKeys("gulnihal.9850@gmail.com");

        WebElement age = driver.findElement(By.cssSelector("#age"));
        age.click();
        age.sendKeys("24");

        WebElement salary = driver.findElement(By.xpath("//input[@id='salary']"));
        salary.click();
        salary.sendKeys("0");

        WebElement department = driver.findElement(By.cssSelector("#department"));
        department.click();
        department.sendKeys("Engineer");

        WebElement submitButton = driver.findElement(By.cssSelector("#submit"));
        submitButton.click();

        driver.quit();

    }
}