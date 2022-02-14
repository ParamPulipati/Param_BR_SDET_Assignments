import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ReadDashboardheaderTen{
static Properties property;
	public static void main(String[] args) throws InterruptedException  {
		String PropertiesFileLocation ="C:\\Users\pulipatip\\eclipse-workspace\SDET\\src\\main\\java\\SeleniumAssignments\\test data\\OrageHRP.properties";
		try 
		{
			FileInputStream fileLocation = new FileInputStream(PropertiesFileLocation);
			property = new Properties();
			property.load(fileLocation);
		}
		catch (IOException ie)
		{
			System.out.println(ie.toString());
		}
		System.setProperty("webdriver.chrome.driver", "C:/drivers/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		getDashboardheaderText()
		
		
		driver.quit();
	}
	
	public String getDashboardheaderText(){
	try {
			String  uName = property.getProperty("username");
			String  passwd = property.getProperty("password");
			driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(uName);
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(passwd);
			driver.findElement(By.id("btnLogin")).click();
			driver.findElement(By.linkText("Dashboard")).click();
			String strtext = driver.findElement(By.xpath("//div[@class='head']//child::h1")).getText();
			System.out.println("Dashboard header is :"+strtext);
			return strtext
		}

		catch(Exception e){
			System.out.println(e.toString());
		}
	}
}
