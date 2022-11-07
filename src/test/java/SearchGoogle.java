import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchGoogle {
    WebDriver driver;
    @Given("I Open browser")
    public void iOpenBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fachrurazy Atijani\\IdeaProjects\\automation-bdd-google\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @And("Open website Google")
    public void openWebsiteGoogle() throws InterruptedException {
        driver.get("https://www.google.co.id/");
        Thread.sleep(1000);
    }

    @And("Located on google website")
    public void locatedOnGoogleWebsite() {
        driver.findElement(By.name("btnK")).isDisplayed();
    }

    @When("I search {string}")
    public void iSearch(String searchValue) {
        driver.findElement(By.name("q")).sendKeys(searchValue, Keys.ENTER);
    }

    @Then("Showing result related with {string}")
    public void showingResultRelatedWith(String arg0) {
        driver.findElement(By.xpath("//a[@href='https://id.linkedin.com/in/andreasmanik']")).isDisplayed();
        String urlLinkedin = driver.findElement(By.xpath("//a[@href='https://id.linkedin.com/in/andreasmanik']")).getText();
        System.out.println(urlLinkedin);
        driver.close();
        driver.quit();
    }
}
