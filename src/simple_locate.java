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
		//百度页面元素定位
		/*String url="www.baidu.com";
		dr.get(url);
		Thread.sleep(3000);
		//by id
		dr.findElement(By.id("su1")).click();
		System.out.println("by id元素已点击");
		dr.navigate().back();
		//tagName
		Thread.sleep(3000);
		String divNum=dr.findElement(By.tagName("body")).getAttribute("div");
		System.out.println("tagname"+divNum);
		//by path
		
		//by linkText
		dr.findElement(By.linkText("搜索设置")).click();
		System.out.println("linkText元素已点击");
		//by cssSelector
		dr.findElement(By.cssSelector("input[type=\"button\"]")).click();
		 assertEquals("已经记录下您的使用偏好", closeAlertAndGetItsText());*/
		 File file=new File("src/form.html");
			String filePath="file:///"+file.getCanonicalPath();
			System.out.println("当前路径："+filePath);
			dr.get(filePath);
			Thread.sleep(6000);
			//by tagname
			String classOfForm=dr.findElement(By.tagName("form")).getAttribute("class");
			System.out.println("form下的class："+classOfForm);
			Thread.sleep(1000);
			//by id
			dr.findElement(By.id("inputEmail")).click();
			System.out.println("id 已经点击");
			Thread.sleep(1000);
			//by name
			dr.findElement(By.name("password"));
			System.out.println("name 已经dingwei");
			Thread.sleep(1000);
			// by linkText
			dr.findElement(By.linkText("register")).click();
			System.out.println("linkText 已经dingwei");
			Thread.sleep(1000);
			//by partial linkText
			dr.findElement(By.partialLinkText("reg")).click();
			System.out.println("partial linkText 已经dingwei");
			Thread.sleep(1000);
			//by xpath
			dr.findElement(By.xpath("/html/body/form/div[3]/div/label/input")).click();
			System.out.println("xpath 已经dingwei");
			Thread.sleep(1000);
			//by cssselector
			WebElement div =dr.findElement(By.cssSelector(".controls"));
			((JavascriptExecutor)dr).executeScript("$(arguments[0]).fadeOut().fadeIn()", div);
			System.out.println("cssselector 已经dingwei");
			
			
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
