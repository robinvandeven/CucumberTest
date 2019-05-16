package bindings;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import java.io.File;
import java.net.URL;
import java.sql.*;
import java.util.List;


public class InstallApplication {

    WebDriver driver = initializeDriver.driver;
    WiniumDriver winiumDriver;
    File file;
    String currentApplicationFile = "";



    @When("^I want to install the new application package$")
    public void i_want_to_install_the_new_application_package(List<List<String>> arg1) throws Throwable {
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[1]/ul[2]/li[2]/span")).click();
        driver.findElement(By.id("NewBtn_label")).click();
        driver.findElement(By.cssSelector("div#tijit\\2f layout\\2f layoutview_column_1 div.dijitInline.tijitFileInputInner")).click();

//      Get current application package as a String
        String path = arg1.get(1).get(3);
        file = new File(path);
        String[] fileList = file.list();
        for(String currentFile:fileList){
            currentApplicationFile = currentFile;
        }

//      Initialize WiniumDriver in order to handle Windows File Explorer Pop-up
        System.setProperty("webdriver.winium.driver.desktop", "C:\\Winium.Desktop.Driver\\Winium.Desktop.Driver.exe");
        DesktopOptions options = new DesktopOptions();
        options.setApplicationPath("C:\\Windows\\explorer.exe");
        options.setDebugConnectToRunningApp(true);
        winiumDriver = new WiniumDriver(new URL("http://localhost:9999"), options);

//      Send concatenated String of path plus current package name in order to select the current Application Package
        Thread.sleep(7000);

        winiumDriver.findElement(By.id("1148")).sendKeys(path + currentApplicationFile);
        winiumDriver.findElement(By.id("1")).submit();

        driver.findElement(By.id("SaveBtn")).click();
        driver.findElement(By.id("InstalBbtn_label")).click();

        Assert.assertTrue(driver.findElement(By.id("button__confirmation_InstalBbtn")).isDisplayed());
        driver.findElement(By.xpath("//*[@id=\"dijit_form_Button_0_label\"]")).click();
    }


    @Then("^I want to validate the installed application version$")
    public void i_want_to_validate_the_installed_application_version(List<List<String>> arg1) throws Throwable {
       Thread.sleep(180000);
        try{
//          Create new database connection
            Connection dbConnection = DriverManager.getConnection(
                    "jdbc:sqlserver://RVV-LCL-SERVER;DatabaseName=WEBAPP_FRAMEWORK", "tta", "T3ris@pp");

//          Execute query to search for the installed version of MSE
            Statement dbStatement = dbConnection.createStatement();
            String applicationName = arg1.get(1).get(2);
            String query = "SELECT [VERSION] FROM [WEBAPP_FRAMEWORK].[dbo].[WEBAPP_APPLICATION] WHERE APPLICATION_NAME = '" + applicationName + "'";
            ResultSet queryResult = dbStatement.executeQuery(query);
            queryResult.next();

//          Check whether installed version is the most recent version
            Assert.assertTrue(this.currentApplicationFile.contains(queryResult.getString("VERSION")));
        }
        catch (SQLException se){
            se.printStackTrace();
        }
        finally {
            driver.close();
        }

    }


}
