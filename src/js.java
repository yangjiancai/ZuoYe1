import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class js {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "E:\\selenium\\ie driverServer\\2.exe");
		WebDriver dr=new InternetExplorerDriver();
		File file=new File("src/js.html");
		String filePath="file:///"+file.getAbsolutePath();
		System.out.print(filePath);
		dr.get(filePath);
		Thread.sleep(3000);
		((JavascriptExecutor)dr).executeScript("$('#tooltip').fadeOut();");
		WebElement js=dr.findElement(By.className("btn"));
		((JavascriptExecutor)dr).executeScript("$(arguments[0]).fadeOut();",js);
		Thread.sleep(1000);
		dr.quit();
	}

}
