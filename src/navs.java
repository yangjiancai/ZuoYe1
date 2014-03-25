import java.io.File;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class navs {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "E:\\selenium\\ie driverServer\\2.exe");
		WebDriver dr=new InternetExplorerDriver();
		File file=new File("src/navs.html");
		String filePath=file.getAbsolutePath();
		dr.get(filePath);
		Thread.sleep(3000);
		dr.findElement(By.className("span3")).findElement(By.linkText("Home")).click();
		System.out.println("1");
		Thread.sleep(1000);
		dr.findElement(By.linkText("Home")).click();
		System.out.println("close browser");
		dr.quit();
	}

}
