import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStockbit {
    WebDriver driver = null;
    @Given("Open browser Stockbit")
    public void openBrowserStockbit() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fachrurazy Atijani\\IdeaProjects\\automation-bdd-google\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @And("Open Login Page Stockbit")
    public void openLoginPageStockbit() throws InterruptedException {
        driver.get("https://stockbit.com/login");
        Thread.sleep(2000);
    }

    @When("User Do Enter Email {string}")
    public void userDoEnterEmail(String usernameval) {
        driver.findElement(By.id("username")).sendKeys(usernameval);
    }

    @When("User Do Enter Password {string}")
    public void userDoEnterPassword(String passwordval) {
        driver.findElement(By.id("password")).sendKeys(passwordval, Keys.ENTER);
//        WebElement imagepath = driver.findElement(By.id("password"));
//        imagepath.sendKeys("");
    }

    @Then("Failed Notification")
    public void failedNotification() {
        driver.findElement(By.id("email_login_button")).isDisplayed();
        driver.close();
        driver.quit();
    }
}
