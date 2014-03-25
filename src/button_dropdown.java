import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class button_dropdown {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//¥À∂Œ¥˙¬Î «’’–¥
		System.setProperty("webdriver.ie.driver", "E:\\selenium\\ie driverServer\\2.exe");
		WebDriver dr=new InternetExplorerDriver();
		File file=new File("src/navs.html");
		String filepath="file:///"+file.getAbsolutePath();
		System.out.println(filepath);
		dr.get(filepath);
		Thread.sleep(3000);
		dr.findElement(By.linkText("Info")).click();
		(new WebDriverWait (dr,20)).until(new ExpectedCondition<Boolean>(){
			public Boolean apply(WebDriver d){
				return d.findElement(By.className("dropdown-menu")).isDisplayed();
			}
		});
		dr.findElement(By.className("dropdown-menu")).findElement(By.linkText("watir-webdriver")).click();
		Thread.sleep(1000);
		dr.quit();
	}

}
