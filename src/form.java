import java.io.File;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class form {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "E:\\selenium\\ie driverServer\\2.exe");
		WebDriver dr=new InternetExplorerDriver();
		File file=new File("src/form1.html");
		String filePath="file:///"+file.getAbsolutePath();
		System.out.println(filePath);
		dr.get(filePath);
		Thread.sleep(3000);
		dr.findElement(By.className("checkbox")).click();
		System.out.println("checkbox�ɹ����");
		Thread.sleep(1000);
		dr.findElement(By.className("radio")).click();
		System.out.println("radio�ɹ����");
		Thread.sleep(1000);
		//optionѡ�����һ��ֵ
		List<WebElement> options=dr.findElement(By.tagName("select")).findElements(By.tagName("option"));
		options.get(options.size()-1).click();
		System.out.println("option���һ�ѡ��");
		dr.findElement(By.className("btn")).click();
		System.out.println("����ύ��ť");
		Alert alert=dr.switchTo().alert();
		//System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(1000);
		dr.quit();
	}

}
