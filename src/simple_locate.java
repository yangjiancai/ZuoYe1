import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.JavascriptExecutor;
public class simple_locate {
	public static void main(String[] args) throws  IOException, InterruptedException {
		System.setProperty("webdriver.ie.driver", "E:\\selenium\\ie driverServer\\2.exe");
		WebDriver dr=new InternetExplorerDriver();
		//�ٶ�ҳ��Ԫ�ض�λ
		/*String url="www.baidu.com";
		dr.get(url);
		Thread.sleep(3000);
		//by id
		dr.findElement(By.id("su1")).click();
		System.out.println("by idԪ���ѵ��");
		dr.navigate().back();
		//tagName
		Thread.sleep(3000);
		String divNum=dr.findElement(By.tagName("body")).getAttribute("div");
		System.out.println("tagname"+divNum);
		//by path
		
		//by linkText
		dr.findElement(By.linkText("��������")).click();
		System.out.println("linkTextԪ���ѵ��");
		//by cssSelector
		dr.findElement(By.cssSelector("input[type=\"button\"]")).click();
		 assertEquals("�Ѿ���¼������ʹ��ƫ��", closeAlertAndGetItsText());*/
		 File file=new File("src/form.html");
			String filePath="file:///"+file.getCanonicalPath();
			System.out.println("��ǰ·����"+filePath);
			dr.get(filePath);
			Thread.sleep(6000);
			//by tagname
			String classOfForm=dr.findElement(By.tagName("form")).getAttribute("class");
			System.out.println("form�µ�class��"+classOfForm);
			Thread.sleep(1000);
			//by id
			dr.findElement(By.id("inputEmail")).click();
			System.out.println("id �Ѿ����");
			Thread.sleep(1000);
			//by name
			dr.findElement(By.name("password"));
			System.out.println("name �Ѿ�dingwei");
			Thread.sleep(1000);
			// by linkText
			dr.findElement(By.linkText("register")).click();
			System.out.println("linkText �Ѿ�dingwei");
			Thread.sleep(1000);
			//by partial linkText
			dr.findElement(By.partialLinkText("reg")).click();
			System.out.println("partial linkText �Ѿ�dingwei");
			Thread.sleep(1000);
			//by xpath
			dr.findElement(By.xpath("/html/body/form/div[3]/div/label/input")).click();
			System.out.println("xpath �Ѿ�dingwei");
			Thread.sleep(1000);
			//by cssselector
			WebElement div =dr.findElement(By.cssSelector(".controls"));
			((JavascriptExecutor)dr).executeScript("$(arguments[0]).fadeOut().fadeIn()", div);
			System.out.println("cssselector �Ѿ�dingwei");
			
			
		dr.quit();
	}

	private static void assertEquals(String string,
			Object closeAlertAndGetItsText) {
		// TODO Auto-generated method stub
		
	}

	private static Object closeAlertAndGetItsText() {
		// TODO Auto-generated method stub
		return null;
	}
}
