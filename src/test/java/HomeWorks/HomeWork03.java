package HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork03 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/basic-checkbox-demo.php.");
        driver.manage().window().maximize();

        Thread.sleep(10000);
        WebElement checkBox1 = driver.findElement(By.xpath("//input[@value='Checkbox-1']"));
        checkBox1.click();
        boolean enabledState = checkBox1.isEnabled();
        if (enabledState) {
            System.out.println("checkbox1 is enabled");
        } else {
            System.out.println("checkbox1 is not enabled");
            WebElement disableCheckBoxBtn = driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
            disableCheckBoxBtn.click();
        }
        Thread.sleep(10000);
        checkBox1.click();
        System.out.println("checkbox1 is enabled now");

        Thread.sleep(10000);
        boolean lastSelectState = checkBox1.isSelected();
        if (lastSelectState) {
            System.out.println("checkbox1 is selected");
        } else {
            System.out.println("checkbox1 is not selected");
        }
    }
}




