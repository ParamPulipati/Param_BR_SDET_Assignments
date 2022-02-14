import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class CSSSelectorFourteen 
{

	public static Properties property; 
	public static FileInputStream fileLocation;
	WebDriver driver;

	@BeforeTest()
	public void OpenUrl() throws InterruptedException {
		try {
			fileLocation = new FileInputStream(System.getProperty("user.dir")+"\\ExecutionProperties\\Config.properties");
			property = new Properties();
			property.load(fileLocation);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.setProperty("webdriver.chrome.driver", "C:/drivers/chrome/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(property.getProperty("Url"));
		Thread.sleep(4000);
		driver.manage().window().maximize();

	}
	@Test(priority=1)
	public void Login() throws InterruptedException {

		String  uName = property.getProperty("username");
		String  passwd = property.getProperty("passwd");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(uName);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(passwd);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
	}
	
	@Test(priority=2,dependsOnMethods= {"Login"})
	public void CSSSelector() throws InterruptedException
	{
		String strtext;
		Boolean objPresent;
		objPresent= driver.findElement(By.cssSelector("#menu_pim_viewPimModule > b")).isDisplayed();
		Assert.assertTrue(objPresent);
		strtext=driver.findElement(By.cssSelector("#menu_pim_viewPimModule > b")).getText();
		Reporter.log("PIM text is displaying as:'" + strtext +"'", true);
		Thread.sleep(3000);
		objPresent= driver.findElement(By.cssSelector("#menu_time_viewTimeModule > b")).isDisplayed();
		Assert.assertTrue(objPresent);
		strtext=driver.findElement(By.cssSelector("#menu_time_viewTimeModule > b")).getText();
		Reporter.log("Time text is displaying as :'" + strtext +"'", true);
		Thread.sleep(3000);
		objPresent= driver.findElement(By.cssSelector("#menu_maintenance_purgeEmployee > b")).isDisplayed();
		Assert.assertTrue(objPresent);
		strtext=driver.findElement(By.cssSelector("#menu_maintenance_purgeEmployee > b")).getText();
		Reporter.log("Maintanence text is displaying as :'" + strtext +"'", true);
		Thread.sleep(3000);
		objPresent= driver.findElement(By.cssSelector("#dashboard-quick-launch-panel-menu_holder > table > tbody > tr > td:nth-child(1) > div")).isDisplayed();
		Assert.assertTrue(objPresent);
		strtext=driver.findElement(By.cssSelector("#dashboard-quick-launch-panel-menu_holder > table > tbody > tr > td:nth-child(1) > div")).getText();
		Reporter.log("Assign Leave text is displaying as :'" + strtext +"'", true);
		Thread.sleep(3000);
		objPresent= driver.findElement(By.cssSelector("#dashboard-quick-launch-panel-menu_holder > table > tbody > tr > td:nth-child(3) > div")).isDisplayed();
		Assert.assertTrue(objPresent);
		strtext=driver.findElement(By.cssSelector("#dashboard-quick-launch-panel-menu_holder > table > tbody > tr > td:nth-child(3) > div")).getText();
		Reporter.log("Timesheet text is displaying as :'" + strtext +"'", true);
		Thread.sleep(3000);
		objPresent= driver.findElement(By.cssSelector("#div_graph_display_emp_distribution > canvas:nth-child(2)")).isDisplayed();
		Assert.assertTrue(objPresent);
		strtext=driver.findElement(By.cssSelector("#panel_resizable_1_0 > legend")).getText();
		Reporter.log("Timesheet text is displaying as :'" + strtext +"'", true);
	}
	
	@AfterTest()
	public void strtext()
	{
		driver.quit();
	}

}
