import java.io.File;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.JavascriptExecutor;

public class find_element {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.ie.driver", "E:\\selenium\\ie driverServer\\2.exe");
		WebDriver dr=new InternetExplorerDriver();
		File file=new File("src/checkbox.html");
		String filePath="file:///"+file.getAbsolutePath();
		System.out.println("当前路径："+filePath);
		dr.get(filePath);
		Thread.sleep(4000);
		// 选择所有的checkbox并全部勾上
		List<WebElement> checkboxes=dr.findElements(By.cssSelector("input[type=checkbox]"));
		for(WebElement checkbox:checkboxes){
			checkbox.click();
		}
		
		dr.navigate().refresh();
		System.out.print(checkboxes.size());
		// 选择页面上所有的input，然后从中过滤出所有的checkbox并勾选之
		List<WebElement> inputs=dr.findElements(By.tagName("input"));
		for(WebElement input:inputs){
			input.click();
		}
		// 把页面上最后1个checkbox的勾给去掉
		List<WebElement> allCheckboxes =dr.findElements(By.id("input[type=checkbox]"));
		allCheckboxes.get(allCheckboxes.size()-1).click();
		Thread.sleep(1000);
		System.out.println("浏览器将要关闭");
		Thread.sleep(3000);
		dr.quit();
	}
}
