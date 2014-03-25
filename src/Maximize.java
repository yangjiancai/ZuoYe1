import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class Maximize {
	public static void main (String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.ie.driver", "E:\\selenium\\ie driverServer\\2.exe");
		WebDriver dr=new InternetExplorerDriver();
		Thread.sleep(3000);
		dr.manage().window().maximize();
		Thread.sleep(3000);
		dr.quit();
	}
}
//InterruptedException