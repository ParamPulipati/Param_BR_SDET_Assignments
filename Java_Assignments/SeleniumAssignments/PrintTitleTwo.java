import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PrintTitleTwo {

	public static void main(String[] args)  throws InterruptedException
			{
				
				System.setProperty("webdriver.chrome.driver", "C:/drivers/chrome/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/");
				Thread.sleep(4000);
				driver.manage().window().maximize();
		  		System.out.println("opened url in chrome browser");
		  		String title = driver.getTitle();
		  		System.out.println("Title of the page is : " + title);
		 		driver.close();
			}

		}
