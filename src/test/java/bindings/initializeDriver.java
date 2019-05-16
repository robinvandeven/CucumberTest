package bindings;


import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class initializeDriver {

    public static WebDriver driver;

    @Given("^I log in on my local storeMate Online environment$")
    public void i_log_in_on_my_local_storeMate_Online_environment(List<List<String>> arg1) throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://10.186.71.105/WebApp/WEBAPP/Home/Home/Logon?returnUrl=/WebApp/WEBAPP/Home/Home/Menu");
        driver.findElement(By.name("UserName")).sendKeys(arg1.get(1).get(0));
        driver.findElement(By.name("Password")).sendKeys(arg1.get(1).get(1));
        driver.findElement(By.id("SubmitBtn")).click();
    }


}
