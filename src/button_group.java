import java.io.File;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class button_group {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "E:\\selenium\\ie driverServer\\2.exe");
		WebDriver dr=new InternetExplorerDriver();
		File file=new File("src/button_group.html");
		String filePath="File:///"+file.getAbsolutePath();
		System.out.println("当前路径："+filePath);
		dr.get(filePath);
		Thread.sleep(3000);
		List<WebElement> btns=dr.findElement(By.className("btn-group")).findElements(By.className("btn"));
		for(WebElement btn:btns ){
			if(btn.getText().equals("second")){
				btn.click();
				break;
			}
		}
		System.out.println("即将关闭刘拉起");
		dr.quit();
	}

}
