import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class level_locate {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.ie.driver", "E:\\selenium\\ie driverServer\\2.exe");
		WebDriver dr=new InternetExplorerDriver();
		File file=new File("src/level_locate.html");
		String filePath="File:///"+file.getAbsolutePath();
		System.out.println("µ±Ç°file£º"+filePath);
		dr.get(filePath);
		Thread.sleep(5000);
		dr.findElement(By.linkText("Link1")).click();
		(new WebDriverWait(dr,20)).until(new ExpectedCondition<Boolean>(){
			public Boolean apply(WebDriver d){
				return d.findElement(By.id("dropdown1")).isDisplayed();
			}
		});
		WebElement menu=dr.findElement(By.id("dropdown1")).findElement(By.linkText("Another action"));
		(new Actions(dr)).moveToElement(menu).perform();
		Thread.sleep(1000);
		System.out.println("¹Ø±Õä¯ÀÀÆ÷");
		dr.quit();
	}
}
