package com.broadridge.te.step_definitions.common;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.cucumber.java.en.When;
import org.jetbrains.annotations.NotNull;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import static com.broadridge.ui_tester.webdriver.ContainerUtil.whenBrowserIsLaunchedAndUrlEntered;
import static com.broadridge.ui_tester.webdriver.ContainerUtil.whenBrowserIsMaximised;
import static com.broadridge.ui_tester.webdriver.PredicatesUtil.waitUntilPageLoadsCompletes;

public class Cucumbersixteentoeighteen {
    WebDriver driver;

    @Given("I am in OrangeHRP Application")
    public void InOrangeApp(@NotNull String aUrl) throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(4000);
        driver.manage().window().maximize();

    }

    @When("Login to Application")
    public void LoginApp(@NotNull String aUrl) throws Exception {
        String uName = "Admin";
        String passwd = "admin123";
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(uName);
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(passwd);
        driver.findElement(By.id("btnLogin")).click();

    }

    @Then("Dashboard page is available")
    public void Dashboard(@NotNull String aUrl) throws Exception {
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/h1[1]")).isDisplayed();
        System.out.println("Dashboard available");

    }

    @And("click on Admin menu")
    public void AdminMenu(@NotNull String aUrl) throws Exception {
        driver.findElement(By.linkText("Admin")).click();
        Thread.sleep(4000);
    }

    @And("click on PIM menu")
    public void PIMMenu(@NotNull String aUrl) throws Exception {
        driver.findElement(By.linkText("PIM")).click();
        Thread.sleep(4000);
    }

    @And("Close the Application")
    public void CloseApp(@NotNull String aUrl) throws Exception {
        driver.quit();
    }

    @When("I click on Admin Link")
    public void AdminLink(@NotNull String aUrl) throws Exception {
        driver.findElement(By.linkText("Admin")).click();
        Thread.sleep(4000);
    }

    @Then("Click on Job")
    public void Jobclick(@NotNull String aUrl) throws Exception {
        driver.findElement(By.linkText("Job")).click();
        Thread.sleep(4000);
    }

    @And("validate text Job Title")
    public void Validatejobtitle(@NotNull String aUrl) throws Exception {
        String strtext;
        Boolean objPresent;
        driver.findElement(By.linkText("Job")).click();
        objPresent= driver.findElement(By.xpath("//a[@id='Job']")).isDisplayed();
        Assert.assertTrue(objPresent);
        strtext=driver.findElement(By.xpath("//a[@id='Job']")).getText();
        Reporter.log("Admin Tab text is displaying as:'" + strtext +"'", true);
    }

    @Given("I am logged into Orange Application")
    public void Background(@NotNull String aUrl) throws Exception
    {
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chrome/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(4000);
        driver.manage().window().maximize();
        String  uName = "Admin";
        String  passwd = "admin123";
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(uName);
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(passwd);
        driver.findElement(By.id("btnLogin")).click();
    }
}