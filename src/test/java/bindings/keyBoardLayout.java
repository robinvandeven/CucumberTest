package bindings;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class keyBoardLayout {
    int sleepTime = 1000;
    WebDriver driver = initializeDriver.driver;
    List<WebElement> menuKeys = new ArrayList<>();
    int posMenuCounter = 1;





    @Given("^I log in on the central storeMate Online environment$")
    public void i_log_in_on_the_central_storeMate_Online_environment(List<List<String>> arg1)  {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://10.186.71.225/WebApp/WEBAPP/Home/Home/Logon?returnUrl=/WebApp/WEBAPP/Home/Home/Menu");
        driver.findElement(By.name("UserName")).sendKeys(arg1.get(1).get(0));
        driver.findElement(By.name("Password")).sendKeys(arg1.get(1).get(1));
        driver.findElement(By.id("SubmitBtn")).click();

    }



    @When("^I navigate to POS Keyboard maintenance$")
    public void i_navigate_to_POS_Keyboard_maintenance()  {
    if(driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[1]/div[1]/div")).isDisplayed()){
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[1]/div[1]/div")).click();
        try{
            explicitWait("id", "ApplicationSelectMenuItem_9");
//          Use for 10.186.71.225
            driver.findElement(By.id("ApplicationSelectMenuItem_9")).click();
//          Use for 10.186.71.222
//          driver.findElement(By.id("ApplicationSelectMenuItem_8")).click();



            explicitWait("xpath", "/html/body/div[1]/div[2]/div/div/div[2]/ul/li[8]/span");
            driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[2]/ul/li[8]/span")).click();
        }
        catch (Exception e){
            e.printStackTrace();
            Assert.fail();
        }

    }
    else {
        driver.findElement(By.id("TilePOC")).click();
    }


    }

    @When("^I create a new keyboard layout$")
    public void i_create_a_new_keyboard_layout()  {
//        Click on the "New" button
        try{
            explicitWait("id", "NewBtn");
            driver.findElement(By.id("NewBtn")).click();
        }
        catch (Exception e){
            e.printStackTrace();
            Assert.fail();
        }

    }

    @Then("^the keyboard uses colour scheme ([^\"]*) and font scheme ([^\"]*)$")
    public void the_keyboard_uses_colour_scheme_and_font_scheme(String arg1, String arg2, List<List<String>> arg3)  {

        createNewKeyboard(arg3);

        findKeyboard(arg3);

        assignRandomColourAndTextSize();

        findKeyboard(arg3);

        try {

//          Click the "Edit layout" button
            Thread.sleep(sleepTime);
            driver.findElement(By.id("editLayoutBtn")).click();


            switch (arg3.get(0).get(0)) {



                case "Large Touch":

//                  Currently on the "MENU KEYS" tab, wanting to assign random POS functions to all KEYS
//                  Store the menu keys in a List
                    try {
                        for (int l = 0; l < 8; l++) {
                            menuKeys.add(driver.findElement(By.id("Keypad_6e0b7b07-ce09-4455-908c-38e8b3a4fcd2_btn_" + l)));
                        }
//                  Loop through the list, and assign random POS functions to them
                        assignRandomPosFunctions();


//                   Switch to "NUMERIC KEYS" tab, assign random POS functions to all KEYS
                        Thread.sleep(sleepTime);
                        driver.findElement(By.name("keyboardTabControl_tablist_KeyPadTab1")).click();
                        {
//                  Store the menu keys in a List, after clearing the List
                            menuKeys.clear();
                            for (int i = 0; i < 16; i++) {
                                menuKeys.add(driver.findElement(By.id("Keypad_0441a249-2a04-4bb1-b56d-ab64790388bc_btn_" + i)));
                            }
//                  Loop through the list, and assign random POS functions to them
                            assignRandomPosFunctions();
                        }


//                  Switch to "Transaction" tab, assign random POS functions to all KEYS
                        explicitWait("name", "keyboardTabControl_tablist_KeyPadTab2");
                        driver.findElement(By.name("keyboardTabControl_tablist_KeyPadTab2")).click();
                        {
//                  Store the menu keys in a List, after clearing the List
                            menuKeys.clear();
                            for (int i = 0; i < 24; i++) {
                                menuKeys.add(driver.findElement(By.id("Keypad_fafe9644-ed2d-45b0-8913-a6bd117779e1_btn_" + i)));
                            }
//                  Loop through the list, and assign random POS functions to them
                            assignRandomPosFunctions();
                        }


//                  Switch to "Registration" tab, assign random POS functions to all KEYS
                        explicitWait("name", "keyboardTabControl_tablist_KeyPadTab3");
                        driver.findElement(By.name("keyboardTabControl_tablist_KeyPadTab3")).click();
                        {
//                  Store the menu keys in a List, after clearing the List
                            menuKeys.clear();
                            for (int i = 0; i < 24; i++) {
                                menuKeys.add(driver.findElement(By.id("Keypad_86d216bc-b3b8-4774-b59d-658bf06f03ad_btn_" + i)));
                            }
//                  Loop through the list, and assign random POS functions to them
                            assignRandomPosFunctions();
                        }


//                  Switch to "Payment" tab, assign random POS functions to all KEYS
                        explicitWait("nanme", "keyboardTabControl_tablist_KeyPadTab4");
                        driver.findElement(By.name("keyboardTabControl_tablist_KeyPadTab4")).click();
                        {
//                  Store the menu keys in a List, after clearing the List
                            menuKeys.clear();
                            for (int i = 0; i < 24; i++) {
                                menuKeys.add(driver.findElement(By.id("Keypad_736a7cc5-2b7a-4718-b93c-c46858539d61_btn_" + i)));
                            }
//                  Loop through the list, and assign random POS functions to them
                            assignRandomPosFunctions();
                        }


//                  Switch to "Extra" tab, assign random POS functions to all KEYS
                        explicitWait("name", "keyboardTabControl_tablist_KeyPadTab5");
                        driver.findElement(By.name("keyboardTabControl_tablist_KeyPadTab5")).click();
                        {
//                  Store the menu keys in a List, after clearing the List
                            menuKeys.clear();
                            for (int i = 0; i < 24; i++) {
                                menuKeys.add(driver.findElement(By.id("Keypad_efcba9ca-2304-470d-9265-eaaa37f14036_btn_" + i)));
                            }
//                  Loop through the list, and assign random POS functions to them
                            assignRandomPosFunctions();
                            save();
                            swithToOverview();
                            break;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }



                case "Touch Alphanumeric":
                    try{
//                      Store the menu keys in a List
                        for (int i = 0; i < 43; i++) {
                            menuKeys.add(driver.findElement(By.id("Keypad_58f8e6b4-119d-47b5-b6f0-c0e39535c98e_btn_" + i)));
                        }
//                      Loop through the list, and assign random POS functions to them
                        assignRandomPosFunctions();
                        save();
                        swithToOverview();
                        break;

                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }



                case "Touch image presets (4x5)":
                    try{
//                      Store the menu keys in a List
                        for (int i = 0; i < 19; i++) {
                            menuKeys.add(driver.findElement(By.id("Keypad_3b089254-52f1-4543-bbe0-3e8a7b470b13_btn_" + i)));
                        }
//                      Loop through the list, and assign random POS functions to them
                        assignRandomPosFunctions();
                        save();
                        swithToOverview();
                        break;
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }



                case "Touch image presets (5x6)":
                    try {
//                      Store the menu keys in a List
                        for (int i = 0; i < 29; i++) {
                            menuKeys.add(driver.findElement(By.id("Keypad_d2221380-a1f4-49d1-91ee-4e6b3fce0db3_btn_" + i)));
                        }
//              Loop through the list, and assign random POS functions to them
                        assignRandomPosFunctions();
                        save();
                        swithToOverview();
                        break;
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }



                case "Touch image presets (6x7)":
                    try{
//                      Store the menu keys in a List
                        for (int i = 0; i < 41; i++) {
                            menuKeys.add(driver.findElement(By.id("Keypad_9d0cd58c-bed0-4516-81c5-5ddc5556a4b5_btn_" + i)));
                        }
//                       Loop through the list, and assign random POS functions to them
                        assignRandomPosFunctions();
                        save();
                        swithToOverview();
                        break;

                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }

                    default:
                        Assert.fail();


            }
        }
        catch (Exception e) {
        e.printStackTrace();
        Assert.fail();
    }

    }



//    Methods




    public void swithToOverview(){
//      Select "Overview" button
        explicitWait("id", "overview");
        driver.findElement(By.id("overview")).click();
        driver.close();
    }


    public void save(){
//       Select "Save" button
        explicitWait("id", "SaveBtn");
        driver.findElement(By.id("SaveBtn")).click();
    }


    public void implicitWait(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }




    public void explicitWait(String by, String identifier){
        try {
            WebDriverWait wait = new WebDriverWait(driver, 20, 20);
            switch (by){
                case "xpath":
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(identifier)));
                    break;

                case "id":
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.id(identifier)));
                    break;

                case "name":
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.name(identifier)));
                    break;

                case "cssSelector":
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(identifier)));
                    break;

                case "className":
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.className(identifier)));
                    break;
            }

        }
        catch (org.openqa.selenium.NoSuchElementException e){
            e.printStackTrace();
        }
    }





    public void assignRandomPosFunctions(){
        try {
        for(int i=0; i<menuKeys.size(); i++) {
            Thread.sleep(sleepTime);
            menuKeys.get(i).click();

//          Click "Edit" field inside menu key
            menuKeys.get(i).findElement(By.xpath("/html/body/div[1]/div[2]/div/form/div[3]/div/div[3]/div/div[3]/div[" + posMenuCounter + "]/div/div/div/div[" + (i + 1) + "]/div[4]")).click();



//          Switch to iframe within pop-up
            driver.switchTo().frame("dialogFrameEditDialog");



            driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div/div[1]/div/div[2]/div/div[1]/input")).click();
            List<WebElement> posFunctions = new ArrayList<>();
            for (int j = 2; j< 122; j++) {
                posFunctions.add(driver.findElement(By.cssSelector("div.dijitPopup.dijitComboBoxMenuPopup > div > div:nth-child(" + j + ")")));
            }

            Random posFunction = new Random();
//          Select a random POS function from that List
            WebElement selectedPosfunction = posFunctions.get(posFunction.nextInt(posFunctions.size()));
//          Store the Text of the POS function in a String
            String posFunctionText = selectedPosfunction.getText();
            selectedPosfunction.click();


            if (driver.findElements(By.id("_lbl_3201")).size() != 0 && !posFunctionText.equals("Macro")) {
                    if (driver.findElements(By.xpath("/html/body/div[1]/div/div/form/div/div[1]/div[2]/div[2]/div/div[1]")).size() != 0 && driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div/div[1]/div[2]/div[2]/div/div[1]")).isDisplayed() && !posFunctionText.equals("Scale item lookup")) {
                        driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div/div[1]/div[2]/div[2]/div/div[1]/input")).click();
                        implicitWait();
                        List<WebElement> parameters = driver.findElements(By.cssSelector("div.dijitPopup.dijitComboBoxMenuPopup > div > div:nth-child(2)"));
                        Random parameter = new Random();
                        WebElement selectedParameter = parameters.get(parameter.nextInt(parameters.size()));
                        selectedParameter.click();
                    }
                    else if(posFunctionText.equals("Scale item lookup")){
                         implicitWait();
                         driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div/div[1]/div[2]/div[2]/div/div/div/span/div/div[2]/input")).sendKeys("1");
                        }
                    else if (posFunctionText.equals("Item lookup by category") || posFunctionText.equals("EAN preset")){
                        implicitWait();
                        driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div/div[1]/div[2]/div[2]/div/div/div/span/div/div[2]/input")).sendKeys("0100");
                    }
//                    else if(posFunctionText.equals("Item lookup by category")){
//                        implicitWait();
//                    driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div/div[1]/div[2]/div[2]/div/div/div/span/div/div[2]/input")).sendKeys("0101");
//                    }
                    else {
                        implicitWait();
                        driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div/div/div[2]/div[2]/div/div[2]/input")).sendKeys("1");
                    }
                }



//          Type the POS function Text in the 'Button text" field
            driver.findElement(By.name("SelectedButton.Description0")).sendKeys(posFunctionText);
            driver.switchTo().parentFrame();



//          Click on the "ok" button
            driver.findElement(By.xpath("//*[@id=\"EditDialog\"]/div[2]/div[2]/span[1]")).click();
        }
           posMenuCounter++;
    }
        catch (Exception e){
            e.printStackTrace();
            Assert.fail();
        }
    }








    public void createNewKeyboard(List<List<String>> arg3) {
        try {

//          Switch to the iframe within the pop-up
            explicitWait("name", "dialogFrameposKeyboardDetails");
            driver.switchTo().frame("dialogFrameposKeyboardDetails");
//          Enter a description
            explicitWait("name", "NewKeyboard.Description0");
            driver.findElement(By.name("NewKeyboard.Description0")).sendKeys("AutoTest " + arg3.get(0).get(0) + " " + arg3.get(0).get(1) + " " + arg3.get(0).get(2));
//          Click on the arrow symbol of the "Keyboard type" dropdown menu
            explicitWait("xpath", "/html/body/div[1]/div/form/div/div/div[5]/div[2]/div/div[1]/input");
            driver.findElement(By.xpath("/html/body/div[1]/div/form/div/div/div[5]/div[2]/div/div[1]/input")).click();
            driver.switchTo().activeElement();
//          Select the keyboard type defined in the scenario
            implicitWait();
            driver.findElement(By.xpath("//*[contains(text(),'"+ arg3.get(0).get(0) + "')]")).click();

        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }


        if (arg3.get(0).get(0).contains("Touch")) {
//          Click on the arrow symbol of the "Colour scheme" dropdown menu
            explicitWait("xpath", "/html/body/div[1]/div/form/div/div[2]/div[1]/div[2]/div/div[1]/input");
            driver.findElement(By.xpath("/html/body/div[1]/div/form/div/div[2]/div[1]/div[2]/div/div[1]/input")).click();
//          Select the colour scheme defined in the scenario
                if ((arg3.get(0).get(1)).equals("TCx Elevate FO colour scheme")) {
                    driver.findElement(By.cssSelector("div:nth-child(3) > div > div:nth-child(2)")).click();
                } else if ((arg3.get(0).get(1)).equals("storeMate FO colour scheme")) {
                    driver.findElement(By.cssSelector("div:nth-child(3) > div > div:nth-child(3)")).click();
                }
            }


        try {
//          Click on the arrow symbol of the "Font scheme" dropdown menu
            explicitWait("xpath", "/html/body/div[1]/div/form/div/div[2]/div[2]/div[2]/div/div[1]/input");
            driver.findElement(By.xpath("/html/body/div[1]/div/form/div/div[2]/div[2]/div[2]/div/div[1]/input")).click();
            driver.switchTo().activeElement();
//          Select the font scheme defined in the scenario
            if ((arg3.get(0).get(2)).equals("Arial")) {
                explicitWait("cssSelector", "div:nth-child(4) > div > div:nth-child(2)");
                driver.findElement(By.cssSelector("div:nth-child(4) > div > div:nth-child(2)")).click();
            } else if ((arg3.get(0).get(2)).equals("Open Sans")) {
                explicitWait("cssSelector", "div:nth-child(4) > div > div:nth-child(3)");
                driver.findElement(By.cssSelector("div:nth-child(4) > div > div:nth-child(3)")).click();
            }

//          Leave the iframe
            driver.switchTo().parentFrame();
//          Click on the "ok" button
            explicitWait("xpath", "//*[@id=\"posKeyboardDetails\"]/div[2]/div[2]/span[1]");
            driver.findElement(By.xpath("//*[@id=\"posKeyboardDetails\"]/div[2]/div[2]/span[1]")).click();



        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }







    public void findKeyboard(List<List<String>> arg3){
        try{
//      Store the table cells on the POS KEYBOARD MAINTENANCE homepage in a List of WebElements
    explicitWait("id", "KeyboardGrid");
    Assert.assertTrue(driver.findElement(By.id("KeyboardGrid")).isDisplayed());

    String testName = "AutoTest " + arg3.get(0).get(0) + " " + arg3.get(0).get(1) + " " + arg3.get(0).get(2);

    Thread.sleep(sleepTime);
    driver.findElement(By.id("RefreshBtn")).click();

    explicitWait("id", "KeyboardGrid");
    Assert.assertTrue(driver.findElement(By.id("KeyboardGrid")).isDisplayed());


        List<WebElement> cells = driver.findElements(By.tagName("td"));

//          Search for the created keyboard type, by looping through the descriptions
          for (int j=0; j<cells.size(); j++){
              System.out.println(cells.get(j).getText());

              if (cells.get(j).getText().contains("AutoTest")) {
//                   when the created keyboard type is found, it is selected
                    implicitWait();
                    cells.get(j).click();

                    System.out.println("Found it!");

                    break;
                }
                else {
                    System.out.println("Dit not find it");
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
            Assert.fail();
        }

    }






    public void assignRandomColourAndTextSize() {
        try {
//          Click on the arrow of the "Default colour" dropdown list
            Thread.sleep(sleepTime);
            driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/form/div[3]/div/div[3]/div/div[2]/div[11]/div[2]/span/span/span/span[3]")).click();
            explicitWait("className", "dijitPaletteTable");
            Assert.assertTrue(driver.findElement(By.className("dijitPaletteTable")).isDisplayed());
//          Store all colours in a List
            List<WebElement> colours = driver.findElements(By.className("dijitPaletteCell"));
            Random colour = new Random();
//          Select a random colour
            colours.get(colour.nextInt(colours.size())).click();
//          Click on the arrow of the "Default text size" dropdown list
            explicitWait("xpath", "/html/body/div[1]/div[2]/div/form/div[3]/div/div[3]/div/div[2]/div[12]/div[2]/div/div[1]");
            driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/form/div[3]/div/div[3]/div/div[2]/div[12]/div[2]/div/div[1]")).click();
            explicitWait("cssSelector", "div.dijitPopup.dijitComboBoxMenuPopup > div");
            Assert.assertTrue(driver.findElement(By.cssSelector("div.dijitPopup.dijitComboBoxMenuPopup > div")).isDisplayed());
//          Store all text sizes in a List
            List<WebElement> textSizes = new ArrayList<>();
            for (int l = 2; l < 6; l++) {
                textSizes.add(driver.findElement(By.cssSelector("div.dijitPopup.dijitComboBoxMenuPopup > div > div:nth-child(" + l + ")")));
            }
            Random textSize = new Random();
            implicitWait();
//          Select a random text size
            textSizes.get(textSize.nextInt(textSizes.size())).click();

//          Click the "save" button
            save();
        }
        catch (Exception e){
            e.printStackTrace();
            Assert.fail();
        }
    }
}
