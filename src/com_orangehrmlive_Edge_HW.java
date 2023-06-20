import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class com_orangehrmlive_Edge_HW {
    static String browser = "Firefox";
    static String baseURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login/";
    static WebDriver driver;

    /**
     * 1. Setup chrome browser
     * 2. Open URL
     * 3. Print the title of the page
     * 4. Print the current url
     * 5. Print the page source
     * 6. Enter the email to email field
     * 7. Enter the password to password field
     * 8. Close the browser
     */
    public static void main(String[] args) {
        // 1. Setup chrome browser
        String baseURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        WebDriver driver = new EdgeDriver();

        // 2. Open URL
        driver.get(baseURL);

        // 3. Print the title of the page
        String title = driver.getTitle();
        System.out.println("Page Title is " + title);

        // 4. Print the current url
        System.out.println("Currunt URL : " + driver.getCurrentUrl());

        // 5. Print the page source
        System.out.println("Page source : " + driver.getPageSource());

        // 6.1 For Enter Login detals need to Maximize the Page
        driver.manage().window().maximize();

        // 6.2 Enter the email to username field (need to find "Where to login") Step 1.
        WebElement emailField = driver.findElement(By.name("username"));

        // 6.3 Enter the email to username field
        emailField.sendKeys("komalspatel@prime.com");

        // 7. Enter the password to password field
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys(("LalaHula@.com"));
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
            //8. Close the browser
            driver.close();
        }
    }
}

