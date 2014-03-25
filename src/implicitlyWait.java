import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class implicitlyWait {

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
		System.out.println("页面加载超时");
		dr.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
		dr.findElement(By.id("tooltip")).click();
		System.out.println("定位元素超时");
		dr.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		dr.close();
	}

}
