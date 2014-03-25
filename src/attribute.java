import java.io.File;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class attribute {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "E:\\selenium\\ie driverServer\\2.exe");
		WebDriver dr=new InternetExplorerDriver();
		File file=new File("src/attribute.html");
		String filepath="file:///"+file.getAbsolutePath();
		System.out.println(filepath);
		dr.get(filepath);
		Thread.sleep(3000);
		WebElement link=dr.findElement(By.id("tooltip"));
		System.out.println(link.getAttribute("data-original-title"));
		System.out.print("ÎÄ±¾£º"+link.getText());
		System.out.println("close Browse");
		dr.quit();
	}

}
