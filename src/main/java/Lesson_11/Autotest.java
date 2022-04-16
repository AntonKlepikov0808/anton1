import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;





public class Lesson_11 {
    public WebDriver driver;
    public WebDriverWait wait;

    public static String getRandomString(int length) {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }


    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupTest() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(2));
        driver.manage().window().maximize();



    }

    @AfterEach
    void teardown() {
        driver.quit();
    }


    @Test
    public void enterName() throws InterruptedException {
        driver.get("https://www.bbc.com/");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("idcta-username")));
        driver.findElement(By.id("idcta-username")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".sb-link:nth-child(2) > span")));
        driver.findElement(By.cssSelector(".sb-link:nth-child(2) > span")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("<div class=\"spinner spinner--fill\"></div>")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("16 or over")));
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("16 or over")));
        WebElement button = driver.findElement(By.linkText("16 or over"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", button);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("day-input")));
        driver.findElement(By.id("day-input")).sendKeys("08");
        driver.findElement(By.id("month-input")).sendKeys("08");
        driver.findElement(By.id("year-input")).sendKeys("1995");
        WebElement submitButton = driver.findElement(By.id("submit-button"));
        executor.executeScript("arguments[0].click()", submitButton);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("user-identifier-input")));
        WebElement uesrIndentiferButton = driver.findElement(By.id("user-identifier-input"));
        executor.executeScript("arguments[0].click()", uesrIndentiferButton);
        driver.findElement(By.id("user-identifier-input")).sendKeys(getRandomString(2) +"tester@internet.ru");
        driver.findElement(By.id("password-input")).click();
        driver.findElement(By.id("password-input")).sendKeys("Qwe123qwe");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".sb-background")));
        driver.findElement(By.cssSelector(".sb-background")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("submit-button")));
        driver.findElement(By.id("submit-button")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".button:nth-child(2) .button__text-wrapper")));
        driver.findElement(By.cssSelector(".button:nth-child(2) .button__text-wrapper")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("submit-button")));
        driver.findElement(By.id("submit-button")).click();
    }
}
