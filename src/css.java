import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;
public class css {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "E:\\selenium\\ie driverServer\\2.exe");
		WebDriver dr=new InternetExplorerDriver();
		File file =new File("src/css.html");
		String filePath="file:///"+file.getAbsolutePath();
		System.out.println("µ±Ç°Â·¾¶£º"+filePath);
		dr.get(filePath);
		Thread.sleep(3000);
		WebElement link=dr.findElement(By.id("tooltip"));
		System.out.println(link.getCssValue("color"));
		System.out.println(dr.findElement(By.tagName("h3")).getCssValue("font"));
		Thread.sleep(1000);
		System.out.println("browser will be close");
		dr.quit(); 
	}

}
