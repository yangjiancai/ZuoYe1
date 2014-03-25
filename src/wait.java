import java.io.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


public class wait {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "E:\\selenium\\ie driverServer\\2.exe");
		WebDriver dr=new InternetExplorerDriver();
		File file =new File("src/wait.html");
		String filePath="file:///"+file.getAbsolutePath();
		dr.get(filePath);
		Thread.sleep(3000);
		dr.findElement(By.id("btn")).click();
		(new WebDriverWait(dr,20)).until(new ExpectedCondition<Boolean>(){
			public Boolean apply(WebDriver d){
				return d.findElement(By.className("label")).isDisplayed();
			}
		});
		Thread.sleep(1000);
		dr.quit();
	}

}
