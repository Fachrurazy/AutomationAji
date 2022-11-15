import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrasiAnggota {
    WebDriver driver = null;
    @Given("Membuka Browser")
    public void membukaBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fachrurazy Atijani\\IdeaProjects\\automation-bdd-google\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @And("Masuk kedalam menu Login")
    public void masukKedalamMenuLogin() throws InterruptedException {
        driver.get("https://motif-dev.fifgroup.co.id/#/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @When("Masukan Username {string}")
    public void masukanUsername(String usernamevalue) {
        driver.findElement(By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-invalid']")).sendKeys(usernamevalue);
    }

    @When("Masukan Password {string}")
    public void masukanPassword(String passwordvalue) {
        driver.findElement(By.id("userPassword")).sendKeys(passwordvalue);
    }

    @Then("Navigate ke menu Home Page")
    public void navigateKeMenuHomePage() throws InterruptedException {
        driver.findElement(By.xpath("//button[@class='btn btn-fif btn-block btn-flat']")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
    }

    @And("Masuk kedalam menu Registrasi Anggota")
    public void masukKedalamMenuRegistrasiAnggota() throws InterruptedException {
//        driver.get("https://motif-dev.fifgroup.co.id/#/anggota/register_anggota");
//        Thread.sleep(2000);
//        WebElement linktext = driver.findElement(By.xpath("//*[contains(text(),'REGISTRASI ANGGOTA')]"));
//        System.out.println("Ini dapat apa " + linktext.getText());
//        linktext.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[contains(text(),'REGISTRASI ANGGOTA')]")).click();
    }

    @And("Memilih Form")
    public void memilihForm() throws InterruptedException {
        driver.findElement(By.xpath("//button[@class='btn btn-fif']")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
    }

    @And("Memilih Mitra")
    public void memilihMitra() {
        driver.findElement(By.xpath("")).sendKeys(Keys.ENTER);
    }

    @When("Masukan Username Anggota {string}")
    public void masukanUsernameAnggota(String arg0) {
    }

    @When("Masukan Email Anggota {string}")
    public void masukanEmailAnggota(String arg0) {
    }

    @When("Masukan Password Anggota {string}")
    public void masukanPasswordAnggota(String arg0) {
    }

    @When("Masukan Verified Password Anggota {string}")
    public void masukanVerifiedPasswordAnggota(String arg0) {
    }

    @Then("Melakukan Kirim")
    public void melakukanKirim() {
    }
}
