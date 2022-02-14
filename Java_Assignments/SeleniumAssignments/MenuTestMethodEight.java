import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.qa.pages.*;
public class MenuTestMethodEight
{
    static WebDriver driver ;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/drivers/chrome/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		try {
			String uName = "Admin";
			String passwd = "admin123";
			driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(uName);
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(passwd);
			driver.findElement(By.id("btnLogin")).click();
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		driver.findElement(By.linkText("Admin"));
		Thread.sleep(4000);
		String adm = Admin();
		System.out.println(adm);
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
		Thread.sleep(4000);
		String strPIM = PIM();
		System.out.println(strPIM);
		driver.findElement(By.id("menu_dashboard_index")).click();
		Thread.sleep(4000);
		String Dashboard = LeaveDashBoard();
		System.out.println(Dashboard);
		driver.findElement(By.id("menu_directory_viewDirectory")).click();
		Thread.sleep(4000);
		String path = Directory();
		System.out.println(path);
		driver.findElement(By.id("menu_maintenance_purgeEmployee")).click();
		Thread.sleep(4000);
		String MPage= Maintanence();
		System.out.println(MPage);
}
	public static String Admin() {
		String stradm = driver.findElement(By.id("menu_admin_UserManagement")).getText();
		return stradm;
	}

	public static String PIM() {
		String str_PIM = driver.findElement(By.id("menu_pim_viewEmployeeList")).getText();
		return str_PIM;
	}

	public static String LeaveDashBoard() {
		String strdash = driver.findElement(By.id("menu_dashboard_index")).getText();
		return strdash;
	}

	public static String Directory() {
		String strdir = driver.findElement(By.id("menu_directory_viewDirectory")).getText();
		return strdir;
	}

	public static String Maintanence() {
		String strmain = driver.findElement(By.id("menu_maintenance_purgeEmployee")).getText();
		return strmain;
	}

}
