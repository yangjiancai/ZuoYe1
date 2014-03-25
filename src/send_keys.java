import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class send_keys {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "E:\\selenium\\ie driverServer\\2.exe");
		WebDriver dr=new InternetExplorerDriver();
		File file=new File("src/send_keys.html");
		String filePath="file:///"+file.getAbsolutePath();
		System.out.println("当前路径："+filePath);
		dr.get(filePath);
		Thread.sleep(3000);
		dr.findElement(By.id("A")).sendKeys(Keys.chord(Keys.CONTROL+"a"));
		Thread.sleep(1000);
		dr.findElement(By.id("A")).sendKeys(Keys.chord(Keys.CONTROL+"x"));
		dr.findElement(By.id("B")).sendKeys(Keys.chord(Keys.CONTROL+"v"));
		dr.findElement(By.id("A")).sendKeys("watir webdriver is better than selenium webdriver");
		Thread.sleep(1000);
		System.out.println("即将关闭浏览器");
		dr.quit();
	}

}
