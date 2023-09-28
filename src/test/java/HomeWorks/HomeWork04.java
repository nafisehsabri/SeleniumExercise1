package HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork04 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/basic-radiobutton-demo.php.");
        driver.manage().window().maximize();

        Thread.sleep(10000);
        WebElement femaleBtn = driver.findElement(By.xpath("//input[@value='gender-female']"));
        boolean femaleBtnStatus = femaleBtn.isDisplayed();
        System.out.println("female radio button is displayed " + femaleBtnStatus);
        WebElement showBtn = driver.findElement(By.xpath("//button[@id='toggleRadioButtons']"));
        showBtn.click();

        boolean lastFemaleBtnStatus = femaleBtn.isDisplayed();
        System.out.println("female radio button is displayed " + lastFemaleBtnStatus);
    }
}

