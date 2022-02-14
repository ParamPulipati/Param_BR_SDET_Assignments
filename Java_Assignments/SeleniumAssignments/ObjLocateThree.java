import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ObjLocateThree {

	public static void main(String[] args)  throws InterruptedException
			{
				
				System.setProperty("webdriver.chrome.driver", "C:/drivers/chrome/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/");
				Thread.sleep(4000);
				driver.manage().window().maximize();
		  		
				driver.findElement(By.xpath("//input[@id='txtUsername']"));
				driver.findElement(By.xpath("//input[@id='txtPassword']"));
				driver.findElement(By.linkText("Forgot your password?"));
				driver.findElement(By.xpath("//div[@id='divLogo']//child::img"));
				
				
				driver.findElement(By.cssSelector("input#txtUsername"));
				driver.findElement(By.cssSelector("input#txtPassword"));
				driver.findElement(By.linkText("Forgot your password?"));
				driver.findElement(By.xpath("//div[@id='divLogo']//child::img"));
				
		}

		}

		
