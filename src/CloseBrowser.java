import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class CloseBrowser {
	public static void main (String []args){
		System.setProperty("webdriver.ie.driver", "E:\\selenium\\ie driverServer\\2.exe");
	WebDriver dr=new InternetExplorerDriver();
	dr.quit();
}
}