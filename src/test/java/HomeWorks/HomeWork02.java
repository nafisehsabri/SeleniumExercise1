package HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork02 {
    public static void main(String[] args) throws InterruptedException {
//instance
        WebDriver driver = new ChromeDriver();
// goto facebook.com
        driver.get("https://demoqa.com/text-box");
//        maximize the window
        driver.manage().window().maximize();

//        find the fullName box and send some keys
        WebElement fullName = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        fullName.sendKeys("Jessica Simpson");
//find the email box and send keys
        WebElement email = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
        email.sendKeys("jessica.simpson123@gmail.com");

//find the currentAddress box and send keys
        WebElement currentAddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        currentAddress.sendKeys("Hollywood, CA, USA");

//find the permanentAddress box and send keys
        WebElement permanentAddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        permanentAddress.sendKeys("Hollywood, CA, USA");
        Thread.sleep(3000);

//click the submitBtn
        WebElement submitBtn =driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
        submitBtn.click();
        //driver.quit();


    }
}