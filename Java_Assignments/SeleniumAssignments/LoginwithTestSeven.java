import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class LoginwithTestSeven{
    WebDriver driver;
	@BeforeTest()
	public void FirstTest() {
		try {
		System.setProperty("webdriver.chrome.driver", "C:/drivers/chrome/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	@Test(priority=1)
	public void SecondTest() {
		String  uName = "Admin";
		String  passwd = "admin123";
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(uName);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(passwd);
		driver.findElement(By.id("btnLogin")).click();
	}
	@AfterTest()
	public void Logout(){
	System.out.println("Logging out");
	driver.quit();
	}

}
