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
public class XPathSelectorFifteen {

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
		Thread.sleep(4000);
	}
	
	@Test(priority=2,dependsOnMethods= {"Login"})
	public void XPathSelector() throws InterruptedException
	{
		String strtext;
		Boolean objPresent;
		objPresent= driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).isDisplayed();
		Assert.assertTrue(objPresent);
		strtext=driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).getText();
		Reporter.log("Admin Tab text is displaying as:'" + strtext +"'", true);
		
		Thread.sleep(3000);
		objPresent= driver.findElement(By.xpath("//input[@id='MP_link']")).isDisplayed();
		Assert.assertTrue(objPresent);
		strtext=driver.findElement(By.xpath("//input[@id='MP_link']")).getAttribute("value");
		Reporter.log("MarketPlace object text is displaying as :'" + strtext +"'", true);
		
		Thread.sleep(3000);	
		objPresent= driver.findElement(By.xpath("//a[@id='welcome']")).isDisplayed();
		Assert.assertTrue(objPresent);
		strtext=driver.findElement(By.xpath("//a[@id='welcome']")).getText();
		Reporter.log("Welcome Admin object text is displaying as :'" + strtext +"'", true);
		
		Thread.sleep(3000);
		objPresent= driver.findElement(By.xpath("//span[text()='Leave List']/parent::a/parent::div")).isDisplayed();
		Assert.assertTrue(objPresent);
		strtext=driver.findElement(By.xpath("//span[text()='Leave List']/parent::a/parent::div")).getText();
		Reporter.log("Leaves List object text is displaying as :'" + strtext +"'", true);
	}
	
	@AfterTest()
	public void driverquit()
	{
		driver.quit();
	}
}

