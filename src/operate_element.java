import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class operate_element {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.ie.driver", "E:\\selenium\\ie driverServer\\2.exe");
		WebDriver dr=new InternetExplorerDriver();
		String url="www.baidu.com";
		dr.get(url);
		Thread.sleep(1000);
		WebElement e=dr.findElement(By.id("kw1"));
		e.click();
		e.sendKeys("hello");
		e.clear();
		dr.quit();
	}
}
