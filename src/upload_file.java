import java.io.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class upload_file {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "E:\\selenium\\ie driverServer\\2.exe");
		WebDriver dr=new InternetExplorerDriver();
		File file=new File("src/upload_file.html");
		String filePath="file:///"+file.getAbsolutePath();
		dr.get(filePath);
		Thread.sleep(3000);
		dr.findElement(By.cssSelector("input[type=file]")).sendKeys("D:\\yjc\\ZuoYe1\\src\\navs.html");
		System.out.println("上传成功");
		dr.close();
	}

}
