package SeleniumAssignments;
import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.qa.pages.*;
public class TestListnereleventwelve extends TestBase
{
    public static WebDriver driver;
	ReadDashboardheaderTen readDboard;
	public static FileInputStream fileLocation;
	public static Properties property;
    @BeforeClass
	public void setUp() {

		try {
			fileLocation = new FileInputStream(System.getProperty("user.dir")+"\\ExecutionProperties\\Config.properties");
			property = new Properties();
			property.load(fileLocation);
		}catch(Exception e) {
			e.printStackTrace();
		}

		System.setProperty("webdriver.chrome.driver", "C:/drivers/chrome/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(property.getProperty("Url"));
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
    @Test(priority=2 , retryAnalyzer=com.qa.Listener.RetryAnalyzer.class)
    public void retrymethod() throws Exception
	{
        String DashBoardHeader = readDboard.getDashboardheaderText();
		boolean result = DashBoardHeader.equalsIgnoreCase("Dashbard");
		if(result)
		{
			Thread.sleep(4000);
			captureScreenshot(driver,"DashBoard_Passed");
			Assert.assertTrue(true); 
			Reporter.log("User is in Dashboard Menu", true);;
		}
		else
		{
			int i = 1; 
			captureScreenshot(driver,"DashBoard_Failed_Interation = "+ i);
			Assert.assertTrue(false); 
			Reporter.log("User is not in Dashboard Menu", true);
			i++;
		} 
	}
    @AfterSuite
	public void tearDown() {
		driver.quit();
	}


}
