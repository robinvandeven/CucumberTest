package bindings;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class test3 {

    @When("^I navigate to Schedule Maintenance$")
    public void i_navigate_to_Schedule_Maintenance()  {
//      Navigate to Schedule maintenance
        initializeDriver.driver.findElement(By.cssSelector("div#MainListView div.menuColumn > ul > li:nth-child(2) > span")).click();

    }

    @Then("^I add , run and remove a cleanup task for MSE$")
    public void i_add_run_and_remove_a_cleanup_task_for_MSE()  {
//      Create new schedule
        initializeDriver.driver.findElement(By.id("NewBtn")).click();

//      Select Mobile Shopping Environment from dropdown list
        initializeDriver.driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/form/div[2]/div[1]/div/div[1]/div[2]/div/div[1]/input")).click();
        try {
            Thread.sleep(1000);
            initializeDriver.driver.findElement(By.cssSelector("div.dijitPopup.dijitComboBoxMenuPopup > div > div:nth-child(2)")).click();
        }
        catch (Exception e){
            e.printStackTrace();
        }

//      Select Cleanup Task from Dropdown list
        try {
            Thread.sleep(1000);
            initializeDriver.driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/form/div[2]/div[1]/div/div[2]/div[2]/div/div[1]/input")).click();
            Thread.sleep(1000);
            initializeDriver.driver.findElement(By.cssSelector("div.dijitPopup.dijitComboBoxMenuPopup > div > div:nth-child(2)")).click();
        }
        catch (Exception e){
            e.printStackTrace();
        }



//      Enter computer name
        try {
            Thread.sleep(1000);
            initializeDriver.driver.findElement(By.name("Schedule.Computer")).sendKeys("RVV-LCL-SERVER");
        }
        catch (Exception e){
            e.printStackTrace();
        }

//      Click 'Enabled' checkbox
        initializeDriver.driver.findElement(By.name("Schedule.IsEnabled")).click();
//      Schedule it on workingdays
        initializeDriver.driver.findElement(By.name("Schedule.Monday")).click();
        initializeDriver.driver.findElement(By.name("Schedule.Tuesday")).click();
        initializeDriver.driver.findElement(By.name("Schedule.Wednesday")).click();
        initializeDriver.driver.findElement(By.name("Schedule.Thursday")).click();
        initializeDriver.driver.findElement(By.name("Schedule.Friday")).click();

//      On 12:00
        try {
            Thread.sleep(1000);

            initializeDriver.driver.findElement(By.name("Schedule.Minutes")).sendKeys("180");
    }
        catch (Exception e){
            e.printStackTrace();
        }


//      Save schedule
        initializeDriver.driver.findElement(By.id("SaveBtn")).click();

        WebElement tableContent = initializeDriver.driver.findElement(By.id("ScheduleDataGrid"));
        List<WebElement> scheduledTasks = tableContent.findElements(By.className("dgrid-row-table"));

        for (WebElement rows:scheduledTasks){
            System.out.println(rows);
            if (rows.findElement(By.tagName("Mobile Shopping Experience")).isDisplayed()&& rows.findElement(By.tagName("Cleanup task")).isDisplayed()){
                rows.findElement(By.tagName("Delete")).click();
                Assert.assertTrue(true);
                initializeDriver.driver.close();
            }


        }






    }









}
