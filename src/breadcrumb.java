import java.io.File;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class breadcrumb {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "E:\\selenium\\ie driverServer\\2.exe");
		WebDriver dr=new InternetExplorerDriver();
		File file=new File("src/breadcrumb.html");
		String filepath="file:///"+file.getAbsolutePath();
		System.out.println(filepath);
		dr.get(filepath);
		Thread.sleep(3000);
		List<WebElement> all=dr.findElement(By.className("span3")).findElements(By.tagName("a"));
		for(WebElement all1:all){
			System.out.println(all1.getText());
		}
		WebElement e=dr.findElement(By.className("span3")).findElement(By.className("active"));
		System.out.println(e.getText());
		System.out.println("¹Ø±Õ");
		dr.quit();
	}

}
