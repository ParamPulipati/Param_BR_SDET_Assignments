import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LogintoDashboardFour {

	static Properties property;	
	public static void main(String[] args) throws IOException, InterruptedException {
			
			String PropertiesfileLocation ="C:\\Users\\pulipatip\\eclipse-workspace\\SDET\\src\\main\\java\\SeleniumAssignments\\test data\\OrangeHRP.properties";
			FileInputStream fileLocation = new FileInputStream(PropertiesfileLocation);
			property = new Properties();
			property.load(fileLocation);
			System.setProperty("webdriver.chrome.driver", "C:/drivers/chrome/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			Thread.sleep(4000);
			driver.manage().window().maximize();
			String  uName = property.getProperty("username");
			String  passwd = property.getProperty("password");
			driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(uName);
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(passwd);
			driver.findElement(By.id("btnLogin")).click();
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/h1[1]")).isDisplayed();
		    System.out.println("Login to url is success");
			driver.close();
		}

}

	
	


