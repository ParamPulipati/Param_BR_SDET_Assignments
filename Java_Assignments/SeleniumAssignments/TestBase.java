package SeleniumAssignments;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class TestBase {

	public static WebDriver driver;
	public static FileInputStream fileLocation;
	public static Properties property;
	//
	//
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
		driver.get(prop.getProperty("Url"));

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}


	public static void captureScreenshot(WebDriver webdriver,String fileWithPath) throws Exception{

		//Convert web driver object to TakeScreenshot

		TakesScreenshot scrShot =((TakesScreenshot)webdriver);

		//Call getScreenshotAs method to create image file

		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

		//Move image file to new destination

		File DestFile=new File(fileWithPath);

		//Copy file at destination

		FileUtils.copyFile(SrcFile, DestFile);

	}
}