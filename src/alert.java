import java.io.File;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class alert {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "E:\\selenium\\ie driverServer\\2.exe");
		WebDriver dr=new InternetExplorerDriver();
		File file=new File("src/alert.html");
		String filePath="file:///"+file.getAbsolutePath();
		System.out.println(filePath);
		dr.get(filePath);
		Thread.sleep(3000);
		dr.findElement(By.id("tooltip")).click();
		Alert alert=dr.switchTo().alert();
		//System.out.println(alert.getText());
		alert.accept();
		System.out.println("确认成功");
		dr.quit();
	}

}
