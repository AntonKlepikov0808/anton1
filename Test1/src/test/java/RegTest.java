
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;




public class RegTest {
    public WebDriver driver;
    public WebDriverWait wait;

    public static String getRandomString(int length){
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<length;i++){
            int number=random.nextInt(62);
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
        wait = new WebDriverWait(driver, Duration.ofSeconds(6));
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }


    @Test
    public void enterName() throws InterruptedException {
        driver.get("https://diary.ru/user/registration");
        WebElement loginField = driver.findElement(By.xpath("//input[@id=\"signupform-username\"]"));
        WebElement passField = driver.findElement(By.xpath("//input[@id=\"signupform-password\"]"));
        WebElement e_mailField = driver.findElement(By.xpath("//input[@id=\"signupform-email\"]"));
        WebElement checkBox = driver.findElement(By.xpath("//*[@id=\"chk_box_user_confirm\"]"));
        loginField.sendKeys("AntonSuperPes" + getRandomString(2));
        passField.sendKeys("Klepss1244$");
        e_mailField.sendKeys(getRandomString(1) + "litllerockstart@mail.by");
        checkBox.click();
        WebElement buttonReg = driver.findElement(By.xpath("//*[@id=\"signup_btn\"]"));
        buttonReg.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"navbar_user-collapse\"]/ul[1]/li[8]/a")));

        String text = driver.findElement(By.xpath("//*[@id=\"newblogform-community\"]/div[1]/label")).getText();
        System.out.println(text);
        Assertions.assertEquals("Создать дневник", text);


    }
}
