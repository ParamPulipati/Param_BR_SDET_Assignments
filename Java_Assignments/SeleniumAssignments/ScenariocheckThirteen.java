import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class ScenariocheckThirteen {

	public static Properties property; 
	public static FileInputStream fileLocation;
	WebDriver driver;
	@BeforeTest()
	public void BrowserOpen() throws InterruptedException {
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
	public void Search() throws InterruptedException
	{
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.xpath("//input[@id='empsearch_employee_name_empName']")).sendKeys("Linda Anderson");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
		Thread.sleep(4000);
	}
	
	@Test(priority=3)
	public void TakeScreenshot() throws Exception
	{
		takeSnapShot(driver,"C:\\Users\pulipatip\\eclipse-workspace\SDET\\test-output\\Search.png");
	}
	@AfterTest
	public void logout()
	{
		driver.quit();
	}
	
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File(fileWithPath);

		FileUtils.copyFile(SrcFile, DestFile);

		}

}
