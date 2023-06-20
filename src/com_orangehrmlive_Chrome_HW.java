import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class com_orangehrmlive_Chrome_HW {

    /**
     * 1. Setup chrome browser                              Done,
     * 2. Open URL                                          Done,
     * 3. Print the title of the page                       Done,
     * 4. Print the current url                             Done,
     * 5. Print the page source
     * 6. Enter the email to email field
     * 7. Enter the password to password field
     * 8. Close the browser
     */
    public static void main(String[] args) {
        // 1. Setup chrome browser
        String baseURL = "https://opensource-demo.orangehrmlive.com";
        WebDriver driver = new ChromeDriver();

        // 6.1 For Enter Login detals need to Maximize the Page
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // 2. Open URL
        driver.get(baseURL);

        // 3. Print the title of the page
        String title = driver.getTitle();
        System.out.println("Page Title is " + title);

        // 4. Print the current url
        System.out.println("Current URL : " + driver.getCurrentUrl());

        // 5. Print the page source
        System.out.println("Page source : " + driver.getPageSource());

        // 6.2 Enter the email to email field (need to find "Where to login") Step 1.
        WebElement emailField = driver.findElement(By.name("username"));
        emailField.sendKeys("komalspatel@prime.com");

        // 7. Enter the password to password field
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("LalaHula@.com");

        // 8. Close the browser
        driver.close();
    }

}
