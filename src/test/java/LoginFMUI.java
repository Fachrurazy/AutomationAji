import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFMUI {
    WebDriver driver = null;
    @Given("Open browser")
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fachrurazy Atijani\\IdeaProjects\\automation-bdd-google\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @And("Open Login Page FMUI")
    public void openLoginPageFMUI() throws InterruptedException {
        driver.get("https://motif-dev.fifgroup.co.id/#/");
        Thread.sleep(3000);
    }

    @When("User Enter Username {string}")
    public void userEnterUsername(String searchValue) {
        driver.findElement(By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-invalid']")).sendKeys(searchValue);
    }

    @When("User Enter Password {string}")
    public void userEnterPassword(String searchValue) {
        driver.findElement(By.id("userPassword")).sendKeys(searchValue);
    }

    @Then("User Navigated to Home Page")
    public void userNavigatedToHomePage() throws InterruptedException {
        driver.findElement(By.xpath("//button[@class='btn btn-fif btn-block btn-flat']")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
    }
}
