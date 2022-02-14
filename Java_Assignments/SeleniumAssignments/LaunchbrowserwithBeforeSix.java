import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LaunchbrowserwithBeforeSix
{@Test
    public void beforeSuiteTest()
	{
	System.out.println("before Suite executes here");
	}
	@BeforeSuite
	public void before_suite_method() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:/drivers/chrome/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	Thread.sleep(4000);
	driver.manage().window().maximize();
	driver.close();
	}

}
