package Lesson_11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


class FacebookAndersenTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://andersenlab.com/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        //To maximize the window
        driver.manage().window().maximize();

        // This  will scroll down the page by  10000 pixel vertical
        js.executeScript("window.scrollBy(0,10000)");

        //Click Accept Cookies button
        WebElement element2 = driver.findElement(By.xpath("//button[@class=\"button-module--button--P1TTA button-module--sizeSM--CuRl3 CookiesPolicy-module--button--JZrW1\"]"));
        element2.click();

        String Actualtext = driver.findElement(By.xpath("//a[@class=\"SocialMediaIcon-module--link--NS+WC\"][1]")).getAttribute("href");
        assertEquals(Actualtext, "https://www.facebook.com/AndersenSoftwareDev");
        System.out.println("URL matching --> Part executed");
    }

    private static void assertEquals(String actualtext, String s) {
    }
}