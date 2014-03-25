import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class TitleAndUrl {
	public static void main (String []args)throws InterruptedException {
		System.setProperty("webdriver.ie.driver", "E:\\selenium\\ie driverServer\\2.exe");
		WebDriver driver=new InternetExplorerDriver();
		String url="www.baidu.com";
		driver.get(url);
		System.out.println("进入百度页面");
		Thread.sleep(3000);
		System.out.println("当前标题："+driver.getTitle());
		System.out.println("当前URL："+driver.getCurrentUrl());
		System.out.println("关闭浏览器");
		driver.quit();
	}
}
//InterruptedException 