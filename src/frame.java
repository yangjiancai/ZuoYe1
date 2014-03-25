import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.io.*;
import org.openqa.selenium.WebElement;

public class frame {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "E:\\selenium\\ie driverServer\\2.exe");
		WebDriver dr=new InternetExplorerDriver();
		File file=new File("src/frame.html");
		String filePath="file:///"+file.getAbsolutePath();
		dr.get(filePath);
		Thread.sleep(3000);
		//dr.findElement(By.id("btn")).click();
		//从f1跳到f2
		dr.switchTo().frame("f1");
		dr.switchTo().frame("f2");
		WebElement e=dr.findElement(By.id("kw1"));
		e.click();
		e.sendKeys("hello");
		System.out.println("已成功从f1跳到f2,并输入内容");
		Thread.sleep(1000);
		//跳到当前默认地址
		dr.switchTo().defaultContent();
		System.out.println("已成功跳到默认页面");
		//再到f1
		dr.switchTo().frame("f1");
		dr.findElement(By.linkText("click")).click();
		System.out.println("已成功跳到f1");
		Thread.sleep(1000);
		System.out.println("close Browse");
		dr.quit();
	}

}
