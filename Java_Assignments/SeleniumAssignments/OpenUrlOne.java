import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenUrlOne {

	public static void main(String[] args)  throws InterruptedException
			{
				
				System.setProperty("webdriver.chrome.driver", "C:/drivers/chrome/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/");
				Thread.sleep(4000);
				driver.manage().window().maximize();
		  		System.out.println("opened url in chrome browser");
		 		driver.close();
			}

		}


